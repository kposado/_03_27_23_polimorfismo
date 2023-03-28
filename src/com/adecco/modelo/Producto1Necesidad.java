package com.adecco.modelo;

public class Producto1Necesidad extends Producto{

    public Producto1Necesidad() {

    }

    //metodo
    @Override
    public double calcularIVA() {
        return precio * 0.04;
    }

    @Override
    public String toString() {
        return "Producto1Necesidad{" +
                "idProducto=" + idProducto +
                ", tipoProducto='" + tipoProducto + '\'' +
                ", precio=" + precio +
                '}';
    }

    //constructores
    //no se heredan, pero se pueden generar y mandar llamar de otras clases


    public Producto1Necesidad(int idProducto, String tipoProducto, double precio) {
        super(idProducto, tipoProducto, precio);
    }
}
