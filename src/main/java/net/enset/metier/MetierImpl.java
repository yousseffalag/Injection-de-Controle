package net.enset.metier;

import net.enset.dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao; // couplage faible


    // Injection de dépendances via le consructeur
    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    public MetierImpl(){}

    @Override
    public double calcul(){
        double t = dao.getData();
        return t*43/3;
    }

    // Injecter l'attribut dao
    void setDAO(IDao dao){
        this.dao = dao;
    }

}
