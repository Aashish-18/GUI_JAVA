import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mouseEvents extends Frame implements MouseListener {
    mouseEvents(){
        addMouseListener(this);
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.CYAN);
        g.fillOval(e.getX(),e.getY(),20,40);
    }
    public void mousePressed(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }
    public static void main(String args[]){
        new mouseEvents();
    }
}

