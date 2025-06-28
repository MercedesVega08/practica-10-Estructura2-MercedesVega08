import adjacentyList2.*;

public class MatrixMain {
    
    public static void main(String[] args){
        AdyacentyMatrixBinaryGraph graphito = new AdyacentyMatrixBinaryGraph(6);
        graphito.addEdge(0, 1);
        graphito.addEdge(0, 2);
        graphito.addEdge(0, 4);
        graphito.addEdge(0, 5);
        graphito.addEdge(1, 2);
        graphito.addEdge(1, 3);
        graphito.addEdge(1, 5);
        graphito.addEdge(2, 1);
        graphito.addEdge(2, 2);
        graphito.addEdge(2, 4);
        graphito.addEdge(3, 1);
        graphito.addEdge(3, 2);
        graphito.addEdge(3, 4);
        graphito.addEdge(4, 0);
        graphito.addEdge(4, 2);
        graphito.addEdge(4, 4);
        graphito.addEdge(5, 0);
        graphito.addEdge(5, 2);
        graphito.addEdge(5, 5);
        System.out.println("Aristas: " + graphito.E());
        System.out.println("Vertices: " + graphito.V());
        System.out.println(graphito.toString());
        //System.out.println(graphito);
        
    }

}
