import java.awt.*;

public class practical2 {

    public static void main(String[] args) {

        Frame f1=new Frame("Practical 1");
        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout());

       List l = new List(3,true);
       l.add("Summer");
       l.add("Winter");
       l.add("Rainy");
       f1.add(l);


       List li=new List(10, false);
       li.add("sunday");
       li.add("monday");
       li.add("tuesday");
       li.add("wednesday");
       li.add("thursday");
       li.add("friday");

       li.add("saturday");
      
       f1.add(li);



       List L =new List(3,true);
       L.add("indians times");
       L.add("TIMES OF NEW YORK");
        L.add("SAKAL");
        f1.add(L);

}
}