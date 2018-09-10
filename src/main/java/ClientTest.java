import java.net.*;

public class ClientTest {
    void UDPTest()
    {
        int port = 8089;
        String tmp = "helo";
        byte[] buffer = new byte[100];
        String hostname="localhost";
        try{
            InetAddress host = InetAddress.getByName("localhost");
            DatagramSocket end =new DatagramSocket();
            DatagramPacket packet=new DatagramPacket(tmp.getBytes(), tmp.getBytes().length, host, 8089);
            end.send(packet);
//            DatagramPacket packet2=new DatagramPacket(buffer, buffer.length);
//            end.receive(packet2);
//            System.out.println(new String(packet2.getData(),0,packet.getLength()));

        }catch(Exception e)
        {
            e.printStackTrace();

        }
    }
    public static void main(String[] args) {

//        Socket client = new Socket("127.0.0.1", 20006);
//        client.setSoTimeout(10000);



    }
}
