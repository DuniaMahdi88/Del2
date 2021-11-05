package del2;

import org.junit.jupiter.api.Test;
import  static org.junit.Assert.assertEquals;

public class JunitTestfall {

    @Test
    public void testAntalTecken () {

//Arrange
        Berakningar resultat = new Berakningar();

        //Act
        resultat.raknaTecken("Hur många tecken är det?");
        int actual = resultat.antalTecken();


        //Assert
        int expected = 19;
        assertEquals(expected, actual);
    }


    @Test
    public void testAntalRader () {

//Arrange
        Berakningar resultat = new Berakningar();

//Act
        resultat.nyRad();
        int actual = resultat.antalRader();

//Assert
int expected = 1;
assertEquals(expected, actual);
    }


    @Test
    public void stop () {

//Arrange
        Berakningar resultat = new Berakningar();

//Act
        boolean actual = resultat.isStop("stop");
        if(resultat.isStop("stop")) {
            System.out.println("Programmet Avslutas!");
        }

//Assert
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
