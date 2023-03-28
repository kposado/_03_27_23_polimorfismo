package com.adecco.modelo;

public class ProductoLujo extends Producto{

    //metodos
    @Override
    public double calcularIVA() {
        return precio*0.21;
    }

    @Override
    public String toString() {
        return "ProductoLujo{" +
                "idProducto=" + idProducto +
                ", tipoProducto='" + tipoProducto + '\'' +
                ", precio=" + precio +
                '}';
    }

    //constructores


    public ProductoLujo() {
    }

    public ProductoLujo(int idProducto, String tipoProducto, double precio) {
        super(idProducto, tipoProducto, precio);
    }

}
