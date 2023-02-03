package com.mycompany.lab3_davidreyes;

public class Motocicleta extends Vehiculo {
    String desplazamiento;
    boolean electricidad;

    public Motocicleta(String desplazamiento, boolean electricidad, String Color, String marca, String Modelo, int fabricacion, int precio, int llantas) {
        super(Color, marca, Modelo, fabricacion, precio, llantas);
        this.desplazamiento = desplazamiento;
        this.electricidad = electricidad;
    }

    public Motocicleta() {
    super();
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectricidad() {
        return electricidad;
    }

    public void setElectricidad(boolean electricidad) {
        this.electricidad = electricidad;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "desplazamiento=" + desplazamiento + ", electricidad=" + electricidad + '}';
    }
    

}
