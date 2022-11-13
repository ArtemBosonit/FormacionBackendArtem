
package block5commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("artem.bosonit.block5commandlinerunner")
@EnableAutoConfiguration
public class Clase2 {
    //Ejercicio 1
    @Bean //Sirve para enviar el método a la clase principal, desde dónde se ejecutará el programa
    CommandLineRunner ejecutaclase2()
    {
        return args ->
        {
            System.out.println("Hola desde clase secundaria");
        };
    }


}
