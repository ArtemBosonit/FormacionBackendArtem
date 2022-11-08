// Clase Persona.
public class Persona {
    // Campos de la clase Persona.
    private String name;
    private String town;
    private int age;

    // Constructor sin parámetros de entrada. Si el parámetro no existe me devuelve estos valores por defecto.
    public Persona() {
        this.name = "unknown";
        this.town = "unknown";
        this.age = 0;
    }

    // Constructor con parámetros de entrada de la clase Persona.
    public Persona(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    // Método para obtener la edad.
    public int getAge() {return age;}

    // Método para modificar la edad.
    public void setAge(int age)
    {
        this.age = age;
    }

    // Método para obtener la localidad.
    public String getTown() {return town;}

    // Método para modificar la localidad.
    public void setTown(String town)
    {
        if (town.isBlank()){
            town = "unknown";
        } else
            this.town = town;
    }

    // Método para obtener el nombre.
    public String getName() {return name;}

    // Método para modificar el nombre.
    public void setName(String name) {
        if (name.isBlank()){
            name = "unknown";
        } else
            this.name = name;
    }

    // Método para sobrescribir la clase Persona. Devuelve la concatenación de los tres campos separados por puntos:
    @Override
    public String toString() {
        return this.name + ":" + this.town + ":" + this.age;
    }

}
