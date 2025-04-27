package com.mycompany.lab03;

public class ConAromatizante extends ServicioAdicional{

    public ConAromatizante(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, ServicioLimpieza servicioBase) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente, servicioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicioBase.calcularPrecioFinal() + 5.00; // Suma 5 soles por aromatizante
    }

    @Override
    public String getDescripcion() {
        return "Con aromatizante";
    }
}
