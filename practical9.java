
import javax.swing.*; 
public class practical9
{  
    static int currentvalue=0;public static void main(String args[]) 
    { 
        final int max=100; final JFrame frame=new JFrame("JProgress Demo"); 
        JLabel l1=new JLabel("Downloading...");
        l1.setBounds(150,70,100,25);
        final JProgressBar pb=new JProgressBar(); 
        pb.setBounds(110,100,200,25);
JLabel l2 = new JLabel("Download Complete");
l2.setBounds(150,140,200,25);
l2.setVisible(false);
pb.setMinimum(0); 
pb.setMaximum(max); 
pb.setStringPainted(true);
 frame.add(l1);
 frame.add(l2);
 frame.setLayout(null); 
 frame.getContentPane().add(pb);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  frame.setSize(400,400); 
  frame.setVisible(true); 
  for(int i=0;i<=max;i++) { 
     currentvalue=i; 
     try { SwingUtilities.invokeLater(new Runnable()
         { public void run() { pb.setValue(currentvalue);
         } }); java.lang.Thread.sleep(100); } 
         catch(InterruptedException e) 
         { JOptionPane.showMessageDialog(frame,e.getMessage());
         } if(currentvalue==max){l1.setVisible(false);
            l2.setVisible(true);
        }}  } }