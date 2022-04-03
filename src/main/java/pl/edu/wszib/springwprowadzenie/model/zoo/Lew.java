package pl.edu.wszib.springwprowadzenie.model.zoo;

import org.springframework.stereotype.Component;


public class Lew implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.SSAK;
    }

    @Override
    public String nazwa() {
        return "Lew";
    }

}
