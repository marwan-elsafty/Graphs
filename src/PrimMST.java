
public class PrimMST extends Graph{
    //total cost
    private int cost;
    //contains the smallest weight to each vertex
    private int[] key;
    //To prevent loops
    private int[] included;


    public PrimMST(int v) {
        super(v);
        cost = 0;
        key = new int[v];
        for(int i = 0; i<v; i++)	key[i] = Integer.MAX_VALUE;
        included = new int[v];
    }

    //Extracts the smallest vertex with the smallest weight
    int extractMin(){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<v;i++){
            if(included[i]==0 && key[i]<min){
                min = key[i];
                index=i;
            }
        }
        return index;
    }

    void Prim(int[][] weight, int start){
        key[start]=0;
        vertex[start].parent=null;
        int u = extractMin();
        while(u!=-1){
            cost+=key[u];
            System.out.println("Weight: "+key[u]);

            for(Vertex ver:vertex[u].adj){
                if(included[ver.data]==0 && weight[u][ver.data]<key[ver.data]){
                    ver.parent=vertex[u];
                    key[ver.data]=weight[u][ver.data];
                }
            }
            included[u]=1;
            u=extractMin();
        }
        System.out.println("Cost: "+cost);
    }


}

