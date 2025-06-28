import java.util.List;

public interface InterfaceGraph {
    
    public int V();

    public int E();

    public void addEdgeDirigido(int v, int w);

    public void addEdgeNoDirigido(int v, int w);

    public List<Integer> adj(int v);

    public String toString();
}
