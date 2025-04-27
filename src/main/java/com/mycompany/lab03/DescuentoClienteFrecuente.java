/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author L34218
 */
public class DescuentoClienteFrecuente implements Descuento {

    private final double PORCENTAJE_DESCUENTO = 0.15;
    
    @Override
    public double aplicarDescuento(double monto) {
        
        return monto * (1-PORCENTAJE_DESCUENTO);
        
    }
    
    
    
}
