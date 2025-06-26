import queue.*;

public class BreadthFirstSearch{

    private boolean[] marked;
    private int[] edgeTo;

    public BreadthFirstSearch(AdjacentyListIntGraph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        bfs(G, s);
    }

    private void bfs(AdjacentyListIntGraph G, int v){
        marked[v] = true;
        Queue<Integer> queue = new CircularQueue<>();
        queue.enqueue(v);
        while(!queue.isEmpty()){
            int s = queue.dequeue();
            for(int w : G.adj(v)){
                if(marked[w] != true){
                    marked[w] = true;
                    edgeTo[w] = s;
                    queue.enqueue(w);
                }
            }
        }
    }
}