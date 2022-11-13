package block6personcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/controlador3/bean")
public class Controlador3 {

    @Autowired
    private Persona bean1; // Primer objeto de la clase Persona
    @Autowired
    private Persona bean2; // Segundo objeto de la clase Persona
    @Autowired
    private Persona bean3; // Tercer objeto de la clase Persona


    @Qualifier("bean")
    @GetMapping("/bean1") //Me devuelve el objeto que se llama bean1 realizando la petición GET en formato JSON.
    public Persona persona1(@PathParam("bean1") Persona bean1) {
        bean1 = new Persona("bean1", 25, "Logroño");
        return bean1;
    }

    @Qualifier("bean")
    @PostMapping("/bean2") //Me devuelve el objeto que se llama bean2 realizando la petición POST en formato JSON.
    public Persona persona2(@PathParam("bean2") Persona bean2) {
        bean2 = new Persona("bean2", 22, "Logroño");
        return bean2;
    }

    @Qualifier("bean")
    @PutMapping("/bean3") //Me devuelve el objeto que se llama bean3 realizando la petición PUT en formato JSON.
    public Persona persona3(@PathParam("bean3") Persona bean3) {
        bean3 = new Persona("bean3", 22, "Barcelona");
        return bean3;
    }

}
