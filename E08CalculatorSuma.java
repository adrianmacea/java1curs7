import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E08CalculatorSuma extends Frame{
    
    Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
    Panel p2 = new Panel(new FlowLayout(FlowLayout.LEFT));
    Panel p3 = new Panel(new FlowLayout(FlowLayout.LEFT));
    
    Label l1 = new Label("X: ");
    Label l2 = new Label("Y: ");
    
    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    
    Button b = new Button("SUMA");
    
    public E08CalculatorSuma(String nume){
        super("Calculator Suma");
        setVisible(true);
        setLocation(900,450);
        setSize(220,130);
        //pack(); putem sa folosim pack in loc de set size, fereastra isi ia dimensiunea optima pentru a include toate elementele
        setResizable(false); //utilizatorul nu poate sa redimensioneze fereastra
        
        setLayout(new GridLayout(3,1));
        add(p1);
        add(p2);
        add(p3);
        
        p1.add(l1); p1.add(t1);
        p2.add(l2); p2.add(t2);
        p3.add(b);
        
        b.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    try{
                        double x = Double.parseDouble(t1.getText());
                        double y = Double.parseDouble(t2.getText());
                        JOptionPane.showMessageDialog(null,""+(x+y),"Suma este ",JOptionPane.INFORMATION_MESSAGE);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Doar numere, te rog","Eroare",JOptionPane.ERROR_MESSAGE);
                    }
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
        new E08CalculatorSuma("Calculator Suma");
    }
}
