package block5properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//Clase que imprime el segundo valor
public class Clase2 implements CommandLineRunner {
    @Value("${my.number}")
    private String numero; // Asigno el valor que se encuentra en la segunda línea del fichero application.properties

    @Override
    public void run(String... args) throws Exception {
        System.out.println("El valor de my.number es: " + numero); // Imprimo el mensaje más el valor que paso como parámetro
    }
}
