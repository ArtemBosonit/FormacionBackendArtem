package block5commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Block5CommandLineRunnerApplication {

	//Ejercicio 1
	@PostConstruct
	public static void ejecutaclase() {
		System.out.println("Hola desde clase inicial");
	}

	public static void main(String[] args){
		ejecutaclase();
		SpringApplication.run(Block5CommandLineRunnerApplication.class,args);

	}



}


