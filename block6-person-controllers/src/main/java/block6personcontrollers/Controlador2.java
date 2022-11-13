package block6personcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/controlador2")
public class Controlador2 {

    @Autowired
    Persona persona;
    @Autowired
    Controlador1 controlador1; // Importo los campos y los métodos de la clase Controlador1.

    @GetMapping("/getPersona") // Método para obtener el objeto Persona con la edad multiplicada por dos.
    public String getPersona() {

        return "La persona " + persona.getNombre() + " tiene " + (persona.getEdad() * 2) + " y vive en " + persona.getCiudad();
    }

    @GetMapping("/getCiudad") // Método para devolver la lista de ciudades existentes del controlador1.
    @Bean
    public List<Ciudad> getCiudad() {
        return controlador1.listaCiudades;
    }
}