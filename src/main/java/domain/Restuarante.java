package domain;

import java.time.LocalDateTime;

/**
 * Restaurante proviene una pantilla para los restaurantes registrados en la aplicación
 */
public class Restuarante {

    //declaramos las propiedades de la instancia
    private String nombre;
    private String descripcion;
    private String tipo;
    private String direccion;
    private LocalDateTime horarioOpening;
    private LocalDateTime horarioClosing;

    //contructor

    public Restuarante(String nombre, String descripcion, String tipo, String direccion, LocalDateTime horarioOpening, LocalDateTime horarioClosing) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.horarioOpening = horarioOpening;
        this.horarioClosing = horarioClosing;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getHorarioOpening() {
        return horarioOpening;
    }

    public void setHorarioOpening(LocalDateTime horarioOpening) {
        this.horarioOpening = horarioOpening;
    }

    public LocalDateTime getHorarioClosing() {
        return horarioClosing;
    }

    public void setHorarioClosing(LocalDateTime horarioClosing) {
        this.horarioClosing = horarioClosing;
    }
}
