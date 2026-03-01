package net.enset.metier;

import net.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{

    @Autowired @Qualifier("d")
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
    public void setDAO(IDao dao){
        this.dao = dao;
    }

}
