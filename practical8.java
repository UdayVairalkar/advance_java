import javax.swing.*;    
public class practical8 {    
    JFrame f;    
    practical8(){    
    f=new JFrame();    
    String data[][]={ {"001","uday","6700"},    
                          {"002","khushboo","7800"},    
                          {"003","yash","7000"},
                        {"004","disha","7000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new practical8();    
}    
}