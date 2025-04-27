/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34218
 */
public class ServicioOficina extends ServicioLimpieza {
    
    private int cantEmpleados;

    public ServicioOficina(int cantEmpleados, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantEmpleados = cantEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        
        double precioSinIGV = precioBase + (this.cantEmpleados*0.1*this.tarifaHora);
        
        double precioConIGV = precioSinIGV * 1.18;
        
        
        return precioConIGV;
    }
    
}
