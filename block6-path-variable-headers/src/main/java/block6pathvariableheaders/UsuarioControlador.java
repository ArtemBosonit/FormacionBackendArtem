package block6pathvariableheaders;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class UsuarioControlador {

    // Funcionamiento de la aplicación como la del ejemplo
    private static final String saludo = "¡Hola, %s!"; // Por defecto devuelve este mensaje con el saludo y el nombre
    private final AtomicLong contador = new AtomicLong(); //Contador que cuenta automáticamente los ids del usuario

    @GetMapping("/user") //Devuelvo el objeto Usuario estableciendo estos valores por defecto.
    public Usuario user(@RequestParam(value = "nombre", defaultValue = "José") String nombre, @RequestParam(value = "departamento", defaultValue = "Producción") String departamento) {
        return new Usuario(contador.incrementAndGet(), String.format(saludo, nombre), departamento);
    }

    @PostMapping(path="/user", consumes = MediaType.APPLICATION_JSON_VALUE) // Con MediaType defino la transformación del objeto en formato JSON
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        // Con ResponseEntity defino la ruta de la clase Usuario y con RequestBody guardo el objeto de la clase Usuario
        Usuario u = new Usuario();
        u.setId(usuario.getId());
        u.setNombre(usuario.getNombre());
        u.setDepartamento(usuario.getDepartamento());

        return ResponseEntity.ok(u); //Mando la petición del objeto JSON

    }

    @GetMapping("/user/{id}") // Uso el GetMapping para establecer la ruta del localhost al introducirlo en el buscador. La ruta de la variable es el identificador.
    public Usuario user(@PathVariable long id) { //Meto parámetros en el path.
        List<Usuario> usuarios = new ArrayList<>(); // Creo una lista de usuarios y añado cuatro usuarios.
        usuarios.add(new Usuario(1, "Alba", "Investigación Comercial"));
        usuarios.add(new Usuario(2, "Juan", "Recursos Humanos"));
        usuarios.add(new Usuario(3, "Ramón", "I+D+I"));
        usuarios.add(new Usuario(4, "Iván", "Marketing"));

        for(Usuario us : usuarios){
            if(us.getId() == id){ // Sí el identificador existe, devuelvo el objeto.
                return us;
            } else { // En caso de no existir saca ese mensaje.
                System.out.println("El usuario asociado a ese identificador no existe");
            }
        }
        return null;
    }


    @PutMapping("/put") // Uso el PutMapping para mandar los parámetros de id, nombre y departamento del usuario.
    @ResponseBody
    public String añadirIds(@RequestParam(name = "id") long id, @RequestParam String nombre, @RequestParam String departamento) { //Me devuelve el mensaje
        return "ID: " + id + " Nombre: " + nombre + " Departamento " + departamento;
    }

}
