
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
        System.out.println("Count: " + count);
        count++;
        marked[v] = true;
        System.out.println("marked: " + marked[v]);
        for (int w : G.adj(v)) {
            System.out.println("w: " + w);
            if(marked[w] == false){
                System.out.println("w:" + w);
                edgeTo[w] = v;
                dfs(G, w);
                System.out.println("Count final: " + count);
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
            System.out.println(count);
            marked = new boolean[G.V()];
            edgeTo = new int[G.V()];
            dfs(G, i);
            toString();
            if(getCount() == G.V()){
                cantTrue++;
            }
            i++;
            System.out.println("CantTrue: " + cantTrue);
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