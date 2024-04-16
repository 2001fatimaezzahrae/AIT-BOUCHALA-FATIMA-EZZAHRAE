package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main (String[]args) {

    /*
      Injection des dependence par instantiation statique
       => couplage fort =>new
     */
    DaoImpl dao=new DaoImpl();
    MetierImpl metier= new MetierImpl(dao);
    //metier.setDao(dao);
    System.out.println("Resultats= "+((MetierImpl) metier).calcul());

}

}
