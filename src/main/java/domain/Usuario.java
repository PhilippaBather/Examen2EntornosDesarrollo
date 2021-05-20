package domain;

/**
 * Usuario crea un objeto contiendo información del usuario registrado en la aplicación
 */
public class Usuario {

    //declaramos las propiedades de la instancia
    private String userID;
    private String nombre;
    private String apellidos;
    private String email;
    private String contrasena;

    //constructor

    public Usuario(String userID, String nombre, String apellidos, String email, String contrasena) {
        this.userID = userID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.contrasena = contrasena;
    }

    //getters and setters

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
