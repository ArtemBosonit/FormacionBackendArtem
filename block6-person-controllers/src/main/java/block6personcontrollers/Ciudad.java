package block6personcontrollers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Ciudad {
    private String nombre;
    private int numerohabitantes;

    public String getNombre() {return nombre;}


    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getNumeroHabitantes() {return numerohabitantes;}


    public void setNumeroHabitantes(int numerohabitantes)
    {
        this.numerohabitantes = numerohabitantes;
    }

    @Override
    public String toString() {
        return "Ciudad [Nombre=" + nombre + ", Población=" + numerohabitantes + "]";
    }

}
