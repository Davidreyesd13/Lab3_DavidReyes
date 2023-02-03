package com.mycompany.lab3_davidreyes;

import java.util.ArrayList;

public class Concesionaria {

    String nombre;
    int id;
    String direccion;
    ArrayList<Vehiculo> vehiculo;
    ArrayList<Clientes> client;
    int saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombre, int id, String direccion, ArrayList<Vehiculo> vehiculo, ArrayList<Clientes> client, int saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.vehiculo = vehiculo;
        this.client = client;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Clientes> getClient() {
        return client;
    }

    public void setClient(ArrayList<Clientes> client) {
        this.client = client;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", vehiculo=" + vehiculo + ", client=" + client + ", saldo=" + saldo + '}';
    }

}
