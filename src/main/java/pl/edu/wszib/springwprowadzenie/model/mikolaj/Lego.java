package pl.edu.wszib.springwprowadzenie.model.mikolaj;

import org.springframework.stereotype.Component;

@Component
public class Lego implements Prezent{

    @Override
    public PrezentType prezentType() {
        return PrezentType.LEGO;
    }

}
