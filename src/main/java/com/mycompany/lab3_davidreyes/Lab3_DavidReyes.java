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
                            String name=l.next();
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
                            for (Object o : Concesionaria) {
                                System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                            }
                            System.out.println("Ingrese la opcion a eliminar");
                            int ec = l.nextInt();
                            Concesionaria.remove(ec);
                            System.out.println("Elimanda con exito");
                            break;
                        case 3:
                            //Modificar concesionaria
                            for (Object o : Concesionaria) {
                                System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                            }
                            System.out.println("Ingrese la opcion a modificar");
                             ec = l.nextInt();
                             System.out.println("Ingrese la nueva direccion de la empresa");
                            dir = l.next();
                             ((Concesionaria)Concesionaria.get(ec)).setDireccion(dir);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }//CRUD Concesionaria

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
