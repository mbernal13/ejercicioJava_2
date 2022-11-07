package com.openbootcamp;

public class Precio {
    public static void main(String[] args) {
        double iva = 1.21;
        double precioSinIva = 50;

        double resultado = precioConIva(precioSinIva, iva);
        System.out.println("Precio sin IVA: " + precioSinIva);
        System.out.println("IVA: " + iva);
        System.out.println("Precio con IVA: " + resultado);
    }

    static double precioConIva(double precio, double iva) {
        double precioConIva = precio * iva;
        return precioConIva;
    }
}
