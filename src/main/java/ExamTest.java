import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class Node implements Comparable<Node>{
    public int i1;
    Node(int t1)
    {
        i1 = t1;
    }

    public int compareTo(Node o) {
        return this.i1-o.i1;
    }
}
public class ExamTest {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        q1.add(12);
        q1.add(1121);
        System.out.println(q1.peek());
        q1.poll();
        System.out.println(q1.peek());

        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(12);
        s1.push(1231);
        s1.push(123);
        s1.pop();
        System.out.println(s1.peek());
        s1.peek();
        System.out.println(s1.peek());

        Collections.sort(s1);

        List<Node> l1 = new ArrayList<Node>();
        l1.add(new Node(12));
        l1.add(new Node(16));
        l1.add(new Node(1));
        Collections.sort(l1);
//        Collections.sort(l1, new Comparator<Node>() {
//         public int compare(Node o1, Node o2) {
//                         return o2.i1 - o1.i1;
//                         }
//     });
        System.out.println(l1);
    }
}
