package block5properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//Clase que imprime el primer valor
public class Clase1 implements CommandLineRunner {

    @Value("${greeting}") // Asigno el valor que se encuentra en la primera línea del fichero application.properties
    private String mensaje;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("El valor de greeting es: " + mensaje); // Imprimo el mensaje más el valor que paso como parámetro
    }
}
