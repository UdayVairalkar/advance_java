import java.awt.*;
class ChoiceDemo extends Frame
{
    ChoiceDemo()
    {
        setForeground(Color.black);

        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        Choice c1=new Choice();
        Label li =new Label("You Are in mumbai");
        c1.add("solapur");
        c1.add("pune");
        c1.add("Banglore");
        c1.add("mumbai");


        add(c1);
        add(li);

    }

    public static void main(String args[])
    {
        ChoiceDemo cd=new ChoiceDemo();
        cd.setVisible(true);
        cd.setTitle("Choice Contrl");
        cd.setSize(500,500);
}
}