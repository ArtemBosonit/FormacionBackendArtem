package block6simplecontrollers;

// Clase Persona. La usaré para devolver un objeto JSON
public class Persona {

    private String nombre;
    private int edad;
    private String ciudad;

    public String getNombre() {return nombre;}


    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad() {return edad;}


    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getCiudad() {return ciudad;}


    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }


}
