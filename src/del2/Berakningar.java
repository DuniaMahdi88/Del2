package del2;


import jdk.swing.interop.SwingInterOpUtils;

public class Berakningar {

    // Definierar attributen för klassen Berakningar
    private int nyRad;
    private int raknaTecken;


    //Konstruktor för att skapa objekt från klassen Berakningar
        public Berakningar() {
            nyRad = 0;
            raknaTecken = 0;
    }


    public int antalTecken() {
        return raknaTecken;
    }

    //Metod för att returnera värdet på rader
    public int antalRader() {
        return nyRad;
    }


    //En metod som räknar antal tecken
    public void raknaTecken(String s) {
        //Ger längden på strängen
        raknaTecken = raknaTecken + s.length();
    }

    //En metod som lägger till en ny rad
    public void nyRad() {
        nyRad++;
    }

    //Metod som Kollar om användaren har skrivit ordet stop
    public boolean isStop(String text) {
        //Kör en loop
            if (text.equals("stop")) {
                return true;
            }
            else {
                return false;
            }
    }
}


