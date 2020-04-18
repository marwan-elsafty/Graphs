public class DijkstraShortestPath extends Graph{
    int e;//no of edges
    int[][] weight;

    public DijkstraShortestPath(int v, int e){
        super(v);
        weight = new int[v+1][v+1];
    }

    private void relax(int u, int v, int w){
        if( vertex[u].distance + w < vertex[v].distance){
            vertex[v].distance = vertex[u].distance + w;
            vertex[v].parent = vertex[u];
        }
    }

    public void dijkstra(int start){
        initialize();
        vertex[start].extracted=true;
        vertex[start].distance = 0;
        int u = start;
        while(u!=-1){
            for(Vertex ver : vertex[u].adj){
                relax(u,ver.data,weight[u][ver.data]);
            }
            u = extractMin();
        }

    }

    private void initialize(){
        for(int i = 0; i<v; i++){
            vertex[i].distance = Integer.MAX_VALUE;
        }
    }

    public void addEdge(int u, int v, int w){//directed
        vertex[u].adj.add(vertex[v]);
        weight[u][v] = w;
    }

    private int extractMin(){
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<v; i++){
            if(!vertex[i].extracted && vertex[i].distance<min){
                index = i;
                min = vertex[i].distance;
            }
        }
        if(index!=-1)
            vertex[index].extracted = true;
        return index;
    }


}
