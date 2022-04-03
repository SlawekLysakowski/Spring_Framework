package pl.edu.wszib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"demo", "pl.edu.wszib"})
public class DemoApplication implements CommandLineRunner, ApplicationContextAware {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	private ApplicationContext applicationContext;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public List<String> list2() {
		return new ArrayList<>();
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.error("Hello World {}", "123"); // "Hello World" + "123"
//		logger.error("Hello{} World {} {}", "123", 567, true);

//		try {
//			throw new RuntimeException();
//		} catch (RuntimeException e) {
//			logger.error("Something is broken", e);
//		}
//		logger.info("Hello World");


		logger.info("Number of objects : {}", applicationContext.getBeanDefinitionCount());
		for (String name : applicationContext.getBeanDefinitionNames()) {
			logger.info(name);
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}

