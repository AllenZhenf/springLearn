package main.java.springLearn.profileBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cook implements Dessert {
    Dessert dessert;
    @Autowired
    public void setDessert(Dessert dessert){
        this.dessert=dessert;
    }
}
