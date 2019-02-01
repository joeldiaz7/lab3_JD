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
public class Marketing extends Freelance{
    private ArrayList<String> proyectos = new ArrayList();
    private String redSocial;

    public Marketing() {
    }

    public Marketing(String redSocial) {
        this.redSocial = redSocial;
    }

    public ArrayList<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<String> proyectos) {
        this.proyectos = proyectos;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    @Override
    public String toString() {
        return "Proyectos: " + proyectos + "\nRed social más usada: " + redSocial;
    }
    
    
}
