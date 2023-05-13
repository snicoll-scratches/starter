package za.co.javaspace.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import za.co.javaspace.developerstarter.service.DeveloperService;

@SpringBootApplication
public class ClientApplication {

    private final Logger logger = LoggerFactory.getLogger(ClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(DeveloperService developerService) {
        return args -> logger.info(developerService.name());
    }

}
