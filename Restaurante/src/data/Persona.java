/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author jjfb3
 */
public abstract class Persona {
    private String nombre;
    private String cedula;
    private double telefono;

    public Persona(String nombre, String cedula, double telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + this.getNombre() + "\n Mi número de cédula es " + this.getCedula() +
                "\n Mi número de teléfono es" + this.getTelefono();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    
    
}
