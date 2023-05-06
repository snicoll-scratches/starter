package za.co.javaspace.developerstarter.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DefaultDeveloper implements DeveloperService {

    private String name;
    private String language;
    private String experience;

    @Override
    public String name() {
        return name;
    }

    @Override
    public String language() {
        return language;
    }

    @Override
    public String experience() {
        return experience;
    }
}
