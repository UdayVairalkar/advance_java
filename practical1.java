import java.awt.*;

public class practical1 {

    public static void main(String[] args) {
        Frame f1=new Frame("Practical 1");
        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout());
        Label li=new Label("enter the text here");
        li.setBounds(100, 260, 20, 30);




        Label l = new Label("Welcome to Java");
        f1.add(l);



        Button b1 = new Button("OK");
        Button b2 = new Button("RESET");
        Button b3 = new Button("CANCEL");
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
}
}