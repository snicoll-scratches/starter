package za.co.javaspace.developerstarter.autoconfig;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import za.co.javaspace.developerstarter.controller.DeveloperDetailsController;
import za.co.javaspace.developerstarter.properties.DefaultDeveloperProperties;
import za.co.javaspace.developerstarter.properties.DeveloperProperties;

@Configuration
@ComponentScan(basePackageClasses = {DeveloperDetailsController.class})
@EnableConfigurationProperties({DeveloperProperties.class, DefaultDeveloperProperties.class})
public class DeveloperControllerAutoConfig {

}
