package pl.edu.wszib.springwprowadzenie.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Ferrari")
public class Samochod {

    private static final Logger logger = LoggerFactory.getLogger(Samochod.class);
//    @Autowired
    private  Silnik silnik;

//    public Samochod(Silnik silnik) {
//        this.silnik = silnik;
//    }
//
    @Autowired
    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }


    public void odpal() {
        if(silnik == null) {
            logger.info("Brakuje silnika");
            return;
        }

        if(silnik.isZepsuty()) {
            logger.info("Silnik nie dziala");
            return;
        }

        logger.info("Odpalilem");


    }

    public Silnik getSilnik() {
        return silnik;
    }
}
