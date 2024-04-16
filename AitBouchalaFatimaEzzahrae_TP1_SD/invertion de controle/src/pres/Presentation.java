package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main (String[]args) {

    /*
      Injection des dependence par instantiation statique
       => couplage fort =>new
     */
    DaoImpl2 dao=new DaoImpl2();
    MetierImpl metier= new MetierImpl();
    metier.setDao(dao);
    System.out.println("Resultats= "+((MetierImpl) metier).calcul());

}

}
