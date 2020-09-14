import java.awt.*;
import java.awt.event.*;

public class E07LayoutManagers extends Frame{
    
    Button b1 = new Button("RED");
    Button b2 = new Button("GREEN");
    Button b3 = new Button("BLUE");
    
    Panel p = new Panel();
    
    public E07LayoutManagers(String nume){
        super("Layout Managers Test");
        setVisible(true);
        setSize(400,400);
        
        setLayout(new BorderLayout());
        add(p, BorderLayout.SOUTH);
        
        p.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        
        b1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    setBackground(Color.RED);
                }
            }
        );
        
        b2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    setBackground(Color.GREEN);
                }
            }
        );
        
        b3.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    setBackground(Color.BLUE);
                }
            }
        );
        
        addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent ev){
                    System.exit(0);
                }
            }
        );        
    }
    
    
    public static void main(String [] args){
        new E07LayoutManagers("Layout Managers Test");
    }
}
