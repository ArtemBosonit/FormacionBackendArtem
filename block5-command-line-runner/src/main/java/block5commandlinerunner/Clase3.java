package block5commandlinerunner;

import org.springframework.beans.factory.annotation.Value;
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
//    @Bean //Sirve para enviar el método a la clase principal, desde dónde se ejecutará el programa
//    CommandLineRunner ejecutaclase3()
//    {
//        return args ->
//        {
//            System.out.println("Soy la tercera clase");
//        };
//    }

    //Ejercicio 2
    @Value("Soy la tercera clase") // Contenido del valor
    private String mensaje; // Parámetro de tipo String que contiene un valor
    @Bean
    CommandLineRunner ejecutaclase3()
    {
        return args ->
        {
            System.out.println(mensaje); //Valor que se imprime al pasar el parámetro al ejecutar el programa
        };
    }

}
