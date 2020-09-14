import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E10Meniu extends JFrame{
    
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("File");
    JMenuItem mi1 = new JMenuItem("Exit"); //este de fapt un buton
    
    public E10Meniu(){
        setVisible(true);
        setLocation(900,450);
        setSize(600,600);
                
        setJMenuBar(mb); //comanda care adauga bara de meniu ferestrei
        mb.add(m1); //adaugam meniul m1 pe bara de meniu
        m1.add(mi1); //adaugam itemul mi1 pe meniul m1
        
        //facem ferestra sa se inchida la apasarea lui exit din meniu
        mi1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    System.exit(0);
                }
            }
        );
        
    }
    
    public static void main(String [] args){
        new E10Meniu();
    }
}
