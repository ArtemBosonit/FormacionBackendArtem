package block5commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("artem.bosonit.block5commandlinerunner")
@EnableAutoConfiguration
public class Clase3 {
    //Ejercicio 1
    @Bean
    CommandLineRunner ejecutaclase3()
    {
        return args ->
        {
            System.out.println("Soy la tercera clase");
        };
    }

    //Ejercicio 2

}
