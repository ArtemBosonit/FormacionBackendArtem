package block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.function.BiConsumer;

@RestController // Injecto este controlador para el mantenimiento de los datos de la Entidad Persona.
@RequestMapping(value="/persona") // Uso esta anotación para que todas las llamadas al servicio web sean de tipo persona.
public class ControladorPersona {

    @Autowired
    private PersonaService personaService; // Busca un objeto de la interfaz PersonaService para implementarla junto a los métodos haciendo referencia a esta.
    @Autowired
    private PersonaRepository personaRepository; //Busca un objeto de la interfaz PersonaRepository para implementarla junto a los métodos haciendo referencia a esta.

    @PostMapping // Método del controlador para añadir una nueva persona haciendo la petición post por el identificador. Mando los datos por el body en formato JSON.
    public void crearPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
    }


    @PutMapping(value="/{id}") // Método del controlador para modificar las columnas de la entidad Persona haciendo la petición put por el identificador. Mando los datos por el body en formato JSON.
    public Persona actualizarPersona(@PathVariable long id, @RequestBody Persona newpersona) {
        Persona persona = personaRepository.findPersonaById(id);
        persona.setNombre(newpersona.getNombre());
        persona.setEdad(newpersona.getEdad());
        persona.setPoblación(newpersona.getPoblación());
        return personaRepository.save(persona);
    }

    @DeleteMapping(value="/{id}") // Método del controlador para eliminar una persona haciendo la petición put por el identificador.
    public void eliminarPersona(@PathVariable long id){
        personaService.eliminarPersona(id);
    }

    @GetMapping(value="/{id}") // Método del controlador para consultar por id de la entidad Persona haciendo la petición put por el identificador.
    public Persona obtenerPersona(@PathVariable long id) throws FileNotFoundException {
        return personaService.obtenerPersona(id);
    }

    @GetMapping(value="/nombre/{nombre}") // Método del controlador para consultar por nombre de la entidad Persona haciendo la petición put por el nombre.
    public Persona obtenerPersonaNombre(@PathVariable String nombre) {
        return personaRepository.findPersonaByNombre(nombre);
    }

}
