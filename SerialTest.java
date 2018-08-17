import java.io.*;
import java.util.*;

class SeTest implements java.io.Serializable{
    public int test = 10;
    public String fe = "testSerializable";
    public transient int SSN = 123;
}

public class SerialTest{
    public static void main(String[] args)
    {
    
            SeTest e = new SeTest();
            e.SSN = 12434;
            FileOutputStream fileOut =
                    new FileOutputStream(new File("setmp1"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in setmp1");
            
            /*
      try
        {
            FileInputStream fileIn = new FileInputStream("setmp1");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            SeTest e = (SeTest) in.readObject();  // transient, SSN will be 0
            in.close();
            fileIn.close();
        }catch(Exception i)
        {
            i.printStackTrace();
        }*/
        
    }
}
