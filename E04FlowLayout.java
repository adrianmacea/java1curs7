import java.awt.*;
import java.awt.event.*;

public class E04FlowLayout extends Frame{
    
    Button b1 = new Button("Buton 1");
    Button b2 = new Button("Buton 2");
    
    public E04FlowLayout(){
        setLayout(new FlowLayout(FlowLayout.RIGHT)); // manager de pozitionare flow layout
        this.add(b1);
        this.add(b2);
        
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
        new E04FlowLayout();
    }
}