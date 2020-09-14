import java.awt.*;
import java.awt.event.*;

public class Fereastra3 extends Frame{
        
    public Fereastra3(){
        this.addWindowListener(new Observator());
    }
    
    class Observator implements WindowListener{
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
}
