package com.mycompany.lab3_davidreyes;

public class Camion_de_Cargar extends Vehiculo {
int vol;
int altura;
boolean excavadora;

    public Camion_de_Cargar() {
    super();
    }

    public Camion_de_Cargar(int vol, int altura, boolean excavadora, String Color, String marca, String Modelo, int fabricacion, int precio, int llantas) {
        super(Color, marca, Modelo, fabricacion, precio, llantas);
        this.vol = vol;
        this.altura = altura;
        this.excavadora = excavadora;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isExcavadora() {
        return excavadora;
    }

    public void setExcavadora(boolean excavadora) {
        this.excavadora = excavadora;
    }

    @Override
    public String toString() {
        return "Camion_de_Cargar{" + "vol=" + vol + ", altura=" + altura + ", excavadora=" + excavadora + '}';
    }

    
}
