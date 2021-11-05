package del2;

import java.util.Scanner;

public class TextInlasning {
    public static void main(String[] args) {

        //Ber användaren att skriva in något
        System.out.println("Välkommen till den här ordräknaren, " +
                "Skriv in så många rader du vill och avsluta med att " +
                "skriva stop på en ensam rad");

        //Hanterar input
        Scanner input = new Scanner(System.in);

        //Sparar ned input från användaren
        String inputText = input.nextLine();

        //Skapar objekt av klassen Berakningar
        Berakningar resultat = new Berakningar();

        //loopa tills ordet stop är skrivet
        while (!resultat.isStop(inputText)) {

            //räkna antalet tecken i text
            resultat.raknaTecken(inputText);

            //lägg en in en ny rad
            resultat.nyRad();

            //läs in en ny textrad
            inputText = input.nextLine();
        }

        //Skriver ut resultatet (antal rader och tecken)
        System.out.print("Du skrev " + resultat.antalRader()
                + " rader " + " med " + resultat.antalTecken() + " tecken ");

    }
}
