/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comision2k6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



/**
 *
 * @author Teresa
 */
public class Facultad {
    private String nombre;
    private String direccion;
    private ArrayList<Persona> listaPersonas = new ArrayList<>();

    public Facultad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    public void agregarPersona(Persona persona){
        listaPersonas.add(persona);
    }
    
    public int cantidadPersonal(){
        return listaPersonas.size();
    }
    
    public int cantidadDocentes(){
        int resultado =0;
        for(Persona per: listaPersonas){
            if(per instanceof Docente){
                resultado++;
            }
//          if(per.getClass().equals(Docente.class)) {
//            resultado++;  
//          } 
        }
        return resultado;
    }
    
        public int cantidadNoDocentes(){
        int resultado =0;
        for(Persona per: listaPersonas){
            if(per instanceof NoDocente){
                resultado++;
            }
//          if(per.getClass().equals(NoDocente.class)) {
//            resultado++;  
//          } 
        }
        return resultado;
    }
        public boolean seEncuentra(Persona per){
            boolean retorno= true;
            if (!listaPersonas.contains(per))
               retorno = false;
            return retorno;
        }
        
        public void mostrar(){
            Collections.sort(listaPersonas);
            for(Persona per: listaPersonas){
                System.out.println(per);
            }
        }
}
