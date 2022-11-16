package block7crud;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonaRepository extends CrudRepository<Persona, Long> { //Interfaz que uso de repositorio para garantizar la persistencia de los datos de la clase Persona
    Persona findPersonaByNombre(String nombre); // Me busca la persona por nombre. Si lo encuentra, me devuelve todas las columnas de la entidad Persona
    Persona findPersonaById(long id); // Me busca la persona por id. // Si lo encuentra, me devuelve todas las columnas de la entidad Persona
}
