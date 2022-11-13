import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EvaluadorExpresiones {

    // Constructor Main de la clase. Creo un evaluador que me reconoce los tres tipos de datos diferentes: números enteros, cadenas de texto y fechas
    public static void main(String[] args) throws FileNotFoundException {
        File archivoex = null;
        FileReader fr = null;
        BufferedReader br = null;
        int numero1 = 2, numero2 = 4;
        DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        Date fecha1 = new Date(122, 11, 31);
        // El año empieza en 1900, así que le sumo 122 para que me devuelva 2022. El mes de diciembre es 11 porque
        //el programa entiende que el primer mes es 0.
        Date fecha2 = new Date(122, 0, 01);
        String fechaencadena1 = formatoFecha.format(fecha1);
        String fechaencadena2 = formatoFecha.format(fecha2);

        // Indico la ruta del archivo y establezco las condiciones para poder sacar los datos del fichero.
        try {

            archivoex = new File("src/evaluadorexpresiones.txt");
            fr = new FileReader(archivoex);
            br = new BufferedReader(fr);

            String linea; // Declaro la variable de cadena para que me devuelva un elemento línea por línea

            while ((linea = br.readLine()) != null) {
                // Si la línea contiene el valor de los números, convertidos a cadenas de texto para que el programa pueda leer, evaluo las expresiones según el signo
                // que contengan los operandos que realizan las operaciones con enteros, para cada operación me imprime un resultado distinto.
                if (linea.contains(String.valueOf(numero1)) && linea.contains(String.valueOf(numero2))) {
                    if (linea.contains("+")) {
                        int resultado = Integer.parseInt(String.valueOf(numero1)) + Integer.parseInt(String.valueOf(numero2));
                        System.out.println(resultado);
                    } else if (linea.contains("-")) {
                        int resultado = Integer.parseInt(String.valueOf(numero1)) - Integer.parseInt(String.valueOf(numero2));
                        System.out.println(resultado);
                    } else if (linea.contains("*")) {
                        int resultado = Integer.parseInt(String.valueOf(numero1)) * Integer.parseInt(String.valueOf(numero2));
                        System.out.println(resultado);
                    } else if (linea.contains("/")) {
                        try {
                            int resultado = numero1 / numero2;
                            System.out.println(resultado);
                        } catch (ArithmeticException ae) {
                            ae.printStackTrace();
                        }
                    } else {
                        System.out.println("No existe ninguno de los enteros en el fichero");
                    }
                    // Si la línea contiene las cadenas de texto, me imprime la frase.
                }
                if (linea.contains("Hello") && linea.contains("World") && linea.contains("!")) {
                    // Me concatena esas cadenas con el signo de exclamación.
                    if (linea.contains("+")) {
                        String frase = "Hello" + " " + "World" + "!";
                        System.out.println(frase);
                        // Me repite esas cadenas con el signo de exclamación.
                    } else if (linea.contains("*")) {
                        for (int i = 0; i < 2; i++) {
                            String frase = "Hello" + " " + "World" + "!";
                            System.out.println(frase);
                        }
                    } else {
                        System.out.println("No existe ninguna de las cadenas de texto en el fichero");
                    }
                    // Si la línea contiene la fecha la convierto en String antes de imprimir la frase.
                }
                if (linea.contains(fechaencadena1) && linea.contains(fechaencadena2)) {
                    if (linea.contains("<")) {
                        String contenidofecha = fechaencadena1 + " < " + fechaencadena2;
                        System.out.println(contenidofecha);
                    } else if (linea.contains(">")) {
                        String contenidofecha2 = fechaencadena1 + " > " + fechaencadena2;
                        System.out.println(contenidofecha2);
                    } else {
                        System.out.println("No existe ninguna de las fechas en el fichero");
                    }
                }
            }
            // Controlo la excepción
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
