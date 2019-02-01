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
public class Contador extends Freelance{
    private ArrayList<String> proyectos = new ArrayList();
    private String uni;
    private boolean inscripcion;
    private String hobbies;

    public Contador() {
    }

    public Contador(String uni, boolean inscripcion, String hobbies) {
        this.uni = uni;
        this.inscripcion = inscripcion;
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

    public boolean isInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(boolean inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        String ins;
        if (inscripcion){
            ins = "Inscrito";
        } else {
            ins = "No está inscrito";
        }
        return "Proyectos: " + proyectos + "\nUniversidad: " + uni + "\nInscripcion del colegio de peritos mercantiles: " + ins + "\nHobbies: " + hobbies;
    }
    
    
}
