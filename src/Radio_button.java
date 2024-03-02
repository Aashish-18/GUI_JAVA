import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Radio_button {
    public static void main(String args[]){
        JFrame f=new JFrame("JradioButton");
        JRadioButton rb1=new JRadioButton("Married");
        rb1.setBounds(30,40,100,30);
        rb1.setForeground(Color.blue);
        JRadioButton rb2=new JRadioButton("un-Married");
        rb2.setBounds(30,80,100,30);
        rb2.setForeground(Color.blue);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        JLabel lb=new JLabel();
        lb.setBounds(30, 150,250,30);
        lb.setForeground(Color.MAGENTA);
        JButton b=new JButton("Marital Status");
        b.setBounds(30,200,150,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb1.isSelected()){
                    lb.setText("Marrital staus of employee is married");
                }
                if(rb2.isSelected()){
                    lb.setText("Marrital staus of employee is un-married");
                }
            }
        });
        f.add(rb1);
        f.add(rb2);
        f.add(lb);
        f.add(b);
        f.setSize(600,600); // to set the size of the frame
        f.setResizable(false);// to resize the frame
        f.setLayout(null);// to set layout - Flow,Grid,Border
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.cyan);
        f.setVisible(true);
    }
}
