import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.*;

public class second {
    public static void main(String args[]){
        JFrame f=new JFrame("second Application");
        JLabel l=new JLabel();
        l.setBounds(90,10,170,30);
        l.setForeground(Color.yellow);
        JButton button =new JButton("Click");
        button.setBounds(10,10,70,30);
        button.setForeground(Color.BLUE);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l.setText("Welcome Aashish");
            }
        });
        f.add(button);
        f.add(l);
        f.setSize(400,400); // to set the size of the frame
        f.setResizable(true);// to resize the frame
        f.setLayout(null);// to set layout - Flow,Grid,Border
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.BLUE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
