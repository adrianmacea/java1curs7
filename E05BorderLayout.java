import java.awt.*;
import java.awt.event.*;

public class E05BorderLayout extends Frame{
    
    Button b1 = new Button("Buton N");
    Button b2 = new Button("Buton S");
    Button b3 = new Button("Buton E");
    Button b4 = new Button("Buton W");
    Button b5 = new Button("Buton C");
    
    public E05BorderLayout(){
        setLayout(new BorderLayout()); 
        // manager de pozitionare border layout, 
        // in cazul acesta este redundant, pt ca Frame foloseste implicit acest manager de layout
        
        this.add(b1, BorderLayout.NORTH);
        this.add(b2, BorderLayout.SOUTH);
        this.add(b3, BorderLayout.EAST);
        this.add(b4, BorderLayout.WEST);
        this.add(b5, BorderLayout.CENTER); //implicit, deci redundanta scrierea Borderlayout.CENTER
        
        addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent ev){
                    System.exit(0);
                }
            }
        );
        
        setVisible(true);
        setSize(400,400);
    }
    
    public static void main(String [] args){
        new E05BorderLayout();
    }
}
