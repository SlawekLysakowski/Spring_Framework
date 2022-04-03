package pl.edu.wszib.springwprowadzenie.model.mikolaj;

import org.springframework.stereotype.Component;

@Component
public class Rower implements Prezent{

    @Override
    public PrezentType prezentType() {
        return PrezentType.ROWER;
    }

}
