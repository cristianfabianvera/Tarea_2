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
public class Estudiante extends Persona{
    
    String Codigo;
    String Universidad;
    String Carrera;

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    @Override
    
    public String nombre_completo(){
    
        String nombre_completo;
        nombre_completo=Nombre+" "+Apellido+" "+Codigo;
        
        return nombre_completo;
    }
}
