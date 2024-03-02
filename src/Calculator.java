import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Calculator {
   public static void main(String args[]){
       JFrame f=new JFrame("Calculator Application");
       JLabel l2=new JLabel("First Name");
       l2.setBounds(20,20,200,30);
       l2.setForeground(Color.yellow);
       JTextField tf=new JTextField();
       tf.setBounds(150,20,100,30);
       JLabel l3=new JLabel("Second Number");
       l3.setBounds(20,60,200,30);
       l3.setForeground(Color.yellow);
       JTextField tf2=new JTextField();
       tf2.setBounds(150,50,100,30);
       JTextField tf3=new JTextField();
       tf3.setEditable(false);
       tf3.setBounds(160,90,90,30);

       JButton b =new JButton("+");
       b.setBounds(20,90,70,30);
       b.setForeground(Color.BLUE);
       JButton b2 =new JButton("*");
       b2.setBounds(20,120,70,30);
       b2.setForeground(Color.BLUE);
       JButton b3 =new JButton("/");
       b3.setBounds(20,120,70,30);
       b3.setForeground(Color.BLUE);

       JButton b1 =new JButton("-");
       b1.setBounds(70,90,70,30);
       b1.setForeground(Color.BLUE);
       b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
              int x=Integer.parseInt(tf.getText());
              int y=Integer.parseInt(tf2.getText());
              int z=x+y;

              tf3.setText(String.valueOf(z));
           }
       });
       b2.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int x=Integer.parseInt(tf.getText());
               int y=Integer.parseInt(tf2.getText());
               int z=x*y;

               tf3.setText(String.valueOf(z));
           }
       });
       b3.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int x=Integer.parseInt(tf.getText());
               int y=Integer.parseInt(tf2.getText());
               int z=x*y;

               tf3.setText(String.valueOf(z));
           }
       });
       b4.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int x=Integer.parseInt(tf.getText());
               int y=Integer.parseInt(tf2.getText());
               int z=x/y;

               tf3.setText(String.valueOf(z));
           }
       });
       f.add(b3);
       f.add(b4);
       f.add(b);
       f.add(b1);
       f.add(b2);
       f.add(tf3);
       f.add(l2);
       f.add(l3);
       f.add(tf);
       f.add(tf2);
       f.setSize(600,600); // to set the size of the frame
       f.setResizable(true);// to resize the frame
       f.setLayout(null);// to set layout - Flow,Grid,Border
       f.setLocationRelativeTo(null);
       JPanel panel = new JPanel();

       f.getContentPane().setBackground(Color.BLUE);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
   }
}
