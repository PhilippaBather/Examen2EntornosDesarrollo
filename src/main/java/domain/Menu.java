package domain;

import java.util.ArrayList;

/**
 * Menu contiene las propiedades de comida en el restaurante
 */
public class Menu {

    //declarar las propiedades de la instancia
    private String restauranteID;
    private String nombre;
    private String descripcion;
    private double precio;
    private String fotoURL;
    private boolean esCeliaco;
    private boolean esDisponible;
    private ArrayList<String> ingredientes;


    //constructor
    public Menu(String restauranteID, String nombre, String descripcion, double precio, String fotoURL,
                boolean esCeliaco, boolean esDisponible, ArrayList<String> ingredientes) {
        this.restauranteID = restauranteID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotoURL = fotoURL;
        this.esCeliaco = esCeliaco;
        this.esDisponible = esDisponible;
        this.ingredientes = ingredientes;
    }

    //getters and setters

    public String getRestauranteID() {
        return restauranteID;
    }

    public void setRestauranteID(String restauranteID) {
        this.restauranteID = restauranteID;
    }

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFotoURL() {
        return fotoURL;
    }

    public void setFotoURL(String fotoURL) {
        this.fotoURL = fotoURL;
    }

    public boolean isEsCeliaco() {
        return esCeliaco;
    }

    public void setEsCeliaco(boolean esCeliaco) {
        this.esCeliaco = esCeliaco;
    }

    public boolean isEsDisponible() {
        return esDisponible;
    }

    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}


