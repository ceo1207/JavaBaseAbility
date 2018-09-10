import java.util.*;

class NodeGraph{
    List<Edge> edges = null;
    public int body;
    public NodeGraph(int tmp){
        body = tmp;
        edges = new ArrayList<Edge>();
    }
    public void addNode(NodeGraph e)
    {
        //edges.add()
    }

}
class Edge{
    public NodeGraph start;
    public NodeGraph end;
    public int weight;
    Edge(NodeGraph n1, NodeGraph n2)
    {
        start = n1;
        end = n2;
    }
}
public class GraphTest {
    public static void main(String[] args) {


    }
}
