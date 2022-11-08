package block5properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Clase1 implements CommandLineRunner {

    @Value("${greeting}")
    private String mensaje;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("El valor de greeting es: " + mensaje);
    }
}
