/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comision2k6;

/**
 *
 * @author Teresa
 */
public  class Persona implements Comparable<Persona>{
    private String apellido;
    private String nombre;
    private int legajo;

    public Persona(String apellido, String nombre, int legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.legajo == other.legajo;
    }

    @Override
    public int compareTo(Persona o) {
       // int resultado =0;
//        if(legajo> o.legajo)
//            resultado = 1;
//        if(legajo < o.legajo)
//            resultado= -1;
//        if(legajo == o.legajo)
//             resultado= 0; 
//return resultado;
           return apellido.compareToIgnoreCase(o.apellido);
        
    }

    @Override
    public String toString() {
        return  "apellido=" + apellido + ", nombre=" + nombre + ", legajo=" + legajo;
    }
    
    
}
