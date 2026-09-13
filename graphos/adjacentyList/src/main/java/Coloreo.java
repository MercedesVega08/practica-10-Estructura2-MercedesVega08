import java.util.List;
import java.util.LinkedList;

public class Coloreo{

    private AdjacentyListIntGraph grafo;

    private List<Tuplas<Integer, String>> coloreado;

    private boolean[] marked;

    public Coloreo(AdjacentyListIntGraph grafo){
        this.grafo = grafo;
        coloreado = new LinkedList<>();
        marked = new boolean[grafo.V()];
    }

    public List<Tuplas<Integer, String>> coloreo(String[] colores){
        Tuplas<Integer, String> grafoColor;

        for(int i = 0; i < grafo.V(); i++){
            for (int g : grafo.adj(i)) {
                for(int j = 0; j < colores.length; j++){
                    if(!marked[g]){
                        grafoColor = new Tuplas<Integer,String>(g, colores[j]);
                        coloreado.add(grafoColor);
                        marked[g] = true;
                    }
                }
            }
        }
        
        return coloreado;
    }

    public String toString(){
        String print = "[";

        for(int i = 0; i < coloreado.size(); i++)
            print += coloreado.get(i).toString();

        print += "]";

        return print;
    }
}