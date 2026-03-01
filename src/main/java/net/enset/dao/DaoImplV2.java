package net.enset.dao;

public class DaoImplV2 implements IDao{

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 23.00;
    }
}
