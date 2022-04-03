package pl.edu.wszib.springwprowadzenie.model.zoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
//@Profile("asdf")
@Component
public class Sawanna implements Wybieg{

    @Override
    public List<Gromada> wybiegDla() {
        return Arrays.asList(Gromada.SSAK);
    }

}
