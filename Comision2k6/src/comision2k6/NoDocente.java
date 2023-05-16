/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comision2k6;

/**
 *
 * @author Teresa
 */
public class NoDocente extends Persona{
    private int categoria;

    public NoDocente(int categoria, String apellido, String nombre, int legajo) {
        super(apellido, nombre, legajo);
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
}
