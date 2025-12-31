import javax.swing.*;   
public class practical6 {   
 
practical6(){   
  JFrame f=new JFrame();   
    String s[]={"Maharashtra","Punjab","Gujrat","TamilNadu"};       
    JComboBox cb=new JComboBox(s);   
    cb.setBounds(50, 50,90,20);   
    f.add(cb);       
    f.setLayout(null);   
    f.setSize(400,400);   
    f.setVisible(true);       
}   
public static void main(String[] args) {   
    new practical6
();
}
}