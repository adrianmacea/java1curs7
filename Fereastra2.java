import java.awt.*;
import java.awt.event.*;

public class Fereastra2 extends Frame implements WindowListener{
        
    public Fereastra2(String nume){
        this.addWindowListener(this);
    }
    
    public void windowClosing(WindowEvent ev){
        System.exit(0);
    }
    
    public void windowClosed(WindowEvent ev){}
    public void windowOpened(WindowEvent ev){}
    public void windowActivated(WindowEvent ev){}
    public void windowDeactivated(WindowEvent ev){}
    public void windowIconified(WindowEvent ev){}
    public void windowDeiconified(WindowEvent ev){}
}
