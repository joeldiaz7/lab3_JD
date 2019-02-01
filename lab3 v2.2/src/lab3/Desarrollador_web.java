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
public class Desarrollador_web extends Freelance{
    private String lenguaje;
    private String uni;
    private String idioma;
    private ArrayList<String> proyectos = new ArrayList();

    public Desarrollador_web() {
    }

    public Desarrollador_web(String lenguaje, String uni, String idioma) {
        this.lenguaje = lenguaje;
        this.uni = uni;
        this.idioma = idioma;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<String> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "\nLenguaje: " + lenguaje + "\nUniversidad: " + uni + "\nIdioma: " + idioma + "\nProyectos: " + proyectos;
    }
    
    
}
