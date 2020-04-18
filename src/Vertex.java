import java.util.LinkedList;

public class Vertex {
    LinkedList<Vertex> adj;
    int data;
    int distance;//from start vertex
    Vertex parent;
    boolean extracted;

    public Vertex(int data){
        this.data=data;
        distance=-1;
        parent=null;
        adj = new LinkedList<>();

    }
}