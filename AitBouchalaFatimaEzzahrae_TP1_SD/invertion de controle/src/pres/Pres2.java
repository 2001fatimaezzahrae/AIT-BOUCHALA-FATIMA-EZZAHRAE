package pres;

import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        java.lang.String fileName;
        Scanner scanner = new Scanner(new File(fileName = "config.txt"));

        String daoClassName = scanner.nextLine();
        /* instantiation dynamique */
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        String name;
        Method method = cMetier.getMethod(name = "setDao", IDao.class);

        //metier.setDao(dao);
        /* excute la methode */
        method.invoke(metier, dao);
        System.out.println("Resultats==>" + metier.calcul());

    }
}