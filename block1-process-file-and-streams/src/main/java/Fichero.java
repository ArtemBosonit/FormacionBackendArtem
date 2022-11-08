import java.io.*;
import java.util.*;
import java.util.stream.Stream;

// Clase Fichero.
public class Fichero {

    // Constructor Main de la clase. Creo una lista para guardar línea por línea el contenido del archivo y establezco por defecto que la ruta del archivo, el lector del archivo y el lector de búfer sean nulos
    // para poder controlar la excepción en caso de que el fichero no exista.
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Persona> listapersonas = new ArrayList();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        // Indico la ruta del archivo y establezco las condiciones para poder sacar los datos del fichero.
        try {
            archivo = new File("people.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea; // Declaro la variable de cadena para que me devuelva un elemento línea por línea
            while ((linea = br.readLine()) != null) {
                String[] personaComoArreglo = linea.split(":", -1); // Para controlar la posición de tal forma que no exista ningún elemento fuera del índice del arreglo.
                // Establezco las condiciones en función de la longitud del arreglo. Si no se cumplen, me saca un mensaje de excepción.
                if (personaComoArreglo.length != 3) {
                    throw new InvalidLineFormatException("La línea no tiene el formato correcto.");
                }
                if (personaComoArreglo[0].trim() == "") {
                    throw new InvalidLineFormatException("El nombre es obligatorio. Hay 3 espacios en el campo y esto se considera como blank.");
                }
                if (personaComoArreglo[2] == "") {
                    personaComoArreglo[2] = "0";
                }
                if (personaComoArreglo[1] == "") {
                    personaComoArreglo[1] = "unknown";
                }
                // Creo un nuevo objeto de persona y la añado a la lista de personas antes de sacar los datos por pantalla.
                Persona p = new Persona(personaComoArreglo[0],personaComoArreglo[1],Integer.parseInt(personaComoArreglo[2]));
                listapersonas.add(p);
                System.out.println(p.toString());
            }
            // Controlo la excepción
        } catch (InvalidLineFormatException e) {
            e.printStackTrace();
        }
        // (Me filtra a las personas al leer el fichero)
        System.out.println("Filtrado");
        Stream<Persona> listafiltro = listapersonas.stream();
        listafiltro.forEach(System.out::println);

    }

}
