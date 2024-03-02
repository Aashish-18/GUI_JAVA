import javax.swing.*;
import java.awt.Color;

public class Jtable_Jscroll {
    JFrame f;
    Jtable_Jscroll(){
        f=new JFrame("JTable and Scrollpane");
        String data[][]={
                {"1","Human","123"},
                {"2","man","23"},
                {"3","Hanuman","1023"},
                {"4","demon","231"},
                {"5","woman","13"},
                {"6","shehulk","33"},
                {"7","Hulk","203"},
                {"8","spiderman","323"},
                {"9","batman","143"},
        };
        String col[]={"id","name","year"};
        JTable tb=new JTable(data,col);
        JScrollPane sp=new JScrollPane(tb);
        sp.setBounds(30,40,200,100);
        f.add(sp);
        f.setSize(400,400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);

    }
    public static void main(String args[]){
        new Jtable_Jscroll();
    }
}
