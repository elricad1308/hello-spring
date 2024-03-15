package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages="org.example")
@Configuration
public class ProjectConfig {

    /*@Bean
    @Primary
    Goose goose1 () {
        Goose g = new Goose();
        g.setName("Xiampoo");

        return g;
    }*/

    @Bean
    public Goose xiampoo () {
        Goose g = new Goose();
        g.setName("Xiampoo");

        return g;
    }

    @Bean
    public Goose jozzy () {
        Goose g = new Goose();
        g.setName("Jozzy");

        return g;
    }

}
