package za.co.javaspace.developerstarter.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import za.co.javaspace.developerstarter.controller.DeveloperDetailsController;

@AutoConfiguration
@ComponentScan(basePackageClasses = {DeveloperDetailsController.class})
public class DeveloperControllerAutoConfiguration {

}
