import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class GraphNode
{
    int body;
    public GraphNode(int t)
    {
        body = t;
    }
}
class Graph
{
    int size;
    boolean[] visited;
    int[][] matrix;
    GraphNode[] nodes;
    // 无向图
    public Graph(int size)
    {
        this.size = size;
        matrix = new int[size][size];
        visited = new boolean[size];
        nodes = new GraphNode[size];
        for (int i1=0;i1<size;i1++)
        {
            nodes[i1] = new GraphNode(i1);
        }
    }
    public void addEdge(int e1, int e2, int weight)
    {
        matrix[e1][e2] = weight;
        matrix[e2][e1] = weight;
    }
    public void DFS(int node)
    {
        System.out.println(nodes[node].body);
        visited[node] = true;
        for(int i1=0;i1<size;i1++)
        {
            if(matrix[node][i1]!=0 && visited[i1]==false)
            {
                DFS(i1);
            }
        }

    }
    // 非递归版本
    public void DFS2(int node)
    {
        Stack<Integer> standby = new Stack<Integer>();
        standby.add(node);
        while(!standby.isEmpty())
        {
            int currentNode = standby.pop();
            if (visited[currentNode]==false) {
                System.out.println(nodes[currentNode].body);
                visited[currentNode] = true;
            }
            for(int i1=0;i1<size;i1++)
            {
                if(matrix[currentNode][i1]!=0&&visited[i1]==false)
                {
                    standby.add(i1);
                }
            }
        }
    }

    public void BFS(int start)
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        while(!queue.isEmpty())
        {
            int currentNode = queue.poll();
            if (visited[currentNode]==false) {
                System.out.println(nodes[currentNode].body);
                visited[currentNode] = true;
            }
            for(int i1=0;i1<size;i1++)
            {
                if(matrix[currentNode][i1]!=0&&visited[i1]==false)
                {
                    queue.add(i1);
                }
            }
        }
    }
    public void clearVisited() {
        for (int i1 = 0; i1 < size; i1++)
        {
            visited[i1] = false;
        }
    }

}
public class GraphTest2 {
    public static void main(String[] args)
    {
        Graph g1 = new Graph(8);
        g1.addEdge(1,2,1);
        g1.addEdge(1,3,1);
        g1.addEdge(1,4,1);
        g1.addEdge(2,5,1);
        g1.addEdge(5,6,1);
        g1.addEdge(3,7,1);
        System.out.println("DFS");
        g1.DFS(1);
        g1.clearVisited();
        System.out.println("DFS 非递归");
        g1.DFS2(1);
        g1.clearVisited();
        System.out.println("BFS");
        g1.BFS(1);
    }
}
