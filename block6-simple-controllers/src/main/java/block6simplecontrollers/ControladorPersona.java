package block6simplecontrollers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorPersona {
// Uso el PostMapping para establecer la ruta del localhost al introducirlo en el buscador
    @PostMapping(path="/useradd", consumes = MediaType.APPLICATION_JSON_VALUE) // Con MediaType defino la transformación del objeto en formato JSON
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona){
        // Con ResponseEntity defino la ruta de la clase Persona y con RequestBody guardo el objeto de la clase Persona
        Persona p = new Persona();
        p.setNombre(persona.getNombre());
        p.setEdad(persona.getEdad()+1);
        p.setCiudad(persona.getCiudad());

        return ResponseEntity.ok(p); //Mando la petición del objeto JSON

    }
}
