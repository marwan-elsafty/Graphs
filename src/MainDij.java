import java.util.Scanner;

public class MainDij {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();//no vertex
        int e = sc.nextInt();//no of edges
        DijkstraShortestPath g = new DijkstraShortestPath(v, e);

        for (int i = 0; i < e; i++) {
            g.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        g.dijkstra(0);
        for (int i = 0; i < g.v; i++)
            System.out.println("Vertex: " + i + " Distance: " + g.vertex[i].distance);
        sc.close();
    }
}
