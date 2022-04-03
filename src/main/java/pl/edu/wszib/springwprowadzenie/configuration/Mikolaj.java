package pl.edu.wszib.springwprowadzenie.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springwprowadzenie.model.mikolaj.*;
@Configuration
public class Mikolaj {

    public DzieckoOczekujaceNaPrezent ania(@Qualifier("lalka") Prezent prezent) {
        Ania dziecko = new Ania();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

    public DzieckoOczekujaceNaPrezent kasia(@Qualifier("iphone")Prezent prezent) {
        Kasia dziecko = new Kasia();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

    public DzieckoOczekujaceNaPrezent krzys(@Qualifier("rower")Prezent prezent) {
        Krzys dziecko = new Krzys();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

    public DzieckoOczekujaceNaPrezent tomek(@Qualifier("lego")Prezent prezent) {
        Tomek dziecko = new Tomek();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

}
