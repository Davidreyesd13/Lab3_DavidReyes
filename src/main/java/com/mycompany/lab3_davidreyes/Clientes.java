package com.mycompany.lab3_davidreyes;

import java.util.ArrayList;

public class Clientes {

    int id;
    String nombre;
    ArrayList<Vehiculo> vehiculos;
    int saldo;

    public Clientes() {
    }

    public Clientes(int id, String nombre, ArrayList<Vehiculo> vehiculos, int saldo) {
        this.id = id;
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", saldo=" + saldo + '}';
    }

}
