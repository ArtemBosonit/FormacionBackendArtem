// Clase InvalidLineFormatException. Esta clase es una excepción personalizada y me permite sacar un mensaje de excepción
// si la línea no tiene el formato correcto.
public class InvalidLineFormatException extends Exception {
    public InvalidLineFormatException (String errorMessage) {
        super(errorMessage);
    }
}