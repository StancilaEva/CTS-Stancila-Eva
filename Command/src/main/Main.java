package main;

import commandClasses.Autobuz;
import commandClasses.Comanda;
import commandClasses.ComandaPlecareTraseu;
import commandClasses.InvokerOperator;

public class Main {
    public static void main(String[] args) {
        Comanda comanda = new ComandaPlecareTraseu(123,new Autobuz(2));
        Comanda comanda1 = new ComandaPlecareTraseu(124,new Autobuz(6));
        Comanda comanda2 = new ComandaPlecareTraseu(462,new Autobuz(9));
        Comanda comanda3 = new ComandaPlecareTraseu(532,new Autobuz(10));
        InvokerOperator invokerOperator = new InvokerOperator();
        invokerOperator.addComanda(comanda);
        invokerOperator.addComanda(comanda1);
        invokerOperator.addComanda(comanda2);
        invokerOperator.addComanda(comanda3);
        invokerOperator.executaComanda();
        invokerOperator.executaComanda();
        invokerOperator.executaComanda();
        invokerOperator.executaComanda();
        invokerOperator.executaComanda();
    }
}
