package Problem_2.dto;

import java.io.Serializable;

public class LocalDTO implements Serializable {
    private int id;
    private String nombre;
    private String horario;
    private String categoria;

    public LocalDTO(int id, String nombre, String horario, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "LocalDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", horario='" + horario + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
