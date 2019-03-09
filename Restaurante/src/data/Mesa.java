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
public class Mesa {
    ArrayList <Cliente> clientesMesa = new ArrayList <>();
    Cuenta cuenta;

    
    
    public Mesa(Cuenta cuenta, ArrayList<Cliente> clientesMesa) {
        this.cuenta = cuenta;
        this.clientesMesa = clientesMesa;
    }

    @Override
    public String toString() {
        return "Los clientes de la mesa son " + clientesMesa +
                "La cuenta es: " + this.cuenta ;
    }
    
    
}
