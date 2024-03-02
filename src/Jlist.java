//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.Color;
//class Jlist{
//    JFrame f;
//    Jlist(){
//        f=new JFrame("Jlist application");
//        JLabel l=new JLabel();
//        l.setBounds(250,200,190,30);
//        l.setForeground(Color.MAGENTA);
//        DefaultListModel<String> df=new DefaultListModel<>();
//        df.addElement("India");
//        df.addElement("Japan");
//        df.addElement("Russia");
//        df.addElement("China");
//        df.addElement("America");
//        df.addElement("new Zeland");
//
//        JList<String> ls=new JList<>(df);
//        ls.setBounds(40,10,100,200);
//        JButton b=new JButton("Country");
//        b.setBounds(150,150,90,30);
//        b.setForeground(Color.MAGENTA);
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String data="";
//                if(ls.getSelectedIndex()!=1){
//                    data="Selected country is:"+ls.getSelectedValue();
//                }
//                l.setText(data);
//            }
//        });
//
//        f.setSize(600,600);
//        f.setLayout(null);
//        f.setResizable(false);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
//
//    }
//    public static void main(String args[]){
//        new jlist();
//    }
//}