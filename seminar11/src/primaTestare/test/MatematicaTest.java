package primaTestare.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import primaTestare.Matematica;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class MatematicaTest {
    Matematica matematica;

    @Before
    public void setUp() throws Exception {
        matematica = new Matematica();
    }

    @Test
    public void testSumaCorecta(){
        Assert.assertEquals("metoda suma este gresita",3,matematica.suma(1,2));
    }

    @Test
    public void testRaportCorect(){
        double rezultat = matematica.raport(24,6);
        Assert.assertEquals("metoda raport este gresita",4.0,rezultat,0.01);
    }

    @Test
    public void testRaportCorect2(){
        double rezultat = matematica.raport(27,6);
        Assert.assertEquals("metoda raport este gresita",4.5,rezultat,0.01);
    }

    @Test
    public void testRaportShouldThrowException(){
        try {
            double rezultat = matematica.raport(27, 0);
            matematica.raport(34,0);
            fail("Nu trebuia sa ajunga aici");
        }catch (IllegalArgumentException ex){

        }
    }

    @Test
    public void testEsteParCorect() {
        Assert.assertTrue(matematica.estePar(6));
        Assert.assertTrue(matematica.estePar(12));
        Assert.assertTrue(matematica.estePar(78));
        Assert.assertFalse(matematica.estePar(5));
    }

    @Test
    public void testNNumerePareListNotNull() {
        List<Integer> lista = matematica.nNumerePare(2);
        Assert.assertNotNull(lista);
    }
}