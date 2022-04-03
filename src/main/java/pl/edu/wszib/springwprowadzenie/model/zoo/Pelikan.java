package pl.edu.wszib.springwprowadzenie.model.zoo;

import org.springframework.stereotype.Component;


public class Pelikan implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.PTAK;
    }

    @Override
    public String nazwa() {
        return "Pelikan";
    }

}
