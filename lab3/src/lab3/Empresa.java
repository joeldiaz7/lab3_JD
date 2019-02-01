package lab3;

import java.util.*;

public class Empresa {

    private String nombre;
    private String telefono;
    private ArrayList<Proyecto> proyecto;
    private String Correo;
    private String contraseña;
    private String descripcion;

    public Empresa() {
    }

    public Empresa(String nombre, String telefono, ArrayList<Proyecto> proyecto, String Correo, String contraseña, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.proyecto = proyecto;
        this.Correo = Correo;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Proyecto> getProyecto() {
        return proyecto;
    }

    public void setProyecto(ArrayList<Proyecto> proyecto) {
        this.proyecto = proyecto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", telefono=" + telefono + ", proyecto=" + proyecto + ", Correo=" + Correo + ", contrase\u00f1a=" + contraseña + ", descripcion=" + descripcion + '}';
    }

}
