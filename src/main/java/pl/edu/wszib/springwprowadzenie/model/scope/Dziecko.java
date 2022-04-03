package pl.edu.wszib.springwprowadzenie.model.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dziecko {

    private final static Logger logger = LoggerFactory.getLogger(Dziecko.class);

    private Ciastko ciastko;

    public Dziecko(Ciastko ciastko) {
        this.ciastko = ciastko;
    }

    public void zjedzCiastko() {
        if(ciastko.isZjedzone()) {
            logger.info("Już zjedzone");
        } else {
            ciastko.zjedz();
            logger.info("Chomp");
        }
    }

}
