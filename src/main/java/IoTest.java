import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class IoTest {
    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
//        System.out.println(in.nextLine());
//        System.out.println(in.nextInt());

        try {
//            FileInputStream fileIn = new FileInputStream("d");
            File file = new File("d");
            FileInputStream fileIn = new FileInputStream(file);
            long leng = file.length();
            byte[] data = new byte[(int)leng];
            int a = fileIn.read(data);
            System.out.println(a);
            System.out.println(data);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
