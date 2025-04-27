package com.mycompany.lab03;

public class ServicioFactory {

    public static ServicioLimpieza crearServicio(
            String tipo,
            String direccionCliente,
            double duracionHoras,
            double tarifaHora,
            boolean incluyeMateriales,
            String nombreCliente,
            Object parametroExtra
    ) {
        switch (tipo.toLowerCase()) {
            case "hogar":
                if (!(parametroExtra instanceof Boolean)) {
                    throw new IllegalArgumentException("Se esperaba un booleano para esApartamento en servicio hogar");
                }
                return new ServicioHogar(
                        (Boolean) parametroExtra,
                        direccionCliente,
                        duracionHoras,
                        tarifaHora,
                        incluyeMateriales,
                        nombreCliente
                );

            case "oficina":
                if (!(parametroExtra instanceof Integer)) {
                    throw new IllegalArgumentException("Se esperaba un entero para cantEmpleados en servicio oficina");
                }
                return new ServicioOficina(
                        (Integer) parametroExtra,
                        direccionCliente,
                        duracionHoras,
                        tarifaHora,
                        incluyeMateriales,
                        nombreCliente
                );

            case "industrial":
                if (!(parametroExtra instanceof Double)) {
                    throw new IllegalArgumentException("Se esperaba un double para multiplicadorRiesgo en servicio industrial");
                }
                return new ServicioIndustrial(
                        (Double) parametroExtra,
                        direccionCliente,
                        duracionHoras,
                        tarifaHora,
                        true,
                        nombreCliente
                );

            default:
                throw new IllegalArgumentException("Tipo de servicio no reconocido: " + tipo);
        }
    }
}
