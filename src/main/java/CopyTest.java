class Addr implements Cloneable
{
    String addr;
    public Addr(){
        addr = "xihu";
    }
    public Addr(String tmp)
    {
        addr = tmp;
    }
    @Override
    public Addr clone()
    {
        Addr tmp = null;
        try {
            tmp = (Addr)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tmp;
    }
}
public class CopyTest {
    public static void main(String[] args) {
        Addr t1 = new Addr("fe");
        Addr t2 = t1.clone();
        t2.addr = "feqw";
        System.out.println(t1.addr);
    }

}
