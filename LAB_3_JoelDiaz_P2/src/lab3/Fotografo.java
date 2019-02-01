/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author jason
 */
public class Fotografo extends Freelance{
    private ArrayList<String> proyectos = new ArrayList();
    private String nombreMarca;
    private String camara;

    public Fotografo() {
    }

    public Fotografo(String nombreMarca, String camara) {
        this.nombreMarca = nombreMarca;
        this.camara = camara;
    }

    public ArrayList<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<String> proyectos) {
        this.proyectos = proyectos;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "proyectos: " + proyectos + "\nNombre de la marca" + nombreMarca + "\nModelo de cámara: " + camara;
    }
    
    
}
