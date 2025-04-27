/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34218
 */
public class Test {
    public static void main(String[] args) {


        // Ejercicio 01

        System.out.println("EJERCICIO 01:");

        ServicioHogar servicioHogar = new ServicioHogar(
                true, "Av. Proceres de la Independencia", 5.0, 30.0, true, "Fantino"
        );

        ServicioOficina servicioOficina = new ServicioOficina(
                20, "Av. Proceres de la Independencia", 4.0, 50.0, true, "Empresa IBM"
        );

        ServicioIndustrial servicioIndustrial = new ServicioIndustrial(
                1.5, "Av. Proceres de la Independencia", 6.0, 60.0, true, "Fábrica Wonka"
        );

        System.out.println("Servicio Hogar - Precio Final: " + servicioHogar.calcularPrecioFinal());
        System.out.println("Servicio Oficina - Precio Final: " + servicioOficina.calcularPrecioFinal());
        System.out.println("Servicio Industrial - Precio Final: " + servicioIndustrial.calcularPrecioFinal());



        // Ejercicio 02

        System.out.println("\nEJERCICIO 02:");

        Descuento descuentoFrecuente = new DescuentoClienteFrecuente();
        Descuento descuentoCompania = new DescuentoCompania();

        double precioOriginal = servicioHogar.calcularPrecioFinal();

        double precioConDescuentoFrecuente = descuentoFrecuente.aplicarDescuento(precioOriginal);
        double precioConDescuentoCompania = descuentoCompania.aplicarDescuento(precioOriginal);

        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio con descuento Cliente Frecuente: " + precioConDescuentoFrecuente);
        System.out.println("Precio con descuento Compania: " + precioConDescuentoCompania);


        // Ejercicio 03

        System.out.println("\nEJERCICIO 03:");


        ServicioLimpieza servicioBase = new ServicioHogar(
                false, "Jr. Atahualpa", 3.0, 40.0, true, "Fantino Camara"
        );


        servicioBase = new ConAromatizante(
                servicioBase.direccionCliente,
                servicioBase.duracionHoras,
                servicioBase.tarifaHora,
                servicioBase.incluyeMateriales,
                servicioBase.nombreCliente,
                servicioBase
        );


        servicioBase = new ConLimpiezaVidrios(
                servicioBase.direccionCliente,
                servicioBase.duracionHoras,
                servicioBase.tarifaHora,
                servicioBase.incluyeMateriales,
                servicioBase.nombreCliente,
                servicioBase
        );

        System.out.println("Precio final del servicio decorado: " + servicioBase.calcularPrecioFinal());



        // Ejercicio 04

        System.out.println("\nEJERCICIO 04:");

        ServicioLimpieza servicioFactory = ServicioFactory.crearServicio(
                "hogar",
                "Av. La Molina",
                2.0,
                35.0,
                true,
                "Fantino Camara",
                true
        );

        System.out.println("Servicio creado con Factory: " + servicioFactory.getClass().getSimpleName());
        System.out.println("Dirección: " + servicioFactory.direccionCliente);
        System.out.println("Duración: " + servicioFactory.duracionHoras + " horas");
        System.out.println("Precio final: " + servicioFactory.calcularPrecioFinal());
    }
}
