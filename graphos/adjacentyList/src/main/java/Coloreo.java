import java.util.List;
import java.util.LinkedList;

import queue.*;

public class Coloreo{

    private AdjacentyListIntGraph grafo;

    private List<Tuplas<Integer, String>> coloreado;

    private boolean[] marked;

    private int[] colorProhibido;

    public Coloreo(AdjacentyListIntGraph grafo){
        this.grafo = grafo;
        coloreado = new LinkedList<>();
        marked = new boolean[grafo.V()];
    }

    public List<Tuplas<Integer, String>> coloreo(String[] colores){
        colorProhibido = new int[colores.length];
        try {
            recursivo(colores, 0, 0);
            System.out.println("Coloreo exitosso");
        } catch (IllegalArgumentException e) {
            System.out.println("Fallo en el coloreo: " + e.getMessage());
        } finally{
            System.out.println("Proceso de prueba finalizado");
        }
        return coloreado;
    }

    

    private void recursivo(String[] colores, int inicio, int indexColor){
        if(colores.length == 0) throw new  IllegalArgumentException();

        if(inicio < 0 || inicio >= grafo.V()) throw new IllegalArgumentException();

        if(indexColor < 0 || indexColor >= colores.length) throw new IllegalArgumentException();

        marked[inicio] = true;
        int colorElegido = -1;

        for(int i = 0; i < colores.length; i++){
            boolean colorLibre = true;

            for(int w : grafo.adj(inicio)){
               if(marked[w] && colorProhibido[w] == i){
                    colorLibre = false;
                    break;
               }
            }

            if(colorLibre){
                colorElegido = i;
                break;
            }
        }

        if(colorElegido == -1) 
            throw new IllegalArgumentException("Con la cantidad de colores brindados esimposible colorear el grafo");

        coloreado.add(new Tuplas<Integer,String>(inicio, colores[colorElegido]));
        colorProhibido[inicio] = colorElegido;

        for(int w: grafo.adj(inicio)){
           if(!marked[w]){
                recursivo(colores, w, colorElegido);
           }
        }
    }

    public String toString(){
        String print = "[";

        for(int i = 0; i < coloreado.size(); i++)
            print += coloreado.get(i).toString();

        print += "]";

        return print;
    }
}