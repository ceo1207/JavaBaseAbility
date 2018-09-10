import java.lang.reflect.*;

class Father{
    int i1;
    float i2;
}
class Son extends Father{
    int i3;
    double i4;
}
public class ReflectionTest {
    public static void main(String[] args) {
        try {
            Class<?> c1 = Class.forName("Father");
            for (Field item:c1.getFields())
            {
                System.out.print(item.getModifiers());
                System.out.println(item.getType());
            }
            c1.getDeclaredFields();
            c1.getMethods();
            Class<?> c2 = Son.class;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
