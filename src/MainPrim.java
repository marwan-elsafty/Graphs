import java.util.Scanner;

public class MainPrim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] weight = new int[v][v];
        PrimMST g = new PrimMST(v);
        for(int i = 0; i<e; i++){
            int a = sc.nextInt(), b = sc.nextInt(), w = sc.nextInt();
            weight[a][b]=w;
            weight[b][a]=w;
            g.addEdge(a, b);
        }
        int start = 0;
        g.Prim(weight,start);
        sc.close();
    }
}
