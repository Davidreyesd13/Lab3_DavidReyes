package com.mycompany.lab3_davidreyes;

public class Bus extends Vehiculo {

    int cantidad;
    String tipo;

    public Bus() {
        super();
    }

    public Bus(int cantidad, String Color, String marca, String Modelo, int fabricacion, int precio, int llantas) {
        super(Color, marca, Modelo, fabricacion, precio, llantas);
        this.cantidad = cantidad;
        if(cantidad > 50){
        this.tipo = "Rapidito";
        }else{
            this.tipo="De ruta";
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int cant) {
        if(cant>50){
        this.tipo = "Rapidito";
        }else{
            this.tipo = "De ruta";
        }
    }

    @Override
    public String toString() {
        return "Bus{" + "cantidad=" + cantidad + ", tipo=" + tipo + '}';
    }

}
