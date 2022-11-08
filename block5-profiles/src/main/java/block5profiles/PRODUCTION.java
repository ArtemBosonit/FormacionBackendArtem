package block5profiles;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("artem.bosonit.block5profiles")
@EnableAutoConfiguration
@PropertySource("application.PRO.properties")
@Profile("PRODUCTION")
public class PRODUCTION {

    CommandLineRunner ejecutaproduccion()
    {
        return args ->
        {
            System.out.println("Hola desde el perfil PRODUCCIÓN");
        };
    }

}
