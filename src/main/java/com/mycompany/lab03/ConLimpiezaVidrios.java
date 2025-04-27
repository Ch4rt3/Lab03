package com.mycompany.lab03;

public class ConLimpiezaVidrios extends ServicioAdicional {

    public ConLimpiezaVidrios(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, ServicioLimpieza servicioBase) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente, servicioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicioBase.calcularPrecioFinal() + 10.0; // Suma 10 soles por limpieza de vidrios
    }

    @Override
    public String getDescripcion() {
        return "Con limpieza de vidrios";
    }
}
