package com.mytests.spring.springbootconfigpropsnames;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootConfigpropsNamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigpropsNamesApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(PropsUsingNameAnno propsUsingNameAnno) {
            return args -> {
                System.out.println("----@Name-annotated config properties test:------");
                System.out.println(propsUsingNameAnno.getProp1());
                System.out.println(propsUsingNameAnno.getProp2());
                System.out.println(propsUsingNameAnno.getProp3().getProp4());
                System.out.println(propsUsingNameAnno.getProp3().getProp5());
                System.out.println("-------------------------------------------------");
            };
        }
}
