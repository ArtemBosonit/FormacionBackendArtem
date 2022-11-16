package block7crud;

import java.io.FileNotFoundException;

public interface PersonaService { // Interfaz de servicio en la que creo los métodos de la clase Persona
    void crearPersona(Persona persona);
    void eliminarPersona(long id);
    Persona obtenerPersona(long id) throws FileNotFoundException;
}
