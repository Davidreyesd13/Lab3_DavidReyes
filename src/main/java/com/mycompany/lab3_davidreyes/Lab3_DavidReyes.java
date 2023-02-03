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
                    System.out.println("1.Crear\n2.Eliminar\n3.Modificar");
                    int opc = l.nextInt();
                    switch (opc) {
                        case 1:
                            //crear concesionaria
                            System.out.println("Ingres el nombre de la empresa");
                            String name = l.next();
                            System.out.println("Ingrese el Id de la empresa");
                            int id = l.nextInt();
                            System.out.println("Ingrese la direccion de la empresa");
                            String dir = l.next();
                            System.out.println("Ingrese el saldo de la empresa");
                            int saldo = l.nextInt();
                            Concesionaria.add(new Concesionaria(name, id, dir, saldo));
                            break;
                        case 2:
                            //eliminar concecionaria
                            if(!Concesionaria.isEmpty()){
                            for (Object o : Concesionaria) {
                                System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                            }
                            System.out.println("Ingrese la opcion a eliminar");
                            int ec = l.nextInt();
                            Concesionaria.remove(ec);
                            System.out.println("Elimanda con exito");
                            }else{
                                System.out.println("Arreglo vacio");
                            }
                            break;
                        case 3:
                            //Modificar concesionaria
                            if(!Concesionaria.isEmpty()){
                            for (Object o : Concesionaria) {
                                System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                            }
                            System.out.println("Ingrese la opcion a modificar");
                           int  ec = l.nextInt();
                            System.out.println("Ingrese la nueva direccion de la empresa");
                            dir = l.next();
                            ((Concesionaria) Concesionaria.get(ec)).setDireccion(dir);
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }//CRUD Concesionaria

                    break;
                case 2:
                    //crear clientes
                    System.out.println("1.Crear cliente\n2.Eliminar cliente");
                    int opcl = l.nextInt();
                    switch (opcl) {
                        case 1:
                            System.out.println("Ingrese el id del cliente");
                            int id = l.nextInt();
                            System.out.println("Ingrese el nombre del cliente");
                            String nm = l.next();
                            System.out.println("Ingrese el saldo disponible");
                            int saldo = l.nextInt();
                            Cliente.add(new Clientes(id, nm, saldo));
                            break;
                        case 2:
                            if(!Cliente.isEmpty()){
                            
                            for (Object o : Cliente) {
                                System.out.println("" + Cliente.indexOf(o) + "- " + o);
                            }
                            System.out.println("Ingrese la opcion a eliminar");
                            int ec = l.nextInt();
                            Cliente.remove(ec);
                            }else{
                                System.out.println("Arreglo vacio");
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }

                    break;
                case 3:
                    //crear Vehiculos
                    System.out.println("1.Crear vehiculo\n2.Modificar\n3.Eliminar\n4.Listar");
                    int opv = l.nextInt();
                    switch (opv) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            if(!Vehiculo.isEmpty()){
                         for (Object o : Vehiculo) {
                                System.out.println("" + Vehiculo.indexOf(o) + "- " + o);
                            }
                            System.out.println("Ingrese la opcion a eliminar");
                            int ec = l.nextInt();
                            Vehiculo.remove(ec);
                            }
                            break;
                        case 4:
                            if(!Vehiculo.isEmpty()){
                            for (Object o : Vehiculo) {
                                System.out.println("" + Vehiculo.indexOf(o) + "- " + o);
                            }}else{
                                System.out.println("Arreglo vacio");
                            }
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
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
