
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

    public void dfs(AdjacentyListIntGraph G, int v){
        if(v < 0 || v >= G.V()) throw new IllegalArgumentException();
        count++;
        marked[v] = true;
        for (int w : G.adj(v)) {
            if(marked[w] == false){
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
        int i = 0;
        while( i < G.V()){
            count = 0;
            marked = new boolean[G.V()];
            edgeTo = new int[G.V()];
            dfs(G, i);
            toString();
            if(getCount() == G.V()){
                cantTrue++;
            }
            i++;
        }
        return (cantTrue == G.V());
    }

    public String toString(){
        String print = "[";
        for(int i = 0; i < edgeTo.length; i++){
            print += "[" + edgeTo[i] + "]";
        }
        print += "]";
        return print;
    }
}