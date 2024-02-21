import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Login_form {
    public static void main(String args[]){
        JFrame f=new JFrame("second Application");
        JLabel l=new JLabel();
        JLabel l2=new JLabel("UserName");
        l2.setBounds(20,20,100,30);
        l2.setForeground(Color.yellow);
        JTextField tf=new JTextField();
        tf.setBounds(90,20,100,30);
        JLabel l3=new JLabel("Password");
        l3.setBounds(20,40,100,30);
        l3.setForeground(Color.yellow);
        JPasswordField pf=new JPasswordField();
        pf.setBounds(90,50,100,30);

        l.setBounds(20,220,170,30);
        l.setForeground(Color.yellow);
        JButton button =new JButton("login");
        button.setBounds(20,90,70,30);
        button.setForeground(Color.BLUE);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l.setText("Welcome "+tf.getText()+" !");
            }
        });
        f.add(button);
        f.add(l);
        f.add(l2);
        f.add(l3);
        f.add(tf);
        f.add(pf);
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