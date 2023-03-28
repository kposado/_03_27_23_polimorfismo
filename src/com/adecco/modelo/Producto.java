package com.adecco.modelo;

public abstract class Producto {
    //1. Atributos
    protected int idProducto;
    protected String tipoProducto;
    protected double precio;

    //2. Métodos
    public abstract double calcularIVA();

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", tipoProducto='" + tipoProducto + '\'' +
                ", precio=" + precio +
                '}';
    }

    //3. Constructores

    public Producto() {
    }

    public Producto(int idProducto, String tipoProducto, double precio) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
    }

//4. Setters y getters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
