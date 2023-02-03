package com.mycompany.lab3_davidreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_DavidReyes {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int opcion = 0;
        ArrayList Cliente = new ArrayList(), Concesionaria = new ArrayList(), Vehiculo = new ArrayList();
        while (opcion != 0) {
            System.out.println("1.CRUD Concesionaria\n2.CRUD Clientes"
                    + "\n3.CRUD Vehiculos\n4.Compra/Venta de vehiculos por parte de un cliente");
            opcion = l.nextInt();
            switch (opcion) {
                case 1:
                    //crear empresas
                    System.out.println("1.Crear\n2.Eliminar\n3.Listar");

                    break;
                case 2:
                    //crear clientes
                    System.out.println("1.Crear cliente\n2.Eliminar cliente\n3.Listar clientes");

                    break;
                case 3:
                    //crear Vehiculos
                    System.out.println("1.Crear vehiculo\n2.Modificar vehiculo\n3.Eliminar cliente\n4.Listar");
                    break;
                case 4:
                    //compra y ventas
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }//Fin primer switch
        }

    }
}
