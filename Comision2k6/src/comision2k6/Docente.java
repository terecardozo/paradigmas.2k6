/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comision2k6;

/**
 *
 * @author Teresa
 */
public class Docente extends Persona{
    private String dedicacion;
    public Docente(String apellido, String nombre, int legajo, String dedicacion){
        super(apellido,nombre,legajo);
        this.dedicacion = dedicacion;
        
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }
    
}
