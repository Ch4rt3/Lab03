/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34218
 */
public abstract class ServicioAdicional extends ServicioLimpieza{

    protected ServicioLimpieza servicioBase;

    public ServicioAdicional(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, ServicioLimpieza servicioBase) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.servicioBase = servicioBase;
    }

    @Override
    public abstract double calcularPrecioFinal();
    
    public abstract String getDescripcion();
    
}
