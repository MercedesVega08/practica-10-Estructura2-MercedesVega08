
public class DephtFirstSearch{

    private boolean[] marked;
    private int[] edgeTo;
    private int count;
    private boolean[] isConexo;

    public DephtFirstSearch(AdjacentyListIntGraph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        isConexo = new boolean[G.V()];
        count = 0;
        dfs(G, s);
    }

    public int getCount(){
        return count;
    }

    private void dfs(AdjacentyListIntGraph G, int v){
        count++;
        marked[v] = true;
        for (int w : G.adj(v)) {
            if(marked[w] != true){
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public boolean isConexoDebil(AdjacentyListIntGraph G){
           
        if(getCount() == G.V())
            return true;

        return false;
    }

    public boolean isConexoFuerte(AdjacentyListIntGraph G){
        int cantTrue = 0;
        for(int i = 0; i < G.V(); i++){
            count = 0;
            marked = new boolean[G.V()];
            edgeTo = new int[G.V()];
            dfs(G, i);
            if(count == G.V())
                cantTrue++;
        }
        return (cantTrue == G.V());
    }

    public String toString(){
        String print = "[";
        for(int i = 0; i < edgeTo.length; i++){
            print += edgeTo[i] + "]";
        }
        print += "Count: " + getCount();
        return print;
    }
}