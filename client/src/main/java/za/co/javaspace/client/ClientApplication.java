package za.co.javaspace.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import za.co.javaspace.developerstarter.service.DeveloperService;

import java.util.Arrays;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(ClientApplication.class);

	@Autowired
	private DeveloperService developerService;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(developerService.experience());
	}
}
