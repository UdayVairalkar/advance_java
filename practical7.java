import java.awt.Color; 
import java.awt.FlowLayout; 
import java.awt.Frame; 
import java.awt.Menu; 
import java.awt.MenuBar; 
import java.awt.MenuItem; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;  
public class practical7 extends Frame implements ActionListener {   
    MenuBar mainMenuBar;   
    Menu mColors, mExit;   
    MenuItem miYellow, miRed, miBlue, miGreen, miBlack, miClose;      
    public practical7() {     
        this.setTitle("Menus Demo");     
        this.setSize(400, 250);     
        this.setLayout(new FlowLayout());          
        this.mainMenuBar = new MenuBar();     
        this.setMenuBar(this.mainMenuBar);
        this.mColors = new Menu("Colors");     
        this.miYellow = new MenuItem("Yellow");     
        this.miYellow.addActionListener(this);     
        this.mColors.add(this.miYellow);          
        this.miRed = new MenuItem("Red");     
        this.miRed.addActionListener(this);     
        this.mColors.add(this.miRed);          
        this.miBlack = new MenuItem("Black");     
        this.miBlack.addActionListener(this);     
        this.mColors.add(this.miBlack);     
        this.miBlack.setEnabled(false);          
        this.mColors.addSeparator();          
        this.miBlue = new MenuItem("Blue");     
        this.miBlue.addActionListener(this);     
        this.mColors.add(this.miBlue);          
        this.miGreen = new MenuItem("Green");     
        this.miGreen.addActionListener(this);     
        this.mColors.add(this.miGreen);          
        this.mainMenuBar.add(this.mColors);          
        this.mExit = new Menu("Exit");     
        this.miClose = new MenuItem("Close");     
        this.miClose.addActionListener(this);     
        this.mExit.add(this.miClose);          
        this.mainMenuBar.add(this.mExit);          
        this.setVisible(true);   }     
         public static void main(String[] args) {    
             new practical7(); 
              }
        public void actionPerformed(ActionEvent e) {    
             if(e.getSource() == this.miYellow) {       
                this.setBackground(Color.YELLOW);     
            } else if(e.getSource() == this.miRed) 
            {       
                this.setBackground(Color.RED);     
            } else if(e.getSource() == this.miBlack) {      
                 this.setBackground(Color.BLACK);     
            } else if(e.getSource() == this.miBlue) {       
                this.setBackground(Color.BLUE);     } 
                else if(e.getSource() == this.miGreen) {       
                    this.setBackground(Color.GREEN);     } 
                    else if(e.getSource() == this.miClose) 
                    {       System.exit(0);     
                    }  
                 }
                 }