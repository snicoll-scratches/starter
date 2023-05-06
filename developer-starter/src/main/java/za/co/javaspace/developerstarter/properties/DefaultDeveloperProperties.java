package za.co.javaspace.developerstarter.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("developer")
public class DefaultDeveloperProperties {

    /**
     * Name of a developer
     */
    private String name;

    /**
     * Experience of a developer
     */
    private String experience;

    /**
     * Coding language of developer
     */
    private String language;
}
