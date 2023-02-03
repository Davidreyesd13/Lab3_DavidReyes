package com.mycompany.lab3_davidreyes;

public class Carro extends Vehiculo{

    int puertas;
    String motor;
    int vel;

    public Carro() {
    super();
    }

    public Carro(int puertas, String motor, int vel, String Color, String marca, String Modelo, int fabricacion, int precio, int llantas) {
        super(Color, marca, Modelo, fabricacion, precio, llantas);
        this.puertas = puertas;
        this.motor = motor;
        this.vel = vel;
    }

    

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    @Override
    public String toString() {
        return "Carro{" + "puertas=" + puertas + ", motor=" + motor + ", vel=" + vel + '}';
    }

}
