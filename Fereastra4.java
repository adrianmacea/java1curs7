import java.awt.*;
import java.awt.event.*;

public class Fereastra4 extends Frame{
    Button b;
    
    public Fereastra4(String nume){
        super("Fereastra4 mea");
        b = new Button(nume);
        this.add(b);
        
        this.addWindowListener(
            //folosim adaptorul pentru a nu mai fi nevoiti sa transformam toate metodele abstracte ale Windowlistener 
            //in metode concrete, adaptorul o face in locul nostru, scrie niste metode goale (suprascrie mai corect)
            new WindowAdapter(){ 
                public void windowClosing(WindowEvent ev){
                    System.exit(0); 
                }                
            }
        );
    }
}
