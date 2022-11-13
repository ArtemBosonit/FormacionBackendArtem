package block5commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
// Clase principal que ejecuta el programa
public class Block5CommandLineRunnerApplication {

	//Ejercicio 1

	public static void main(String[] args){ // Constructor main que ejecuta los dos mensajes de las demás clases
		SpringApplication.run(Block5CommandLineRunnerApplication.class,args);
	}

	@PostConstruct //Este mensaje se muestra el primero porque se inicializa justo después de la injección de la dependencia
	public static void ejecutaclase() {
		System.out.println("Hola desde clase inicial");
	}





}
