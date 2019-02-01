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
public class Medios_Audiovisuales extends Freelance{
    private ArrayList<String> proyectos = new ArrayList();
    private String marca;
    private String camara;

    public Medios_Audiovisuales() {
    }

    public Medios_Audiovisuales(String marca, String camara) {
        this.marca = marca;
        this.camara = camara;
    }

    public ArrayList<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<String> proyectos) {
        this.proyectos = proyectos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "Proyectos: " + proyectos + "\nNombre de marca: " + marca + "\nModelo de cámara: " + camara;
    }
    
    
}
