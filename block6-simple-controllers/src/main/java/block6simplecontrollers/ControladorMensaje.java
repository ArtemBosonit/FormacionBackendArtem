package block6simplecontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMensaje {

    @GetMapping("/user/{nombre}") // Uso el GetMapping para establecer la ruta del localhost al introducirlo en el buscador
    public String user(@PathVariable String nombre) { // Método para obtener "Hola" más el nombre que paso como parámetro
        return "Hola " + nombre;
    }
}
