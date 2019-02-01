package lab3;

import java.util.ArrayList;

public class Administradores extends Persona {

    private String nombre_usuario;
    private String contaseña;
    private ArrayList<Ingresos> ingresos;

    public Administradores() {
        super();
    }

    public Administradores(String nombre_usuario, String contaseña) {
        this.nombre_usuario = nombre_usuario;
        this.contaseña = contaseña;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContaseña() {
        return contaseña;
    }

    public void setContaseña(String contaseña) {
        this.contaseña = contaseña;
    }

    public ArrayList<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return super.toString() + "nombre_usuario=" + nombre_usuario + ", contase\u00f1a=" + contaseña + ", ingresos=" + ingresos + '}';
    }

}
