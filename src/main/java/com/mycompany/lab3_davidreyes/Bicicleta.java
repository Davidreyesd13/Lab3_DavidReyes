package com.mycompany.lab3_davidreyes;

public class Bicicleta extends Vehiculo{
String descrip;
int radior;
String tipo;

    public Bicicleta(String descrip, int radior, String tipo, String Color, String marca, String Modelo, int fabricacion, int precio, int llantas) {
        super(Color, marca, Modelo, fabricacion, precio, llantas);
        this.descrip = descrip;
        this.radior = radior;
        this.tipo = tipo;
    }

    public Bicicleta() {
    super();
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getRadior() {
        return radior;
    }

    public void setRadior(int radior) {
        this.radior = radior;
    }

    public String isTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "descrip=" + descrip + ", radior=" + radior + ", tipo=" + tipo + '}';
    }
    
}
