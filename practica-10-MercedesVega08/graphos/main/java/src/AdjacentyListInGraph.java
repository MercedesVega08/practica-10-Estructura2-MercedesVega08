import java.util.LinkedList;
import java.util.List;

public class AdjacentyListInGraph implements InterfaceGraph {
    
    //Cantidad de nodos en el grafo
    private final int V;
    //Cantidad de aristas en el grafo
    private int E;
    //Arreglo de adyacencia
    private List<Integer>[] adj;

    /**
     * @pre El nodo V no puede ser negativo
     * @post Construye una nueva Lista de adyacencia del grafo no dirigido
     */
    public AdjacentyListInGraph(int V){
        if(V < 0) throw new IllegalArgumentException();

        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        for(int v = 0; v < V; v++)
            adj[v] = new LinkedList<Integer>();
    }

    /**
     * @post Retorna la cantidad de nodos en un grafo
     */
    public int V(){
        return V;
    }

    /**
     * @post Retorna la cantidad de aristas de un grafo
     */
    public int E(){
        return E;
    }

    /**
     * @pre Los nodos pasados no pueden ser negativos ni ser mayors a V
     * @post Anhade una nueva arista al grafo
     */
    public void addEdge(int v, int w){
        if(v < 0 || V >= v ) throw new IllegalArgumentException();
        if(w < 0 || V >= w ) throw new IllegalArgumentException();

        E++;
        adj[v].add(w);
        adj[w].add(v);
    }

    /**
     * @pre el nodo no puede ser negativo ni ser mayor a V
     * @post Retorna la lista de adyacencia del nodo pasado como parametro
     */
    public List<Integer> adj(int v){
        if(v < 0 || V >= v) throw new IllegalArgumentException();

        return adj[v];
    }
}
