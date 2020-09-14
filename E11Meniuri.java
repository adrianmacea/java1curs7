
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E11Meniuri extends JFrame{
    
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("Optiuni");
    JMenu m2 = new JMenu("Culori");
    JMenuItem mi1 = new JMenuItem("Red"); 
    JMenuItem mi2 = new JMenuItem("Green"); 
    JMenuItem mi3 = new JMenuItem("Blue"); 
    JMenuItem mi4 = new JMenuItem("Exit"); 
    
    public E11Meniuri(){
        setVisible(true);
        setLocation(600,450);
        setSize(500,300);
                
        setJMenuBar(mb);
        mb.add(m1);
        m1.add(m2); //aici am adaugat m2 ca submeniu al lui m1
        m1.add(mi4);
        
        m2.add(mi1);
        m2.add(mi2);
        m2.add(mi3);
        
        mi4.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    System.exit(0);
                }
            }
        );
        
        mi1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    setBackground(Color.RED);
                }
            }
        );
        
        mi2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    setBackground(Color.GREEN);
                }
            }
        );
        
        mi3.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    setBackground(Color.BLUE);
                }
            }
        );
    }
    
    public static void main(String [] args){
        new E11Meniuri();
    }
}
