import java.util.List;
import java.util.LinkedList;

//final = constante
public class AdjacentyListIntGraph implements InterfaceGraph{
    
    //Numero del nodo
    private final int V;
    //NUmero de arista
    private int E;
    //Lista de adyacencia del grafo
    private List<Integer> adj[];

    public AdjacentyListIntGraph(int V){
        if(V < 0) throw new IllegalArgumentException();

        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        for(int v = 0; v < V; v++)
            adj[v] = new LinkedList<Integer>();
    }


    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdgeDirigido(int v, int w){
        if(v < 0 || V <= v ) throw new IllegalArgumentException();
        if(w < 0 || V <= w) throw new IllegalArgumentException();

        E++;
        adj[v].add(w);
        
    }

    public void addEdgeNoDirigido(int v, int w){
        if(v < 0 || v >= V) throw new IllegalArgumentException();
        if(w < 0 || v >= V) throw new IllegalArgumentException();

        E++;
        adj[v].add(w);
        adj[w].add(v);
    }

    public List<Integer> adj(int v){
        if(v < 0 || V <= v) throw new IllegalArgumentException();

        return adj[v];
    }

    public String toString(){
        String print = "[";
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
