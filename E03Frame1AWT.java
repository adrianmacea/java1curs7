import java.awt.*;

public class E03Frame1AWT{
    public static void main(String [] args){
        Frame f = new Frame("TITLU");
        Button b = new Button("PUSH ME");
        f.setVisible(true);
        f.setSize(800,500);
        f.setLocation(900,450);
        f.add(b);
    }
}