package block6pathvariableheaders;

public class Usuario {
    private long id;
    private String nombre;
    private String departamento;

    public Usuario() {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }
    public Usuario(long id, String nombre, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
