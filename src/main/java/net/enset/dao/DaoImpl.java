package net.enset.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData(){
        System.out.println("Version Base de données");
        return 41.00;
    }

}
