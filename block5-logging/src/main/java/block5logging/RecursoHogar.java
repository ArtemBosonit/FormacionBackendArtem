package block5logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecursoHogar {

        Logger logger = LoggerFactory.getLogger(RecursoHogar.class);
        @RequestMapping("/")
        public String decirHola(){
            logger.error("Ocurrió un error");
            logger.warn("Advertencia");
            logger.info("Buenas desde Controlador");
            logger.debug("Depurando...");
            logger.trace("Aquí estoy...");
            return "Hola desde Controlador!";
        }
    }

