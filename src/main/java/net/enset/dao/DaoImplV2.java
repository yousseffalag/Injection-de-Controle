package net.enset.dao;

import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao{

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 23.00;
    }
}
