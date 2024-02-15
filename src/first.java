import javax.swing.*;
import java.awt.Color;
import java.awt.*;
class first
{
    public static void main(String... shruti)
    {
        JFrame f=new JFrame("My second application");
        JPanel p=new JPanel();
        p.setBounds(10,10,150,150);
        p.setBackground(Color.yellow);
        JButton b=new JButton("Click");
        b.setBounds(30,30,100,30);
        b.setForeground(Color.blue);
        p.add(b);
        JPanel p1=new JPanel();
        p1.setBounds(170,170,150,150);
        p1.setBackground(Color.green);
        JLabel l=new JLabel("Name:- ");
        l.setBounds(40,40,50,30);
        l.setForeground(Color.red);
        JTextField tf=new JTextField("TextField");
        tf.setBounds(80,40,50,30);
        tf.setForeground(Color.red);
        p1.add(l);
        p1.add(tf);
        f.add(p,BorderLayout.EAST);
        f.add(p1,BorderLayout.NORTH);
        f.setSize(400,400); // to set the size of the frame
        f.setResizable(true);// to resize the frame
        f.setLayout(null);// to set layout - Flow,Grid,Border
        f.setLocationRelativeTo(null);// to get relative location acoording to our screen
        f.getContentPane().setBackground(new Color(120,230,120)); // to set color of an container class
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// the frame will exit after closing process
        // f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// the frame will hide but process won't be end
        //f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //nothing will happen when clicking on exit
        f.setVisible(true);
    }}