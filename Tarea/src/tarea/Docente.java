/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author cfvera
 */
public class Docente extends Persona{
    
    String Cedula;
    String Profesion;
    String Direccion;

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    
    
    
}
