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
public class Cliente extends Persona{
    
    Cuenta cuentaCliente;

    public Cliente(Cuenta cuentaCliente, String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
        this.cuentaCliente = cuentaCliente;
    }
    
    

    public Cuenta getCuentaCliente() {
        return cuentaCliente;
    }

    public void setCuentaCliente(Cuenta cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

    
    
    public void darPedido(){
    
    }
    
    public void pedirFactura(){
    
    }
    
    public void pagar (){
    
    }
    public Cliente(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
    }

    @Override
    public String toString() {
        return "Mi nombre es " + super.getNombre() + "\n Mi número de cédula es " + 
                super.getCedula() + "\n Mi número de teléfono es" + super.getTelefono();
    }
    
    
}
