/**
 * exercitiu recapitulativ
 * mostenirea unei clase abstarcte complet incapsulate
 * 
 * avem doua variante de a realiza constructorul clasei child:
 * cu super - vezi clasa Student
 * cu setteri - vezi clasa Angajat
 */


public abstract class Persoana{
    private String nume, prenume;
    
    //constructorul implicit folosit de clasa Angajat impreuna cu setterii
    public Persoana(){
    }
    
    //constructorul folosit de clasa Student
    public Persoana(String nume, String prenume){
        this.nume = nume;
        this.prenume = nume;
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    
    public String getNume(){
        return this.nume;
    }
    
    public String getPrenume(){
        return this.prenume;
    }
}