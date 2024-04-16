package dao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        		/*
		 se connecter a la base de donnes et recuperer
		  la temperature
		 */
        System.out.println("version base de donnes");
        double temp = Math.random()*40;
        return temp;
    }
}
