import java.awt.*;
import javax.swing.*;
class Display extends Canvas {
    public void paint(Graphics g){
        g.fillRect(100,100,160,50);
        setForeground(Color.red);
        setBackground(Color.cyan);
        repaint(0);
    }
    public static void main(String args[]){
        Display dg=new Display();


        JFrame f=new JFrame("Graphics application");
        f.setSize(400,400);
        f.add(dg);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
