package pl.edu.wszib.springwprowadzenie.model.zoo;

import org.springframework.stereotype.Component;

import java.util.List;

public interface Wybieg {

    List<Gromada> wybiegDla();

    default boolean dodajZwierze(Zwierze zwierze) {

        return wybiegDla().contains(zwierze.gromada());
    }

}
