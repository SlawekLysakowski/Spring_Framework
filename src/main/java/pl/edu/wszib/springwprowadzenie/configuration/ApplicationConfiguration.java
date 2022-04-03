package pl.edu.wszib.springwprowadzenie.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.edu.wszib.springwprowadzenie.model.mikolaj.DzieckoOczekujaceNaPrezent;
import pl.edu.wszib.springwprowadzenie.model.scope.Ciastko;
import pl.edu.wszib.springwprowadzenie.model.scope.Dziecko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ApplicationConfiguration {
    @Bean(name = "Karol")
    public String name() {
        return "Karol";
    }
    @Bean
    public String surname() {
        return "Nowak";
    }


    @Bean
    public List<String> list(@Qualifier("Karol") String name, String surname) {

        return Arrays.asList(name, surname);
    }

    @Scope("prototype")
    @Bean
    public Ciastko ciastko() {
        return new Ciastko();
    }
    @Bean
    public Dziecko jas(Ciastko ciastko) {
        Dziecko jas = new Dziecko(ciastko);
        jas.zjedzCiastko();
        return jas;
    }
    @Bean
    public Dziecko malgosia(Ciastko ciastko) {
        Dziecko malgosia = new Dziecko(ciastko);
        malgosia.zjedzCiastko();
        return malgosia;
    }

    public Object object1(Object object3) {
        return new Object();
    }
    public Object object2(Object object1) {
        return new Object();
    }
    public Object object3(Object object2) {
        return new Object();
    }
}
