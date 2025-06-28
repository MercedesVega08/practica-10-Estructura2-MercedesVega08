
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import adjacentyList2.*;

public class AdyacentyMatrixBinaryGraph{
    
    private final int V;
    private int E;
    private int[][] adj;

    public AdyacentyMatrixBinaryGraph(int V){
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
        if(v < 0 || v >= V*V) throw new IllegalArgumentException();
        if(w < 0 || w >= V*V) throw new IllegalArgumentException();

        adj[v][w] = 1;
        E++;
    }

    public List<Integer> adj(int v){
        if(v < 0 || v > V) throw new IllegalArgumentException();

        AdjacentyListIntGraph list = new AdjacentyListIntGraph(V());
        for(int m = 0; m < V; m++){
            if(v == m && adj[v][m] == 1)
                list.addEdgeDirigido(v, m);
            else
                if(adj[v][m] == 1 && adj[m][v] != 1)
                    list.addEdgeDirigido(v, m);
                else 
                    if(adj[v][m] == 1 && adj[m][v] == 1)
                        list.addEdgeNoDirigido(v, m);
        }
        return list.adj(v);
    }

    public String toString(){
        String print = "[";
        for(int i = 0; i < V*V; i++){
            for(int j = 0; j < V*V; j++){
                print += "[" + adj[i][j] + "]";
            }
            if(i == (V*V)-1)
                print += "]" + "\n";
            print += "\n";
        }
        print += "[";

        for(int i = 0; i < V; i++){
            print += i + ":" + adj(i);
            if(i == V-1)
                print += "]";
            else
                print += ", ";
        }
        return print;
    }
}
