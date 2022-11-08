package block5properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class Clase2 implements CommandLineRunner {
    @Value("${my.number}")
    private String numero;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("El valor de my.number es: " + numero);
    }
}
