package tests;

import classes.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {
    @Test
    public void getSex()
    {
        Persoana persoana = new Persoana("Stanescu","1914194142222");
        assertEquals("M",persoana.getSex());
    }
    @Test
    public void boundaryGetSex(){
       Persoana persoana1 = new Persoana("Stanescu","3914194142222");
        Persoana persoana2 = new Persoana("Stanescu","6214319414222");
        assertEquals("M",persoana1.getSex());
        assertEquals("F",persoana2.getSex());
    }

    @Test
    void crossCheckGetSex() {
        Persoana persoana = new Persoana("Stanescu","2914194142222");
        assertEquals(persoana.CNP.charAt(0)%2==1?"M":"F",persoana.getSex());
    }

    @Test
    public void errorCheckGetSex() {
        Persoana persoana = new Persoana("Stanescu","091494142222");
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getSex();
            }
        });
    }
    //vezi timeout
    @Test
    public void performanceGetSex(){
        Persoana persoana = new Persoana("Stanescu","091494142222");
        assertTimeout(Duration.ofMillis(100), new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getSex();
            }
        });
    }

    @Test
    public void formatCheckGetSex(){
        Persoana persoana = new Persoana("Stanescu","191494142222");
        Persoana persoana1 = new Persoana("Stanescu","291494142222");
        assertEquals("M",persoana.getSex());
        assertEquals("F",persoana.getSex());
    }

    @Test
    void checkRangeSex() {
        Persoana persoana = new Persoana("Stanescu","191494142222");
        assertEquals("N/A",persoana.getSex());
    }

    @Test
    void existanceGetSex() {
        Persoana pers = new Persoana("Stanescu",null);
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                pers.getSex();
            }
        });
    }
}