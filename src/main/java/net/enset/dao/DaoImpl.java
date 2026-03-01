package net.enset.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao{

    @Override
    public double getData(){
        System.out.println("Version Base de données");
        return 41.00;
    }

}
