package block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;

@Service
public class PersonaServiceImpl implements PersonaService { // Interfaz de servicio en la que implemento los métodos definidos en la clase PersonaService.

    @Autowired
    private PersonaRepository personaRepository; //Busca un objeto de la interfaz PersonaRepository para implementarla haciendo referencia a esta.

    @Override
    public void crearPersona(Persona persona) { // Método para crear una nueva persona en la tabla.
        personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(long id) { // Método para eliminar la persona por identificador.
        personaRepository.deleteById(id);
    }

    @Override
    public Persona obtenerPersona(long id) throws FileNotFoundException { // Método para obtener la persona por id. Si no lo encuentra, me saca un mensaje de excepción.
        return personaRepository.findById(id).orElseThrow(() -> new FileNotFoundException("Persona no encontrada"));
    }


}
