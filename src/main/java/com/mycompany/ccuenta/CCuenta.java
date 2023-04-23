/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import java.util.List;

/**
 *
 * @author ED05
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
     private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private String[] factura = {"seguro", "luz", "agua", "alquiler"};


    /* Constructor sin argumentos */
    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta

    public void setNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular
    public String getNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double getEstado() {
        return getSaldo();
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }


    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    // Método que me devuelve el número de cuenta
    public String getCuenta() {
        return cuenta;
    }

    public void cobroFactura(String tipo,double cantidad){
        switch(tipo){
        
            case "alquiler":
                if (cantidad >0 && cantidad<=400)
                    this.setSaldo(this.getSaldo() - cantidad); //this.saldo = this.saldo-cantidad;
                break;
            case "luz":
                if (cantidad<=200)
                    this.setSaldo(this.getSaldo() - cantidad);
            case "agua":
                
                if (cantidad >0 && cantidad<=200)
                    this.setSaldo(this.getSaldo() - cantidad);
                break;
            case "seguro":
                if (cantidad >0 && cantidad<=125)
                    this.setSaldo(this.getSaldo() - cantidad);
                    
                
        }
    
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the factura
     */
    public String[] getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(String[] factura) {
        this.factura = factura;
    }
    
}
    
 