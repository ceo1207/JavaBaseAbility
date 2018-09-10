
import java.net.*;


public class NetworkTest {
    void UDPTest()
    {
        int port = 8089;
        byte[] tmp = new byte[100];
        String message = "rex";
        try{
            DatagramSocket end =new DatagramSocket(port);
            DatagramPacket packet=new DatagramPacket(tmp, tmp.length);
            end.receive(packet);
            System.out.println(new String(packet.getData(),0,packet.getLength()));
//            DatagramPacket packet2=new DatagramPacket(message.getBytes(), message.getBytes().length);
//            end.send(packet2);

        }catch(Exception e)
        {
            e.printStackTrace();

        }

    }
    public static void main(String[] args) {


        try {
            //服务端在20006端口监听客户端请求的TCP连接
            ServerSocket server = new ServerSocket(20006);
            Socket client = null;
            boolean f = true;
            while (f) {
                //等待客户端的连接，如果没有获取连接
                client = server.accept();
                System.out.println("与客户端连接成功！");
                //为每个客户端连接开启一个线程    可以接受client参数 开启多线程
//                new Thread(new ServerThread(client)).start();
            }
            server.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
