package block6personcontrollers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @Autowired
    Persona persona;

    @GetMapping("/controlador1/addPersona")
    public String addPersona(@RequestHeader("nombre") String nombre, @RequestHeader("edad") int edad, @RequestHeader("ciudad") String ciudad) {

        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setCiudad(ciudad);

        return "La persona " + persona.getNombre() + " tiene " + persona.getEdad() + " y vive en " + persona.getCiudad();
    }

}
