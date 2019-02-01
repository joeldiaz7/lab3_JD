package lab3;

import java.util.ArrayList;

public class Freelance extends Persona{
    private String nombre;
    private String contraseña;
    private String genero;
    private String edad;
    private ArrayList<Empresa>empresa;
    private String dinero;
    private String ciudad;
    private String telefono;

    public Freelance() {
    }

    public Freelance(String nombre, String contraseña, String genero, String edad, ArrayList<Empresa> empresa, String dinero, String ciudad, String telefono) {
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public ArrayList<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresa> empresa) {
        this.empresa = empresa;
    }

    public String getDinero() {
        return dinero;
    }

    public void setDinero(String dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
