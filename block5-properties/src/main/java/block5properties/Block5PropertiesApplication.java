package block5properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.properties") // Fichero de propiedad a través del cual imprimo los valores
// Clase principal que ejecuta el programa
public class Block5PropertiesApplication {
// Me ejecuta el application.properties. Sí new.property tiene un valor, se ejecuta el que está declarado en el application.yml
	public static void main(String[] args) {
		SpringApplication.run(Block5PropertiesApplication.class, args);
	}

}
