package lab3;

import java.util.ArrayList;

public class Freelance extends Persona{
    private String nombre;
    private String contraseña;
    private String genero;
    private int edad;
    private ArrayList<Empresa>empresa;
    private int dinero;
    private String ciudad;
    private int telefono;

    public Freelance() {
    }

    public Freelance(String nombre, String contraseña, String genero, int edad, ArrayList<Empresa> empresa, int dinero, String ciudad, int telefono) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.empresa = empresa;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresa> empresa) {
        this.empresa = empresa;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
}
