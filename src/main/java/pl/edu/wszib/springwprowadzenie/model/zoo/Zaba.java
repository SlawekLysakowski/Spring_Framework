package pl.edu.wszib.springwprowadzenie.model.zoo;

import org.springframework.stereotype.Component;

public class Zaba implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.PLAZ;
    }

    @Override
    public String nazwa() {
        return "Zaba";
    }

}
