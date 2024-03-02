import javax.swing.*;
import java.awt.*;
public class blink_rect extends Canvas{
    public void paint(Graphics g){
        g.fillRect(100,100,30,40);
        Font f=new Font("Dialog",Font.BOLD,20);
        g.setFont(f);
        g.drawString("Aashish",20,20);
        setForeground(Color.blue);
        //g.drawString("K21bp Section",20,30);
        setBackground(Color.yellow);
        g.fillRect(50,50,100,100);
        // g.fillOval(100,100,300,200);
        //g.fillArc(200,150,300,100,40,60);
    }
    public static void main(String args){
        blink_rect dg=new blink_rect();
        JFrame f=new JFrame("Graphics application");
        f.setSize(400,400);
        f.add(dg);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
