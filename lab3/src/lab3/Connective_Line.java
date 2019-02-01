package lab3;

import java.util.ArrayList;

public class Connective_Line {

    private ArrayList<Empresa> empresas;
    private ArrayList<Persona> personas;
    private ArrayList<Ingresos> ingreseos;

    public Connective_Line() {
    }

    public Connective_Line(ArrayList<Empresa> empresas, ArrayList<Persona> personas, ArrayList<Ingresos> ingreseos) {
        this.empresas = empresas;
        this.personas = personas;
        this.ingreseos = ingreseos;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Ingresos> getIngreseos() {
        return ingreseos;
    }

    public void setIngreseos(ArrayList<Ingresos> ingreseos) {
        this.ingreseos = ingreseos;
    }

    @Override
    public String toString() {
        return "Connective_Line{" + "empresas=" + empresas + ", personas=" + personas + ", ingreseos=" + ingreseos + '}';
    }

}
