package block5profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@Profile("INTEGRATION")
@Configuration
@ComponentScan("artem.bosonit.block5profiles")
@EnableAutoConfiguration
@RestController

public class integration {

    @Value("${spring.mensaje}") // Devuelve el contenido del mensaje del fichero de propiedades application-INT.properties
    private String mensaje;
    @Bean
    CommandLineRunner ejecutaint()
    {
        return args ->
        {
            System.out.println(mensaje);
        };
    }
    }

