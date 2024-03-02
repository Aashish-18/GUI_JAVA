import javax.swing.*;
import java.awt.event.*;

 class Key implements KeyListener {
    JFrame f;
    JLabel l;
    JTextArea t;

    Key(){
        f=new JFrame("KeyListener");
        l=new JLabel();
        l.setBounds(10,20,120,30);
        t=new JTextArea();
        t.setBounds(30,50,200,130);
        t.addKeyListener(this);
        f.add(l);
        f.add(t);

        f.setSize(400,400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);

    }

     @Override
     public void keyPressed(KeyEvent e) {
         l.setText("Key pressed");
     }

     @Override
     public void keyReleased(KeyEvent e) {
         l.setText(" ");
     }

     @Override
     public void keyTyped(KeyEvent e) {
         l.setText("typing ...");
     }

     public static void main(String args[]){
        new Key();
    }
}
