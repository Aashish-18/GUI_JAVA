//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//class color_change_layout {
//    static JButton prev,next;
//    static CardLayout c1;
//    static JPanel p;
//    static JComboBox<String>jcb;
//    public static void main(String args[]){
//        JFrame f=new JFrame("My Cards");
//        f.setSize(800,700);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setLocationRelativeTo(null);
//
//        p=new JPanel();
//        c1=new CardLayout();
//        p.setLayout(c1);
//        f.add(p);
//        JPanel p1=new JPanel();
//        p1.setBackground(Color.red);
//        p.add(p1,"Red");
//        JPanel p2=new JPanel();
//        p2.setBackground(Color.GREEN);
//        p.add(p2,"Green");
//        JPanel p3=new JPanel();
//        p3.setBackground(Color.CYAN);
//        p.add(p3,"Cyan");
//        JPanel p4=new JPanel();
//        p4.setBackground(Color.yellow);
//        p.add(p4,"Yellow");
//        JPanel p5=new JPanel();
//        p5.setBackground(Color.MAGENTA);
//        p.add(p5,"Magenta");
//
//        JPanel buttons=new JPanel();
//        prev=new JButton("previous");
//        next=new JButton("next");
//        buttons.add(prev);
//        buttons.add(next);
//        f.add(buttons,BorderLayout.SOUTH);
//        String color[]={"Red","Yellow","Blue","Green","Cyan","Magenta"};
//        JComboBox cb=new JComboBox<String>(color);
//        buttons.add(cb);
//
//        MyListener ml=new MyListener();
//        prev.add()
//    }
//}
