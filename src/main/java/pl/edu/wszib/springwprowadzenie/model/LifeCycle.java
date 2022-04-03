package pl.edu.wszib.springwprowadzenie.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class LifeCycle {

    public final static Logger logger = LoggerFactory.getLogger(LifeCycle.class);

    private Silnik silnik;
    private Samochod samochod;

    public LifeCycle(Silnik silnik) {
        this.silnik = silnik;
        logger.info("Constructor");
    }

    @Autowired
    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
        logger.info("Setter");
    }
    @PostConstruct
    public void init() {
    logger.info("init");
    }
    @PreDestroy
    public void destroy() {
    logger.info("destroy");
    }


}

