package adjacentyList;
import java.util.List;

public interface InterfaceGraph {
    
    public int V();

    public int E();

    public void addEdge(int v, int w);

    public List<Integer> adj(int v);
}
