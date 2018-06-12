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
public class Cta_Corriente extends Cliente {
    
    private String EstadodeApertura;
    private String NumerodeCuenta;
    private double Interes;
    private double Saldo;

    public Cta_Corriente() {
    }

    public Cta_Corriente(int id) {
        super(id);
    }

    public String getEstadodeApertura() {
        return EstadodeApertura;
    }

    public void setEstadodeApertura(String EstadodeApertura) {
        this.EstadodeApertura = EstadodeApertura;
    }

    public String getNumerodeCuenta() {
        return NumerodeCuenta;
    }

    public void setNumerodeCuenta(String NumerodeCuenta) {
        this.NumerodeCuenta = NumerodeCuenta;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }


    
    @Override
    public void Mostrar(){
     super.Mostrar();
     System.out.println(" ------------> Soy Cta. Corriente");
     System.out.println(" El estado de la Cta. Corriente se encuentra: Activo");
     System.out.println(" Mi numero de cuenta es: 0929853769");
     System.out.println(" Interes $20");
     System.out.println(" Mi saldo es $500");
    }
}
