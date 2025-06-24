import java.util.ArrayList;
import java.util.List;
import adjacentyList.*;
import java.util.LinkedList;

public class AdyacentyMatrixGraphDirigido{
    
    private final int V;
    private int E;
    private int[][] adj;

    public AdyacentyMatrixGraphDirigido(int V){
        this.V = V;
        E = 0;
        adj = new int[V*V][V*V];
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v, int w){
        if(v < 0 || v >= V) throw new IllegalArgumentException();
        if(w < 0 || w >= V) throw new IllegalArgumentException();

        adj[v][w] = 1;
        E++;
    }

    public List<Integer> adj(int v){
        if(v < 0 || v > V) throw new IllegalArgumentException();

        AdjacentyListInGraphDirigido list = new AdjacentyListInGraphDirigido(v);
        for(int m = 0; m < V(); m++){    
            if(adj[v][m] == 1)
                list.addEdge(v, m);
        }
        return list.adj(v);
    }

    public void print(int v) {
        for(int i=0; i<(V*V); i++){
            for(int j=0; j<(V*V); j++){
                System.out.print("["+adj[i][j]+"]");
            } System.out.println();
        }

       // for(int i = 0; i < V(); i++){
         //   for(int j = i; j < V(); j++)
                System.out.println("[" + adj(v) + "]");
            //System.out.println();
        //}
    }

    public static void main(String[] args) {
        AdyacentyMatrixGraphDirigido graphito = new AdyacentyMatrixGraphDirigido(5);
        graphito.addEdge(0, 0);
        graphito.addEdge(0, 1);
        graphito.addEdge(0, 3);
        graphito.addEdge(0, 4);
        graphito.addEdge(1, 3);
        graphito.addEdge(2, 0);
        graphito.addEdge(2, 2);
        graphito.addEdge(2, 3);
        graphito.addEdge(3, 0);
        graphito.addEdge(3, 1);
        graphito.addEdge(3, 2);
        graphito.addEdge(3, 4);
        graphito.addEdge(4, 1);
        graphito.addEdge(4, 4);
        System.out.println("Aristas: " + graphito.E());
        System.out.println("Vertices: " + graphito.V());
        graphito.print(0);
    }
}
