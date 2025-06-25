
public class DephtFirstSearch{

    private boolean[] marked;
    private int[] edgeTo;
    private int count;

    public DephtFirstSearch(AdjacentyListIntGraphDirigido G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        count = 0;
        dfs(G, s);
    }

    public DephtFirstSearch(AdjacentyListIntGraph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        count = 0;
        dfs(G, s);
    }

    private void dfs(AdjacentyListIntGraphDirigido G, int v){
        marked[v] = true;
        for (int w : G.adj(v)) {
            if(marked[w] != true){
                count++;
                edgeTo[w] = v;
                dfs(G, w);
            } 
        }
    }

    private void dfs(AdjacentyListIntGraph G, int v){
        marked[v] = true;
        for (int w : G.adj(v)) {
            if(marked[w] != true){
                count++;
                edgeTo[w] = v;
                dfs(G, v);
            }
        }
    }
}