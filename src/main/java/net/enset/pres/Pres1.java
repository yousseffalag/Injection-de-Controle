package net.enset.pres;

import net.enset.dao.DaoImpl;
import net.enset.dao.DaoImplV2;
import net.enset.metier.MetierImpl;

public class Pres1 {

    public static void main(String [] args){

        MetierImpl metier = new MetierImpl(new DaoImpl());
        System.out.println("Res= " + metier.calcul());

    }
}
