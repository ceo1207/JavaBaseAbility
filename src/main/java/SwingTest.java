import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class SwingTest extends JFrame implements ActionListener{
    JList list=new JList();
    public SwingTest() {
        setTitle("myFirstApp");
//        setBounds(650, 350, 665, 445);

        // 添加响应
        setLayout(new FlowLayout());

        JButton button = new JButton("test");
        add(button);
        // 方式1 匿名内部类
        button.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("你按了按钮一");
                    }
                });

         // 方式2
        button.addActionListener(this);

        add(list);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                // 获取所有被选中的选项索引
                int[] indices = list.getSelectedIndices();
                // 获取选项数据的 ListModel
                //ListModel<String> listModel = list.getModel();
                // 输出选中的选项
//                for (int index : indices) {
//                    System.out.println("选中: " + index + " = " + listModel.getElementAt(index));
//                }
            }
        });
        // List
//        JList list=new JList(new String[]{"身份证","驾驶证","军官证"});
//        add(list);

        //JMenuBar
//        JMenuBar m = new JMenuBar();
//        setJMenuBar(m);
//        // 英雄类型
//        JMenu m1 = new JMenu("刺客(A)");
//        JMenu m2 = new JMenu("战士(B)");
//        JMenu m3 = new JMenu("射手(C)");
//        JMenu m4 = new JMenu("法师(D)");
//        JMenu m5 = new JMenu("辅助(E)");
//        JMenu m6 = new JMenu("坦克(F)");
//        // 英雄单位
//        JMenu n1 = new JMenu("那可露露(O)");
//        JMenu n2 = new JMenu("李白(P)");
//        JMenu n3 = new JMenu("橘右京(Q)");
//        JMenu n4 = new JMenu("关羽(O)");
//        JMenu n5 = new JMenu("赵玉(P)");
//        JMenu n6 = new JMenu("刘备(Q)");
//        // 关羽攻略
//        JMenuItem n31 = new JMenuItem("出装(U)");
//        JMenuItem n32 = new JMenuItem("铭文(V)");
//        JMenuItem n33 = new JMenuItem("打法(W)");
//        // 李白攻略
//        JMenuItem n21 = new JMenuItem("人生(U)");
//        JMenuItem n22 = new JMenuItem("技能(V)");
//        JMenuItem n23 = new JMenuItem("打法(W)");
//        JMenuItem n24 = new JMenuItem("出装(X)");
//        JMenuItem n25 = new JMenuItem("铭文(Y)");
//        JMenuItem n26 = new JMenuItem("选手(Z)");
//        // 英雄类型
//        m.add(m1);
//        m.add(m2);
//        m.add(m3);
//        m.add(m4);
//        m.add(m5);
//        m.add(m6);
//        // 刺客英雄
//        m1.add(n1);
//        m1.add(n2);
//        m1.add(n3);
//        // 战士英雄
//        m2.add(n4);
//        m2.add(n5);
//        m2.add(n6);
//        // 关羽攻略
//        n4.add(n31);
//        n4.add(n32);
//        n4.add(n33);
//        // 李白攻略
//        n2.add(n21);
//        n2.add(n22);
//        n2.add(n23);
//        n2.add(n24);
//        n2.add(n25);
//        n2.add(n26);

        // 使用流式布局
//        setLayout(new FlowLayout());
//        add(new JButton("OK"));
//        add(new JTextField("Field"));
//        add(new JTextArea("Area"));
//        add(new JLabel("label"));


        // panel默认流失布局
//        JPanel panel = new JPanel();
//        panel.add(new JButton("OK"));
//        panel.add(new JTextField("Field"));
//        panel.add(new JTextArea("Area"));
//        panel.add(new JLabel("label"));
//        getContentPane().add(panel);

        //JFrame默认的布局管理器为BorderLayout
//        setLayout(new BorderLayout());
//        add(BorderLayout.CENTER, new JButton("OK"));
//        add(BorderLayout.EAST, new JTextField("Field"));
//        add(BorderLayout.WEST, new JTextArea("Area"));
//        add(BorderLayout.NORTH, new JLabel("label"));





        //依据你放置的组件设定窗口的大小 使之正好能容纳你放置的所有组件
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // setVisible 会调用show()
        setVisible(true);


    }
    public static void main(String[] args)
    {
        new SwingTest();
    }

    public void actionPerformed(ActionEvent e) {
        list.setListData(new String[]{"香蕉", "雪梨", "苹果", "荔枝"});
    }
}
