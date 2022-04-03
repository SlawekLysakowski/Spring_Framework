package pl.edu.wszib.springwprowadzenie.model.mikolaj;

import org.springframework.stereotype.Component;

@Component
public class Lalka implements Prezent{
    @Override
    public PrezentType prezentType() {
        return PrezentType.LALKA;
    }
}
