import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Clase EjerciciosFiltros.
public class EjerciciosFiltros {
    // Constructor Main de la clase. Creo una lista para guardar línea por línea el contenido del archivo y establezco por defecto que la ruta del archivo, el lector del archivo y el lector de búfer sean nulos
    // para poder controlar la excepción en caso de que el fichero no exista.
    public static void main(String[] args) throws FileNotFoundException {
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
                String[] personaComoArreglo = linea.split(":", -1);

                if (personaComoArreglo[1] == "") {
                    personaComoArreglo[1] = "unknown";
                }
                if (personaComoArreglo.length == 2) {
                    Persona p = new Persona(personaComoArreglo[0],personaComoArreglo[1],0);
                }
                // Para controlar la posición de tal forma que no exista ningún elemento fuera del índice del arreglo.
                // Establezco las condiciones en función de la longitud del arreglo. Si no se cumplen, me saca un mensaje de excepción.
                if (personaComoArreglo.length < 2 || personaComoArreglo.length > 3) {
                    throw new InvalidLineFormatException("La línea no tiene el formato correcto.");
                }
                if (personaComoArreglo.length == 3) {
                    if (personaComoArreglo[2] == "") {
                        personaComoArreglo[2] = "0";
                    }
                    Persona p = new Persona(personaComoArreglo[0],personaComoArreglo[1],Integer.parseInt(personaComoArreglo[2]));
                    listapersonas.add(p);
                }
            }
            // Controlo la excepción
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Apartado a (Me filtra a las personas menores de 25 años)
        System.out.println("Ejercicio 1");
        List<Persona> listamenores25 = listapersonas.stream().filter(p -> p.getAge()< 25 && p.getAge() > 0).collect(Collectors.toList());
        listamenores25.forEach(System.out::println);


        // Apartado b (Me elimina a las personas cuyo nombre empieza con 'A')
        System.out.println("Ejercicio 2");
        List<Persona> eliminapersonasconA = listapersonas.stream().filter(p -> !p.getName().substring(0,1).equals("A")).collect(Collectors.toList());
        eliminapersonasconA.forEach(System.out::println);

        // Apartado c (Me saca al primer elemento cuya ciudad sea Madrid a las personas menores de 25 años)
        System.out.println("Ejercicio 3");

        Optional<Persona> primerElemMadrid = listamenores25.stream().filter(p -> p.getTown().equals("Madrid")).findFirst();
        if(primerElemMadrid.isPresent()) { //Compruebo si el optional contiene un valor
            System.out.println(primerElemMadrid.orElseThrow()); //Obtengo el valor
        } else {
            System.out.println("El optional esta vacio"); //Si el optional está vacio
        }

        // Apartado d (Me saca al primer elemento cuya ciudad sea Barcelona a las personas menores de 25 años)
        System.out.println("Ejercicio 4");

        Optional<Persona> primerElemBarcelona = listamenores25.stream().filter(p -> p.getTown().equals("Barcelona")).findFirst();
        if(primerElemBarcelona.isPresent()) { //Compruebo si el optional contiene un valor
            System.out.println(primerElemBarcelona.orElseThrow()); //Obtengo el valor
        } else {
            System.out.println("El optional esta vacio"); //Si el optional está vacio
        }
    }

}
