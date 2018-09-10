// 回溯法，没有写完
import java.util.ArrayList;
import java.util.Scanner;
class NodeTest{
    int x;
    int y;
    public NodeTest(int i1, int i2)
    {
        x = i1;
        y = i2;
    }
}
public class Main {
    public int min = Integer.MAX_VALUE;
    public int n;
    ArrayList<NodeTest> array;
    int[] order;
    public void find(int k, int sum)
    {
        boolean flag = false;
        for (int i1=1;i1<=n;i1++)
        {
            for(int i2=0;i2<k;i2++)
            {
                if(order[i2]==i1)
                {
                    continue;
                }
                else
                {

                    order[k] = i1;
                    sum += Math.abs(array.get(i1).x-array.get(order[k-1]).x)+Math.abs(array.get(i1).y-array.get(order[k-1]).y);
                    find(k+1,sum);

                }


            }

        }
        //sum

        if (k==n)
        {
            if (sum<min)
            {
                min = sum;
            }
        }
        return;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Main tmpMain = new Main();
        tmpMain.n = in.nextInt();
        tmpMain.order = new int[tmpMain.n+1];
        tmpMain.order[0] = 0;
        tmpMain.array = new ArrayList<NodeTest>();
        tmpMain.array.add(new NodeTest(0,0));
        in.nextLine();
        for(int i1=0;i1<tmpMain.n;i1++)
        {
            String s = in.nextLine();
            String[] s2 = s.split(",");
            tmpMain.array.add(new NodeTest(Integer.parseInt(s2[0]), Integer.parseInt(s2[1])));
        }
        tmpMain.find(1,0);
        System.out.println(tmpMain.min);
    }
}
