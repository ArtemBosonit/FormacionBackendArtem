package block5profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@Profile("local")
@Configuration
@ComponentScan("artem.bosonit.block5profiles")
@EnableAutoConfiguration
@RestController

public class local {
    @Value("${spring.mensaje}") // Devuelve el contenido del mensaje del fichero de propiedades application.properties
    private String mensaje;
    @Bean
    CommandLineRunner ejecutalocal()
    {
        return args ->
        {
            System.out.println(mensaje);
        };
    }

}
