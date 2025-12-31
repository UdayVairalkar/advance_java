import java.awt.*;
import java.awt.event.*;
public class practical13
{
Frame f;
practical13()
{
f=new Frame("Window Adapter");
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f.dispose();
}
});
f.setSize(400,400);
f.setLayout(null);
f.setVisible(false);
}
public static void main(String[] args)
{
new practical13();
}
}