/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34218
 */
public abstract class ServicioLimpieza {
    protected String direccionCliente;
    protected double duracionHoras;
    protected double tarifaHora;
    protected boolean incluyeMateriales;
    protected String nombreCliente;

    public ServicioLimpieza(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        this.direccionCliente = direccionCliente;
        this.duracionHoras = duracionHoras;
        this.tarifaHora = tarifaHora;
        this.incluyeMateriales = incluyeMateriales;
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public boolean isIncluyeMateriales() {
        return incluyeMateriales;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }



    public double calcularPrecioBase(){
           return this.duracionHoras * this.tarifaHora;
    }
    public abstract double calcularPrecioFinal();
}
