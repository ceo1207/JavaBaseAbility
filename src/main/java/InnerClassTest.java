class Out
{
    int i1;
    class In{
        int i2;
    }
}
public class InnerClassTest {
    public static void main(String[] args)
    {
        Out outClass = new Out();
        Out.In innerClass = outClass.new In();
    }
}
