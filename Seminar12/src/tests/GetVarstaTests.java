package tests;

import classes.CNPGresitException;
import classes.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class GetVarstaTests {
    @Test
    void getVarstaTets() throws CNPGresitException {
        Persoana pers = new Persoana("Ana","601020142222");
        assertEquals(21,pers.getVarsta());
    }
    @Test
    void boundaryLowGetVarsta() throws CNPGresitException {
        Persoana pers2 = new Persoana("Ana","622010142222");
        assertEquals(0,pers2.getVarsta());
    }
    @Test
    void boundaryHighGetVarsta() throws CNPGresitException {
        Persoana pers = new Persoana("Ana","300010142222");
        assertEquals(222,pers.getVarsta());
    }

    @Test
     void errorTestGetVarsta() {
        Persoana persoana = new Persoana("Ana","589010142222");
        assertThrows(CNPGresitException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }
    @Test
    void errorAlfaNumTestGetVarsta() {
        Persoana persoana = new Persoana("Ana","32501gh42222");
        assertThrows(NumberFormatException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }
    @Test
    public void performanceGetVarsta() throws CNPGresitException {
        Persoana persoana = new Persoana("Ana","601020142222");
        assertTimeout(Duration.ofMillis(100), new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }
    @Test
    public void errorIndexTestGetVarsta(){
        Persoana persoana = new Persoana("Ana","32501");
        assertThrows(IndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }
    @Test
    public void orderTestGetVarsta() throws CNPGresitException {
        Persoana pers1 = new Persoana("Ana","1980101222324");
        Persoana pers2 = new Persoana("Ana","5000101222324");
        assertTrue(pers1.getVarsta()> pers2.getVarsta());
    }

    @Test
    void existanceTestGetVarsta() {
        Persoana persoana = new Persoana("Ana",null);
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    //Cardinality testezi pentru 0 1 n

}