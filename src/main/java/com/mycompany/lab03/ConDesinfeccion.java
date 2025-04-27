package com.mycompany.lab03;

public class ConDesinfeccion extends ServicioAdicional {

    public ConDesinfeccion(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, ServicioLimpieza servicioBase) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente, servicioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicioBase.calcularPrecioFinal() + 15.0; // Suma 15 soles
    }

    @Override
    public String getDescripcion() {
        return "Con desinfeccion";
    }


}
