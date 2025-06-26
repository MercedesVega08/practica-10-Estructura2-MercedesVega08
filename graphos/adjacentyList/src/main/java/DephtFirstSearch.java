
public class DephtFirstSearch{

    private boolean[] marked;
    private int[] edgeTo;
    private int count;

    public DephtFirstSearch(AdjacentyListIntGraph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        count = 0;
        dfs(G, s);
    }

    public int getCount(){
        return count;
    }

    private void dfs(AdjacentyListIntGraph G, int v){
        marked[v] = true;
        for (int w : G.adj(v)) {
            if(marked[w] != true){
                count++;
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public boolean isConexo(AdjacentyListIntGraph G){
           
       // for(int w = 0; w < G.V(); w++){
         //   dfs(G, w);
        //}
        if(getCount() == G.V())
            return true;

        return false;
    }
}