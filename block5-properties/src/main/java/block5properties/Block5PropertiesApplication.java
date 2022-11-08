package block5properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.yml")
public class Block5PropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Block5PropertiesApplication.class, args);
	}

}
