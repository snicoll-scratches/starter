package za.co.javaspace.developerstarter.autoconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.co.javaspace.developerstarter.properties.DefaultDeveloperProperties;
import za.co.javaspace.developerstarter.properties.DeveloperProperties;
import za.co.javaspace.developerstarter.service.DefaultDeveloper;
import za.co.javaspace.developerstarter.service.DeveloperService;

@Configuration
@ConditionalOnClass(DeveloperService.class)
@EnableConfigurationProperties({DeveloperProperties.class, DefaultDeveloperProperties.class})
public class DeveloperServiceAutoConfig {

    private final Logger logger = LoggerFactory.getLogger(DeveloperServiceAutoConfig.class);

    //@Bean
    //@ConditionalOnMissingBean
    public DeveloperService defaultDriver() {
        return new DefaultDeveloper(
                "javaSpace",
                "Java",
                "4yrs"
        );
    }

    @Bean
    @ConditionalOnMissingBean
    public DeveloperService driverService(DefaultDeveloperProperties developerProperties) {
        logger.info("DefaultDeveloper created");
        return new DefaultDeveloper(
                developerProperties.getName(),
                developerProperties.getLanguage(),
                developerProperties.getExperience()
        );
    }
}
