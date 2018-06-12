/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gloria PC
 */
public class Cta_Lista extends Cliente {
    
    private double saldo;
    private String EstadodeApertura;

    public Cta_Lista() {
    }

    public Cta_Lista(int id) {
        super(id);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEstadodeApertura() {
        return EstadodeApertura;
    }

    public void setEstadodeApertura(String EstadodeApertura) {
        this.EstadodeApertura = EstadodeApertura;
    }
              
    @Override
     public void Mostrar(){
        super.Mostrar();          
       System.out.println(" -------------> Soy Cuenta Lista");
        System.out.println(" El estado de la Cta. Lista se encuentra: Activo");
       System.out.println(" Mi numero de cuentas es: 0929853299");
       System.out.println(" Mi saldo es $800");
    }
}   
