package pl.edu.wszib.springwprowadzenie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import pl.edu.wszib.springwprowadzenie.configuration.ApplicationProperties;
import pl.edu.wszib.springwprowadzenie.model.Samochod;
import pl.edu.wszib.springwprowadzenie.model.Silnik;
import pl.edu.wszib.springwprowadzenie.model.zoo.Lew;
import pl.edu.wszib.springwprowadzenie.model.zoo.Zwierze;

import java.util.List;

@EnableConfigurationProperties(ApplicationProperties.class)
@SpringBootApplication
public class SpringWprowadzenieApplication implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext context;
    private static final Logger logger = LoggerFactory.getLogger(SpringWprowadzenieApplication.class);

    @Autowired
    ApplicationProperties applicationProperties;



   @Autowired
   private Zwierze lew;

    @Autowired
    private Silnik silnik;

    @Autowired
    private Samochod samochod;

    @Autowired
    private List<String> list;


    public static void main(String[] args) {
        SpringApplication.run(SpringWprowadzenieApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//    silnik.isZepsuty();
//    samochod.odpal();
//        logger.info("{}", list);
//        lew.gromada();
//        for (String name : context.getBeanDefinitionNames()) {
//            logger.info(name);
//        }
    logger.info(applicationProperties.getTest());
    logger.info(applicationProperties.getSuperClass().getTest2());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
