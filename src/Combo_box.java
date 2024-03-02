import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Combo_box {
    Combo_box(){
        JFrame f=new JFrame("J Combo Box");
        String color[]={"Red","Yellow","Blue","Green","Cyan","Magenta"};
        JComboBox cb=new JComboBox<String>(color);
        cb.setBounds(30,40,100,30);
        f.add(cb);
        f.setSize(600,600); // to set the size of the frame
        f.setResizable(false);// to resize the frame
        f.setLayout(null);// to set layout - Flow,Grid,Border
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.cyan);
        f.setVisible(true);
    }
    public static void main(String args[]){

        new Combo_box();
    }
}
