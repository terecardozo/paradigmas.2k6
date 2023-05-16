/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comision2k6;

/**
 *
 * @author Teresa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Persona per1 = new Persona("apellido1", "nombre1", 100);
        Persona per2 = new Docente("apellido2", "nombre2", 500, "simple");
        Persona per3 = new NoDocente(7, "apellido3", "nombre3", 300);
        Persona per4 = new NoDocente(7, "apellido3", "nombre3", 300);
        Persona per5 = new NoDocente(3, "apellido0", "nombre3", 800);
        
        Facultad facultad = new Facultad("Regional Tucuman", "Rivadavia...");
        

//        facultad.agregarPersona(per1);
        if(!facultad.seEncuentra(per2))
        facultad.agregarPersona(per2);
        if(!facultad.seEncuentra(per3))
        facultad.agregarPersona(per3);
        if(!facultad.seEncuentra(per4))
        facultad.agregarPersona(per4);
        if(!facultad.seEncuentra(per4))
        facultad.agregarPersona(per4);
        if(!facultad.seEncuentra(per5))
        facultad.agregarPersona(per5);
        
        
        
        facultad.mostrar();
        
        
        System.out.println("Cantidad de Personas en Planta: " + facultad.cantidadPersonal());
        System.out.println("Cantidad de Docentes: " + facultad.cantidadDocentes());
        System.out.println("Cantidad de No Docentes: " + facultad.cantidadNoDocentes());
    }
    
}
