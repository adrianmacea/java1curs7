import java.awt.*;
import java.awt.event.*;

public class Fereastra extends Frame{
    Button b;
    
    public Fereastra(String nume){
        super("Fereastra mea");
        b = new Button(nume);
        this.add(b);
        
        //java.awt.event.WindowListener e o interfata, contine mai multe metode care pot fi aplicate unei ferestre
        //toate aceste metode primesc ca parametru WindowEvent (clasa in java.awt.event)
        this.addWindowListener(
            new WindowListener(){
                public void windowClosing(WindowEvent ev){
                    System.exit(0); // inchide aplicatia (...in momentul in care se apasa butonul de inchidere al ferestrei)
                    
                    // dispose(); - daca vreau sa inchid doar fereastra, nu toata aplicatia,
                    //este un comportament al ferestrei care nu primeste parametri
                    
                    //setVisible(false); - daca vreau sa fac fereastra invizibila, fara sa o distrug complet
                }
                //trateaza eventul de inchidere a ferestrei de la butonul din coltul barei de sus
                
                //scriem mai jos si restul metodelor mostenite din interfata WindowListener pentru a putea compila 
                //exista o solutie mai simpla pentru asta, dar le-am scris aici sa le vedem pe toate
                public void windowClosed(WindowEvent ev){}
                //se apeleaza imediat dupa inchiderea ferestrei
                public void windowOpened(WindowEvent ev){}
                //se apeleaza imediat dupa deschiderea ferestrei
                public void windowActivated(WindowEvent ev){}
                //se apeleaza la focusarea ferestrei
                public void windowDeactivated(WindowEvent ev){}
                //se apeleaza la defocusarea ferestrei
                public void windowIconified(WindowEvent ev){}
                //se apeleaza atunci cand fereastra este pusa in bara de task
                public void windowDeiconified(WindowEvent ev){}
                //se apeleaza atunci cand fereastra revine din bara de task
            }
        );
    }
}