package pl.edu.wszib.springwprowadzenie.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class Silnik {

    private String id;
    private boolean zepsuty = false;
//    @Autowired
//    private Samochod samochod;

    public Silnik() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void zepsuj() {
        zepsuty = true;
    }

    public boolean isZepsuty() {
        return zepsuty;
    }
}
