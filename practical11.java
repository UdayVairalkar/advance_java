import java.awt.event.*; 
 import java.awt.*;  
 
 public class practical11
 extends Frame implements MouseListener {    
     public practical11
    () {         
        addMouseListener(this);         
        setVisible(true);         
        setLayout(null);         
        setSize(200, 200);     }     
         public void mousePressed(MouseEvent p) {         
            setBackground(Color.ORANGE);     }      
            public void mouseEntered(MouseEvent p) {         
                setBackground(Color.BLUE);      }     
                public void mouseExited(MouseEvent p) {        
                     setBackground(Color.GRAY);     }      
                     public void mouseReleased(MouseEvent p) {         
                        setBackground(Color.YELLOW);     }      
                        public void mouseClicked(MouseEvent p) {         
                            setBackground(Color.RED);     }      
                            public static void main(String[] args) {        
                                 new practical11
                                ();     } }