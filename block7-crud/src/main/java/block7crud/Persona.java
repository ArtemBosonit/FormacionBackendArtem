package block7crud;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data // Creo la
@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Persona() {
    }

    public Persona(String nombre, int edad, String población) {
        this.nombre = nombre;
        this.edad = edad;
        this.población = población;
    }

    @NotNull
    @Column
    private String nombre;

    @NotNull
    @Column
    private int edad;

    @NotNull
    @Column
    private String población;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPoblación() {
        return población;
    }

    public void setPoblación(String población) {
        this.población = población;
    }

}
