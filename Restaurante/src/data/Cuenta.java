/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author jjfb3
 */
public class Cuenta {
   private Date fecha;
   private double monto;
   private double impuesto;
   private double total;
   private String mesa;
   private String entrada;
   private String plato;
   private String bebida;
   

    public Cuenta(Date fecha, String mesa, String entrada, String plato, String bebida, double monto, double impuesto, double total) {
        this.fecha = fecha;
        this.mesa = mesa;
        this.entrada = entrada;
        this.plato = plato;
        this.bebida = bebida;
        this.monto  = monto;
        this.impuesto=impuesto;
        this.total=total;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
   
  

    

    @Override
    public String toString() {
        return " La fecha de hoy es" + this.getFecha() +"\n El monto sin impuesto a pagar es:"
                +this.getMonto()+ "\n El impuesto a pagar es " + this.getImpuesto() +
                "\n El monto total a pagar es "+ this.getTotal()+
                 this.mesa+ "\n La entrada es: " + this.entrada + "\n El plato "
                + "fuerte es : " + this.plato+ "\n La bebida es:"+ this.bebida;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
   
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }


   
}
