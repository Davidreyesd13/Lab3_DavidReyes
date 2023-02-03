package com.mycompany.lab3_davidreyes;

public class Vehiculo {

    protected String Color;
    protected String marca;
    protected String Modelo;
    protected int fabricacion;
    protected int precio;
    protected int llantas;

    public Vehiculo(String Color, String marca, String Modelo, int fabricacion, int precio, int llantas) {
        this.Color = Color;
        this.marca = marca;
        this.Modelo = Modelo;
        this.fabricacion = fabricacion;
        this.precio = precio;
        this.llantas = llantas;
    }

    public Vehiculo() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Color=" + Color + ", marca=" + marca + ", Modelo=" + Modelo + ", fabricacion=" + fabricacion + ", precio=" + precio + ", llantas=" + llantas + '}';
    }

}
