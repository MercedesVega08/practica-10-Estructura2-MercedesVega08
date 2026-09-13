
public class AdjacentyMain{
    
    public static void main(String[] args){
        AdjacentyListIntGraph graphito = new AdjacentyListIntGraph(3);
        graphito.addEdgeNoDirigido(0, 1);
        graphito.addEdgeNoDirigido(1, 2);
        graphito.addEdgeNoDirigido(2, 0);
        System.out.println("Vertices: " + graphito.V());
        System.out.println("Aristas: " + graphito.E());
        System.out.println(graphito.toString());
        DephtFirstSearch control = new DephtFirstSearch(graphito, 0);
        System.out.println("Es conexo: " + control.isConexoFuerte(graphito));
        System.out.println(control.toString());
        System.out.println("Count: " + control.getCount());

        Coloreo color = new Coloreo(graphito);
        String[] colores = {"Rojo", "Verde"};
        color.coloreo(colores);
        System.out.println(color.toString());
    }
}