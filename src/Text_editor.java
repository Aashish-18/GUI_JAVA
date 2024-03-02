import javax.swing.*;
import java.awt.event.*;
class Text_editor implements ActionListener {
   JFrame f;
   JMenuBar mb;
   JMenu file,edit,help;
   JMenuItem cut,copy,paste,selectAll,save,print;
   JTextArea ta;
   Text_editor(){
       f=new JFrame();
       cut=new JMenuItem("cut");
       copy=new JMenuItem("copy");
       paste=new JMenuItem("paste");
       selectAll=new JMenuItem("selectAll");
       save=new JMenuItem("save");
       print=new JMenuItem("print");

       cut.addActionListener(this);
       copy.addActionListener(this);
       paste.addActionListener(this);
       selectAll.addActionListener(this);

       mb=new JMenuBar();
       file=new JMenu("File");
       edit=new JMenu("Edit");
       help=new JMenu("Help");

       edit.add(cut);
       edit.add(copy);
       edit.add(paste);
       edit.add(selectAll);
       file.add(save);
       file.add(print);

       mb.add(file);
       mb.add(edit);

       ta=new JTextArea();
       ta.setBounds(5,5,400,300);
       f.add(mb);
       f.add(ta);

       f.setJMenuBar(mb);


       public void ActionPerformed(new ActionEvent e){

       }

       f.setSize(400,400);
       f.setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setResizable(false);
       f.setVisible(true);
   }

   public static void main(String args[]){

   }



}
