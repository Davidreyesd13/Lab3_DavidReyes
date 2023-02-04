package com.mycompany.lab3_davidreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_DavidReyes {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Clientes> Cliente = new ArrayList();
        ArrayList<Concesionaria> Concesionaria = new ArrayList();
        ArrayList<Vehiculo> Vehiculo = new ArrayList();

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
                            System.out.println("Ingrese la direccion de la empresa");
                            String dir = l.next();
                            System.out.println("Ingrese el saldo de la empresa");
                            int saldo = l.nextInt();
                            Concesionaria.add(new Concesionaria(name, Concesionaria.size() + 1, dir, saldo));
                            break;
                        case 2:
                            //eliminar concecionaria
                            if (!Concesionaria.isEmpty()) {
                                for (Object o : Concesionaria) {
                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                }
                                System.out.println("Ingrese la opcion a eliminar");
                                int ec = l.nextInt();
                                Concesionaria.remove(ec);
                                System.out.println("Elimanda con exito");
                            } else {
                                System.out.println("Arreglo vacio");
                            }
                            break;
                        case 3:
                            //Modificar concesionaria
                            if (!Concesionaria.isEmpty()) {
                                for (Object o : Concesionaria) {
                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                }
                                System.out.println("Ingrese la opcion a modificar");
                                int ec = l.nextInt();
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
                            System.out.println("Ingrese el nombre del cliente");
                            String nm = l.next();
                            System.out.println("Ingrese el saldo disponible");
                            int saldo = l.nextInt();
                            Cliente.add(new Clientes(Cliente.size() + 1, nm, saldo));
                            break;
                        case 2:
                            if (!Cliente.isEmpty()) {

                                for (Object o : Cliente) {
                                    System.out.println("" + Cliente.indexOf(o) + "- " + o);
                                }
                                System.out.println("Ingrese la opcion a eliminar");
                                int ec = l.nextInt();
                                Cliente.remove(ec);
                            } else {
                                System.out.println("Arreglo vacio");
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }

                    break;
                case 3:
                    if (!Concesionaria.isEmpty()) {
                        //crear Vehiculos
                        System.out.println("1.Crear vehiculo\n2.Modificar\n3.Eliminar\n4.Listar");
                        int opv = l.nextInt();
                        switch (opv) {
                            case 1:

                                System.out.println("Ingrese el color del carro");
                                String cc = l.next();
                                System.out.println("Ingrese la marca");
                                String marc = l.next();
                                System.out.println("Ingrese el modelo");
                                String model = l.next();
                                System.out.println("Ingrese el año del vehiculo");
                                int year = l.nextInt();
                                System.out.println("Ingrese el precio del vehiculo");
                                int precio = l.nextInt();
                                precio += (precio * 0.075);
                                int llant = 0;
                                while (llant != 2 || llant != 4) {
                                    System.out.println("Ingrese la cantidad de llantas solo 2 o 4");
                                    llant = l.nextInt();

                                }
                                switch (llant) {
                                    case 2:
                                        //crear moto
                                        System.out.println("1.Motocicleta\n2.Bicicleta");
                                        int llant2 = l.nextInt();
                                        switch (llant2) {
                                            case 1:
                                                System.out.println("Ingrese el desplazamiento del motor");
                                                l.next();
                                                String despla = l.nextLine();
                                                System.out.println("Es electrica S/N");
                                                char elec = l.next().charAt(0);
                                                boolean ele;
                                                if (elec == 's' || elec == 'S') {
                                                    ele = true;
                                                } else {
                                                    ele = false;
                                                }
                                                Vehiculo.add(new Motocicleta(despla, ele, cc, marc, model, year, precio, llant));
                                                break;
                                            case 2:
                                                System.out.println("Ingrese una descripcion");
                                                l.next();
                                                String descrip = l.nextLine();
                                                System.out.println("Ingrese el radio de la rueda");
                                                int rr = l.nextInt();
                                                System.out.println("1.BMX\n2. Calle");
                                                int tb = l.nextInt();
                                                String tipob = "";
                                                switch (tb) {
                                                    case 1:
                                                        tipob = "BMX";
                                                        break;
                                                    case 2:
                                                        tipob = "Calle";
                                                        break;
                                                    default:
                                                        System.out.println("OPcion no valida");
                                                }
                                                Vehiculo.add(new Bicicleta(descrip, rr, tipob, cc, marc, model, year, precio, llant2));
                                                for (Concesionaria o : Concesionaria) {
                                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                                }
                                                System.out.println("Elija una concesionaria");
                                                int co = l.nextInt();
                                                Concesionaria.get(co).getVehiculo().add(new Bicicleta(descrip, rr, tipob, cc, marc, model, year, precio, llant2));
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                        }
                                        break;
                                    case 4:
                                        //crear con 4 llantas
                                        System.out.println("1.Carro\n2.Camion de carga\n3.Bus");
                                        int op4 = l.nextInt();
                                        switch (op4) {
                                            case 1:
                                                //crear carro
                                                System.out.println("Ingrese la cantidad de puertas");
                                                int puer = l.nextInt();
                                                System.out.println("Descripcion de motor");
                                                String mootr = l.next();
                                                System.out.println("Ingrese la velocidad maxima");
                                                int vel = l.nextInt();
                                                for (Concesionaria o : Concesionaria) {
                                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                                }
                                                System.out.println("Elija una concesionaria");
                                                int co = l.nextInt();
                                                Vehiculo.add(new Carro(puer, mootr, vel, cc, marc, model, year, precio, llant));
                                                Concesionaria.get(co).getVehiculo().add(new Carro(puer, mootr, vel, cc, marc, model, year, precio, llant));
                                                break;
                                            case 2:
                                                //crear camiones
                                                System.out.println("Ingrese la cantidad de volumen maximo de carga");
                                                int vol = l.nextInt();
                                                System.out.println("Ingrese la altura");
                                                int altu = l.nextInt();
                                                System.out.println("Tiene retroexcavadora");
                                                char r = l.next().charAt(0);

                                                boolean retro;
                                                if (r == 's' || r == 'S') {
                                                    retro = true;
                                                } else {
                                                    retro = false;
                                                }
                                                Vehiculo.add(new Camion_de_Cargar(vol, altu, retro, cc, marc, model, year, precio, llant));
                                                for (Concesionaria o : Concesionaria) {
                                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                                }
                                                System.out.println("Elija una concesionaria");
                                                co = l.nextInt();
                                                Concesionaria.get(co).getVehiculo().add(new Camion_de_Cargar(vol, altu, retro, cc, marc, model, year, precio, llant));
                                                break;
                                            case 3:
                                                //crear buses
                                                System.out.println("Ingrese la cantidad de pasajeros");
                                                int cant = l.nextInt();
                                                Vehiculo.add(new Bus(cant, cc, marc, model, year, precio, llant));
                                                for (Concesionaria o : Concesionaria) {
                                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                                }
                                                System.out.println("Elija una concesionaria");
                                                co = l.nextInt();
                                                Concesionaria.get(co).getVehiculo().add(new Bus(cant, cc, marc, model, year, precio, llant));
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                        }
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                }
                                break;
                            case 2:
                                //modificar vehiculos
                                System.out.println("1.Carro\n2.Camion de carga\n3.Bus"
                                        + "\n4.Motocicleta\n5.Bicicleta");
                                int opm = l.nextInt();
                                switch (opm) {
                                    case 1:
                                        for (Vehiculo v : Vehiculo) {
                                            if (v instanceof Carro) {
                                                System.out.println("" + Vehiculo.indexOf(v) + "- " + v);
                                            }
                                        }
                                        System.out.println("Elija la opcion");
                                        int pmc = l.nextInt();
                                        System.out.println("1.Puertas\n2.descripcion\n3.velocidad");
                                        int mc = l.nextInt();
                                        switch (mc) {
                                            case 1:
                                                System.out.println("Ingrese la nueva cantidad de puertas");
                                                int puertas = l.nextInt();
                                                ((Carro) Vehiculo.get(pmc)).setPuertas(puertas);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la nueva descripcion del motor");
                                                l.nextLine();
                                                String Descrip = l.nextLine();
                                                ((Carro) Vehiculo.get(pmc)).setMotor(Descrip);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese la nueva velocidad maxima");
                                                int vel = l.nextInt();
                                                ((Carro) Vehiculo.get(pmc)).setVel(vel);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                        }
                                        break;
                                    case 2:
                                        for (Vehiculo v : Vehiculo) {
                                            if (v instanceof Camion_de_Cargar) {
                                                System.out.println("" + Vehiculo.indexOf(v) + "- " + v);
                                            }
                                        }
                                        System.out.println("Elija la opcion");
                                        pmc = l.nextInt();
                                        System.out.println("1.Volumen\n2.altura\n3.Retroexcavadora");
                                        mc = l.nextInt();
                                        switch (mc) {
                                            case 1:
                                                System.out.println("Ingrese la nueva cantidad de volumen max");
                                                int puertas = l.nextInt();
                                                ((Camion_de_Cargar) Vehiculo.get(pmc)).setVol(puertas);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la nueva altura");
                                                int altu = l.nextInt();
                                                ((Camion_de_Cargar) Vehiculo.get(pmc)).setAltura(altu);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese si tiene retroexcavadora");
                                                char resp = l.next().charAt(0);
                                                boolean r;
                                                if (resp == 's' || resp == 'S') {
                                                    r = true;
                                                } else {
                                                    r = false;
                                                }
                                                ((Camion_de_Cargar) Vehiculo.get(pmc)).setExcavadora(r);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                        }
                                        break;
                                    case 3:
                                        for (Vehiculo v : Vehiculo) {
                                            if (v instanceof Bus) {
                                                System.out.println("" + Vehiculo.indexOf(v) + "- " + v);
                                            }
                                        }
                                        System.out.println("Elija la opcion");
                                        pmc = l.nextInt();
                                        System.out.println("Ingrese la nueva cantidad de pasajeros");
                                        int puertas = l.nextInt();
                                        ((Bus) Vehiculo.get(pmc)).setCantidad(puertas);
                                        break;
                                    case 4:
                                        for (Vehiculo v : Vehiculo) {
                                            if (v instanceof Motocicleta) {
                                                System.out.println("" + Vehiculo.indexOf(v) + "- " + v);
                                            }
                                        }
                                        System.out.println("Elija la opcion");
                                        pmc = l.nextInt();
                                        System.out.println("1.Desplazamiento\n2.electrica");
                                        mc = l.nextInt();
                                        switch (mc) {
                                            case 1:
                                                System.out.println("Ingrese el nuevo desplazamiento del motor");
                                                l.nextLine();
                                                String dm = l.nextLine();
                                                ((Motocicleta) Vehiculo.get(pmc)).setDesplazamiento(dm);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese si tiene electricidad");
                                                char resp = l.next().charAt(0);
                                                boolean r;
                                                if (resp == 's' || resp == 'S') {
                                                    r = true;
                                                } else {
                                                    r = false;
                                                }
                                                ((Motocicleta) Vehiculo.get(pmc)).setElectricidad(r);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                        }
                                        break;
                                    case 5:
                                        for (Vehiculo v : Vehiculo) {
                                            if (v instanceof Bicicleta) {
                                                System.out.println("" + Vehiculo.indexOf(v) + "- " + v);
                                            }
                                        }
                                        System.out.println("Elija la opcion");
                                        pmc = l.nextInt();
                                        System.out.println("1.Radio\n2.descripcion\n3.BMX");
                                        mc = l.nextInt();
                                        switch (mc) {
                                            case 1:
                                                System.out.println("Ingrese la nueva cantidad de radio");
                                                puertas = l.nextInt();
                                                ((Bicicleta) Vehiculo.get(pmc)).setRadior(puertas);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la nueva descripcion de la bici");
                                                l.nextLine();
                                                String Descrip = l.nextLine();
                                                ((Bicicleta) Vehiculo.get(pmc)).setDescrip(Descrip);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese Si es de Calle o BMX");
                                                String tip = l.next();
                                                ((Bicicleta) Vehiculo.get(pmc)).setTipo(tip);
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                        }
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                }
                                break;
                            case 3:
                                if (!Vehiculo.isEmpty()) {
                                    for (Object o : Vehiculo) {
                                        System.out.println("" + Vehiculo.indexOf(o) + "- " + o);
                                    }
                                    System.out.println("Ingrese la opcion a eliminar");
                                    int ec = l.nextInt();
                                    Vehiculo.remove(ec);
                                }
                                break;
                            case 4:
                                if (!Vehiculo.isEmpty()) {
                                    for (Vehiculo o : Vehiculo) {
                                        System.out.println("" + Vehiculo.indexOf(o) + "- " + o);
                                    }
                                } else {
                                    System.out.println("Arreglo vacio");
                                }
                                break;
                            default:
                                System.out.println("opcion no valida");
                        }
                    } else {
                        System.out.println("Cree concesionarias primero");
                    }
                    break;
                case 4:
                    //compra y ventas

                    System.out.println("1.Comprar\n2.Venta");
                    int vc = l.nextInt();
                    switch (vc) {
                        case 1:
                            if (!Concesionaria.isEmpty()) {
                                for (Concesionaria o : Concesionaria) {
                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                }
                                System.out.println("Ingrese el concesionario que le gustaria visitar");
                                int co = l.nextInt();
                                for (Concesionaria c : Concesionaria) {

                                    System.out.println("" + Concesionaria.indexOf(c) + "- " + c.getVehiculo());

                                }
                                System.out.println("Ingrese el carro que desea comprar");
                                int occ = l.nextInt();
                                for (Clientes o : Cliente) {
                                    System.out.println("" + Cliente.indexOf(o) + "- " + o);
                                }
                                System.out.println("Ingrese el cliente que es usted");
                                int oc = l.nextInt();
                                int cont = 0;
                                for (int i = 0; i < Concesionaria.get(co).getClient().size(); i++) {
                                    if (Cliente.get(oc).equals(Concesionaria.get(co).getClient().get(i))) {
                                        cont++;
                                    }
                                }

                                if (!Cliente.get(oc).getVehiculos().isEmpty() && cont >= 2) {
                                    if (Concesionaria.get(co).getVehiculo().get(occ).getPrecio() <= Cliente.get(oc).getSaldo()) {
                                        Concesionaria.get(co).getClient().add(Cliente.get(oc));
                                        Cliente.get(oc).getVehiculos().add(Concesionaria.get(co).getVehiculo().get(occ));
                                        double np = Cliente.get(oc).getSaldo() - ((Concesionaria.get(co).getVehiculo().get(occ).getPrecio() * 0.025) + Concesionaria.get(co).getVehiculo().get(occ).getPrecio());
                                        Cliente.get(oc).setSaldo((int) np);
                                    }
                                } else {
                                    if (Concesionaria.get(co).getVehiculo().get(occ).getPrecio() <= Cliente.get(oc).getSaldo()) {
                                        Concesionaria.get(co).getClient().add(Cliente.get(oc));
                                        Cliente.get(oc).getVehiculos().add(Concesionaria.get(co).getVehiculo().get(occ));
                                        double np = Cliente.get(oc).getSaldo() - ((Concesionaria.get(co).getVehiculo().get(occ).getPrecio() * 0.075) + Concesionaria.get(co).getVehiculo().get(occ).getPrecio());
                                        Cliente.get(oc).setSaldo((int) np);
                                    }
                                }

                            } else {
                                System.out.println("Cree primero las concesionarios");
                            }
                            break;
                        case 2:
                            if (!Concesionaria.isEmpty()) {
                                for (Concesionaria o : Concesionaria) {
                                    System.out.println("" + Concesionaria.indexOf(o) + "- " + o);
                                }

                                for (Clientes o : Cliente) {
                                    System.out.println("" + Cliente.indexOf(o) + "- " + o);
                                }
                                System.out.println("Ingrese el cliente que es usted");
                                int oc = l.nextInt();
                                for (Clientes o : Cliente) {
                                    System.out.println("" + Cliente.indexOf(o) + "- " + o.getVehiculos());
                                }
                                System.out.println("Ingrese el carro que desea vender");
                                int occ = l.nextInt();
                                System.out.println("Ingrese el concesionario que le gustaria visitar");
                                int co = l.nextInt();
                                int cont = 0;
                                for (int i = 0; i < Concesionaria.get(co).getClient().size(); i++) {
                                    if (Cliente.get(oc).equals(Concesionaria.get(co).getClient().get(i))) {
                                        cont++;
                                    }
                                }
                                if (cont>=2) {
                                    Concesionaria.get(co).getVehiculo().add(Cliente.get(oc).getVehiculos().get(occ));
                                    double p = Concesionaria.get(co).getSaldo() - ((Cliente.get(oc).getVehiculos().get(occ).getPrecio() * 0.050) + Cliente.get(oc).getVehiculos().get(occ).getPrecio());
                                    Concesionaria.get(co).setSaldo((int) p);
                                } else {
                                    Concesionaria.get(co).getVehiculo().add(Cliente.get(oc).getVehiculos().get(occ));
                                    double p = Concesionaria.get(co).getSaldo() - ((Cliente.get(oc).getVehiculos().get(occ).getPrecio() * 0.075) + Cliente.get(oc).getVehiculos().get(occ).getPrecio());
                                    Concesionaria.get(co).setSaldo((int) p);
                                }
                            } else {
                                System.out.println("Cree primero las concesionarios");
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//Fin primer switch
        }

    }
}
