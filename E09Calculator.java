/**
 * calculator cu operatiile de baza, doar pentru numere intregi
 */

import java.awt.*;
import java.awt.event.*;

public class E09Calculator extends Frame implements ActionListener{
    
    Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
    Panel p2 = new Panel(new GridLayout(4,4));
    
    TextField t1 = new TextField(28);
    
    Button [] b = new Button[16];
    
    int x,y; //au valoarea initiala implicita zero
    
    //nested class de tip enum pentru operatii
    enum Operatie{
        adunare,scadere,inmultire,impartire
    }
    
    Operatie op = Operatie.adunare; //op primeste valoare initiala adunarea, dar va fi rescris in switch dupa caz ...
        
    public E09Calculator(String nume){
        super("Calculator");
        setVisible(true);
        setLocation(900,450);
        setSize(500,300);
        setResizable(false);
        
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        
        p1.add(t1);
        t1.setText("0");
        
        for(int i=0;i<16;i++){
            b[i] = new Button();
            p2.add(b[i]);
            b[i].addActionListener(this); //toate butoanele au ca observator pe instanta clasei curente, pe this
        }
        
        b[0].setLabel("1");
        b[1].setLabel("2");
        b[2].setLabel("3");
        b[3].setLabel("+");
        
        b[4].setLabel("4");
        b[5].setLabel("5");
        b[6].setLabel("6");
        b[7].setLabel("-");
        
        b[8].setLabel("7");
        b[9].setLabel("8");
        b[10].setLabel("9");
        b[11].setLabel("*");
        
        b[12].setLabel("0");
        b[13].setLabel("C");
        b[14].setLabel("=");
        b[15].setLabel("/");
        
        addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent ev){
                    System.exit(0);
                }
            }
        );
    }
    
    //trebuie sa suprascriem metoda abstracta a inetretei ActionListener (pt ca este implementata de clasa noastra E09Calculator)
    public void actionPerformed(ActionEvent ev){
        // facem conversia explicita la tipul componentei pt ca getSource returneaza un object 
        //(stim ca toate sunt butoane deci nu mai trebuie sa tartam exceptia ClasCastException)
        Button bx = (Button) ev.getSource(); 
        try{
            //ca sa ne apara ca scriem numarul in t1, facem de fapt acest calcul
            //x este intotdeauna numarul care apare scris in t1
            x = x*10+Integer.parseInt(bx.getLabel());
            t1.setText(x+"");
            
            //in momentul in care nu mai tastam un butoan cu cifra va fi aruncat NumberFormatException
            //tratam exceptia cu un switch in care definim ce sa faca daca apasam oricare dintre butoanele non-cifre
        }catch(NumberFormatException e){
            switch(bx.getLabel()){
                case "+":
                    y=x; //l-am salvat pe x in y
                    x=0; //apoi l-am resetat la zero pentru a putea scrie al doilea numar
                    op = Operatie.adunare;
                break;
                case "-":
                    y=x;
                    x=0;
                    op = Operatie.scadere;
                break;
                case "*":
                    y=x;
                    x=0;
                    op = Operatie.inmultire;
                break;
                case "/":
                    y=x;
                    x=0;
                    op = Operatie.impartire;
                break;
                case "=":
                    switch(op){
                        case adunare:
                            x += y;
                            t1.setText(x+"");
                        break;
                        case scadere:
                            x = y-x;
                            t1.setText(x+"");
                        break;
                        case inmultire:
                            x *= y;
                            t1.setText(x+"");
                        break;
                        case impartire: //ignoram modulul
                            x = y/x;
                            t1.setText(x+"");
                        break;
                    }
                break;
                case "C": //resetam toti parametrii la valorile initiale
                    x = 0;
                    y = 0;
                    op = Operatie.adunare;
                    t1.setText("0");
                break;
            }
        }
    }
    
    //metoda prncipala nu face altceva decat sa ne creeze o instanta a clasei E09Calculator
    public static void main(String [] args){
        new E09Calculator("Calculator");
    }
}