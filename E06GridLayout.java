import java.awt.*;
import java.awt.event.*;

public class E06GridLayout extends Frame{
    
    Button [] b = new Button[16];
    
    public E06GridLayout(){
        setLayout(new GridLayout(4,4,10,10)); 
        // manager de pozitionare grid layout,
        // 4 lini si 4 coloane cu dstanta de 10 pixeli intre linii si distanta de 10 pixeli intre coloane
        
        for(int i=0;i<16;i++){
            b[i] = new Button((i+1)+"");
            add(b[i]);
        }
        
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
        new E06GridLayout();
    }
}
