
public class DephtMain {
    
    public static void main(String[] args){
        AdjacentyListIntGraph graphito = new AdjacentyListIntGraph(6);
        graphito.addEdgeDirigido(0, 3);
        graphito.addEdgeDirigido(0, 5);
        graphito.addEdgeDirigido(1, 4);
        graphito.addEdgeDirigido(2, 0);
        graphito.addEdgeDirigido(2, 5);
        graphito.addEdgeDirigido(3, 1);
        graphito.addEdgeDirigido(4, 2);
        graphito.addEdgeDirigido(5, 4);
        DephtFirstSearch control = new DephtFirstSearch(graphito, 0);
        System.out.println(control.toString());
    } 
}
