package block6personcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    @Autowired
    Persona persona;

    @GetMapping("/controlador2/getPersona")
    public String getPersona() {

        return "La persona " + persona.getNombre() + " tiene " + (persona.getEdad() * 2) + " y vive en " + persona.getCiudad();
    }
}
