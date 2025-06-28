
public class AdjacentyMain{
    
    public static void main(String[] args){
        AdjacentyListIntGraph graphito = new AdjacentyListIntGraph(6);
        graphito.addEdgeDirigido(0, 3);
        graphito.addEdgeDirigido(0, 5);
        graphito.addEdgeDirigido(1, 4);
        graphito.addEdgeDirigido(2, 0);
        graphito.addEdgeDirigido(2, 5);
        graphito.addEdgeDirigido(3, 1);
        graphito.addEdgeDirigido(4, 2);
        graphito.addEdgeDirigido(5,4);
        System.out.println("Vertices: " + graphito.V());
        System.out.println("Aristas: " + graphito.E());
        System.out.println(graphito.toString());
        DephtFirstSearch control = new DephtFirstSearch(graphito, 0);
        System.out.println("Es conexo: " + control.isConexoFuerte(graphito));
        System.out.println(control.toString());
        System.out.println("Count: " + control.getCount());
    }
}