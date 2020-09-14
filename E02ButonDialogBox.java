import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class E02ButonDialogBox extends JFrame{
    
    public static void main(String[] args){
        new E02ButonDialogBox();        
    }
    
    E02ButonDialogBox(){
        super("myFrame");
        setVisible(true);
        setSize(800,600);
        setLayout(null);
        JButton b = new JButton("Ce faci?");
        b.setBounds(300,80,200,60);
        this.add(b);
            b.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        //Creez casuta de dialog.
                        //Pentru ca showMessageDialog se dereferentiaza direct din numele clasei si nu dintr-o instanta,
                        //putem sa ne dam seama ca aceasta metoda este statica.
                        //In paranteza avem in ordine componentele: componenta parinte a casetei de dialog, mesajul, 
                        //titlul si tipul casetei de dialog.
                        //Exista mai multe tipuri: de interogare, de informare, de eroare sau plain text (o caseta simpla).
                        JOptionPane.showMessageDialog(null, "Bine merci!", "Raspuns", JOptionPane.INFORMATION_MESSAGE); 
                    }
                }
            );
          
        }
}