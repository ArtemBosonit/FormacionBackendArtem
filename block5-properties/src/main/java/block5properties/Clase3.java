package block5properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class Clase3 implements CommandLineRunner {
    @Value("${new.property:new.property no tiene valor.}") // Asigno el valor que no existe en el fichero application.properties
    private String mensaje3;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("El valor de new.property es: " + mensaje3);
    }
}
