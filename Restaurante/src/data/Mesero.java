/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author jjfb3
 */
public class Mesero extends Persona {
   
    private String usuario;
    private String contrasena;
    private ArrayList<Cuenta> cuentas;

    public void ingresarPedido(){
    
    }
    public void generarFactura(){
    
    }
    
    public void confirmarPago (){
    
    }

    public Mesero(String usuario, String contrasena, String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
        this.usuario = usuario;
        this.contrasena = contrasena;

    }

    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    
    @Override
    public String toString() {
        return "Mi nombre es " + super.getNombre() + "\n Mi número de cédula es " + 
                super.getCedula() + "\n Mi número de teléfono es" + super.getTelefono();
                
    }
    
    

    
    
    
}
