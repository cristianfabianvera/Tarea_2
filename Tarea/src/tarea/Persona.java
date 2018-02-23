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
public class Persona {

    String Nombre;
    String Apellido;
    String Direccion;
    
    
    public String nombre_completo(){
    
        String nombre_completo;
        nombre_completo=Nombre+" "+Apellido;
    
        return nombre_completo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
