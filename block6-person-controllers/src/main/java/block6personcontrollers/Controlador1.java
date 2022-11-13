package block6personcontrollers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/controlador1")
public class Controlador1 {


    @Autowired
    Persona persona; // Creo un objeto de la clase Persona e injecto las dependencias.
    List<Ciudad> listaCiudades = new ArrayList<>(); // Creo una lista de ciudades.

    @GetMapping("/addPersona") // Método para devolver el objeto Persona creado introduciendo en los headers el nombre, la edad y la ciudad
    public String addPersona(@RequestHeader("nombre") String nombre, @RequestHeader("edad") int edad, @RequestHeader("ciudad") String ciudad) {

        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setCiudad(ciudad);

        return "La persona " + persona.getNombre() + " tiene " + persona.getEdad() + " y vive en " + persona.getCiudad();
    }

    @PostMapping("/addCiudad") // Método para añadir la Ciudad a la lista escribiendo los campos en el documento en formato JSON. Devuelve la ciudad añadida y la lista de ciudades existentes.
    public List<Ciudad> addCiudad(@RequestBody Ciudad ciudad){
        listaCiudades.add(ciudad);
        return listaCiudades;
    }

}
