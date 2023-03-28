package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.Producto1Necesidad;
import com.adecco.modelo.ProductoLujo;

public class Main {
    public static void main(String[] args) {

        Producto p1= new ProductoLujo();
        p1.setIdProducto(1);
        p1.setPrecio(10);
        System.out.println("Id del producto ->" +p1.getIdProducto());
        System.out.println("Tipo del producto ->" +p1.getTipoProducto());
        System.out.println("Precio del producto ->" +p1.getPrecio());
        System.out.println(p1.toString());
        System.out.println(p1);
        System.out.println("Calculo del IVA" + p1.calcularIVA());

        Producto p2 = new ProductoLujo(2, "Ratón", 20);
        System.out.println(p2.toString());
        System.out.println("Cálculo del iva ->" +p2.calcularIVA());

        Producto1Necesidad p1n1 = new Producto1Necesidad();
        p1n1.setPrecio(2);
        System.out.println("Calculo del IVA"+p1n1.calcularIVA());

        Producto p3 =new Producto1Necesidad(2, "platano", 1);

        System.out.println("Cálculo del IVA"+ p3.calcularIVA());
        System.out.println(p3);

        ProductoLujo pl1 = new ProductoLujo(4, "bicicleta", 500);
        System.out.println("Cálculo del iva" + pl1.calcularIVA());
        System.out.println(pl1);


    }
}