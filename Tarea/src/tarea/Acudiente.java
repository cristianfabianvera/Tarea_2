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
public class Acudiente extends Persona{
   
  String Parentesco;
  String Celular;
  String Fijo;

    public String getParentesco() {
        return Parentesco;
    }

    public void setParentesco(String Parentesco) {
        this.Parentesco = Parentesco;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getFijo() {
        return Fijo;
    }

    public void setFijo(String Fijo) {
        this.Fijo = Fijo;
    }
    
  @Override
  
  public String nombre_completo(){
  
  String nombre_completo;
  
  nombre_completo=Nombre+" "+Apellido;
  
  return nombre_completo;
  
  }
}
