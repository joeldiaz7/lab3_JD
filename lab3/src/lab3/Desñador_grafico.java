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
public class Desñador_grafico extends Freelance{
    private ArrayList<String> proyectos = new ArrayList();
    private String uni;
    private String hobbies;

    public Desñador_grafico() {
    }

    public Desñador_grafico(String uni, String hobbies) {
        this.uni = uni;
        this.hobbies = hobbies;
    }

    public ArrayList<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<String> proyectos) {
        this.proyectos = proyectos;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Proyectos: " + proyectos + "\nUniversidad: " + uni + "\nHobbies: " + hobbies;
    }
    
    
}
