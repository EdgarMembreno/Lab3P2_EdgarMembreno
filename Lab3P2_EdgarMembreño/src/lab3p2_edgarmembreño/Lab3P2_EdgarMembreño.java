/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_edgarmembreño;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class Lab3P2_EdgarMembreño {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Tienda> list = new ArrayList();
        System.out.println("*****Login****");
        System.out.println("Ingrese Un usuario: ");
        String usua = leer.next();
        System.out.println("Ingrese Contraseña: ");
        String contra = leer.next();
        if (usua.equals("admin") && contra.equals("1234")) {
            int opcion = 0;
            while (opcion != 8) {
                System.out.println("MENU\n"
                        + "1.Crear Tienda\n"
                        + "2.Login");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1: {
                        opcion = 0;
                        while (opcion != 4) {
                            System.out.println("Ingrese el identificador de la tienda: ");
                            int identi = leer.nextInt();
                            System.out.println("Ingrese la ubicacion de la tienda: ");
                            String ubi = leer.next();
                            System.out.println("Ingrese la cantidad maxima de empleados: ");
                            int cantEmplea = leer.nextInt();
                            System.out.println("Ingrese las cajas de pago: ");
                            int cajaspago = leer.nextInt();
                            System.out.println("Ingrese el producto mas vendido: ");
                            String produ = leer.next();
                            System.out.println("Ingrese la cantidad maxima de Articulo");
                            int maxArt = leer.nextInt();
                            list.add(new Tienda(identi, ubi, cantEmplea, cajaspago, produ, maxArt));

                            System.out.println("MENU\n"
                                    + "1.Agregar Articulo\n"
                                    + "2.Agregar Empleados\n"
                                    + "3.Agregar Clientes\n"
                                    + "4.Salir del sistema");
                            opcion = leer.nextInt();
                            switch (opcion) {
                                case 1: {

                                    System.out.println("Que articulo desea ingresar 1.Televisor 2.Consolas 3.equipo de sonido 4.Teatro en casa: ");
                                    int articulo = leer.nextInt();
                                    if (articulo == 1) {
                                        System.out.println("Ingrese el numero de serie del articulo: : ");
                                        int numserie = leer.nextInt();
                                        System.out.println("Ingrese el precio del articulo: ");
                                        int precio = leer.nextInt();
                                        System.out.println("Ingrese el color del articulo: ");
                                        String color = leer.next();
                                        System.out.println("Ingrese informacion sobre garantia: ");
                                        String infogara = leer.next();
                                        System.out.println("Ingrese el tamaño del televisor: ");
                                        int tamTelevi = leer.nextInt();
                                        System.out.println("Ingrese si es smart o no   si/no : ");
                                        String inteligente = leer.next();
                                        boolean smart;
                                        if (inteligente == "si") {
                                            smart = true;
                                        } else {
                                            smart = false;
                                        }
                                        System.out.println("Ingrese la marca:  ");
                                        String marca = leer.next();
                                        System.out.println("Ingrese la cantidad de conexiones que tiene: ");
                                        int conexiones = leer.nextInt();
                                        System.out.println("Ingrese el grosor del tele: ");
                                        int grosor = leer.nextInt();
                                        for (int i = 0; i < list.size(); i++) {
                                            list.get(i).getArt().add(new Televisores(tamTelevi, smart, marca, conexiones, grosor, numserie, precio, color, infogara));
                                        }

                                    } else if (articulo == 2) {
                                        System.out.println("Ingrese el numero de serie del articulo: : ");
                                        int numserie = leer.nextInt();
                                        System.out.println("Ingrese el precio del articulo: ");
                                        int precio = leer.nextInt();
                                        System.out.println("Ingrese el color del articulo: ");
                                        String color = leer.next();
                                        System.out.println("Ingrese informacion sobre garantia: ");
                                        String infogara = leer.next();
                                        System.out.println("Ingrese la marca de la Consola: ");
                                        String marca = leer.next();
                                        System.out.println("Ingrese el almacenamiento: ");
                                        int almacenamiento = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de controles que tiene: ");
                                        int controles = leer.nextInt();
                                        System.out.println("Ingrese el numero de accesorio que contiene:: ");
                                        String acce = leer.next();
                                        System.out.println("Ingrese la Informacion sobre la tarjeta de video: ");
                                        String tarjeta = leer.next();
                                        for (int i = 0; i < list.size(); i++) {
                                            list.get(i).getArt().add(new Consolas(marca, almacenamiento, controles, numserie, infogara, numserie, precio, color, infogara));
                                        }

                                    } else if (articulo == 3) {
                                        System.out.println("Ingrese el numero de serie del articulo: : ");
                                        int numserie = leer.nextInt();
                                        System.out.println("Ingrese el precio del articulo: ");
                                        int precio = leer.nextInt();
                                        System.out.println("Ingrese el color del articulo: ");
                                        String color = leer.next();
                                        System.out.println("Ingrese informacion sobre garantia: ");
                                        String infogara = leer.next();
                                        System.out.println("Ingrese la cantidad de altavoces que contiene: ");
                                        int altavo = leer.nextInt();
                                        System.out.println("Ingrese la potencia maxima ");
                                        int potenmax = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de auxilares: ");
                                        int cantaux = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de discos que puede ingresar: ");
                                        int disc = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de USB: ");
                                        int usb = leer.nextInt();
                                        for (int i = 0; i < list.size(); i++) {
                                            list.get(i).getArt().add(new Equipos(altavo, potenmax, cantaux, disc, cantaux, numserie, precio, color, infogara));
                                        }

                                    } else if (articulo == 4) {
                                        System.out.println("Ingrese el numero de serie del articulo: : ");
                                        int numserie = leer.nextInt();
                                        System.out.println("Ingrese el precio del articulo: ");
                                        int precio = leer.nextInt();
                                        System.out.println("Ingrese el color del articulo: ");
                                        String color = leer.next();
                                        System.out.println("Ingrese informacion sobre garantia: ");
                                        String infogara = leer.next();
                                        System.out.println("Ingrese la cantodad de altavoces: ");
                                        int alta = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de blue ray");
                                        int Blu = leer.nextInt();
                                        System.out.println("Ingrese la informacion sobre el lector de disco: ");
                                        String infoDisc = leer.next();
                                        System.out.println("Ingrese informacion sobre la limpieza ");
                                        String infoLim = leer.next();
                                        for (int i = 0; i < list.size(); i++) {
                                            list.get(i).getArt().add(new Teatros(alta, cantEmplea, infoDisc, infoDisc, numserie, precio, color, infogara));
                                        }
                                    } else {
                                        System.out.println("No existe el articulo ingresado");
                                    }
                                    break;

                                }
                                case 2: {
                                    System.out.println("Ingrese el rango del empleado 1.Cajero 2.Supervisor 3.Asesor Financiero : ");
                                    int empleado = leer.nextInt();

                                    if (empleado == 1) {
                                        System.out.println("Ingrese el usuario : ");
                                        String user = leer.next();
                                        System.out.println("Ingree la contraseña");
                                        String contras = leer.next();
                                        System.out.println("Ingrese el nombre : ");
                                        String nombre = leer.next();
                                        System.out.println("Ingrese el Apellido: ");
                                        String apellido = leer.next();
                                        System.out.println("Ingrese su nacionalidad: ");
                                        String nacionalidad = leer.next();
                                        System.out.println("Ingrese su salario: ");
                                        int sala = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de años laborados :  ");
                                        int an = leer.nextInt();
                                        System.out.println("Ingrese la hora de trabajo: ");
                                        int ht = leer.nextInt();
                                        System.out.println("Ingrese la hora de almuerzo: ");
                                        int ha = leer.nextInt();
                                        System.out.println("Ingrese la meta de vender :");
                                        double mv = leer.nextDouble();
                                        System.out.println("Ingrese la cantidad de empleados que atiende cada dia: ");
                                        int cantEmp = leer.nextInt();
                                        for (int i = 0; i < list.size(); i++) {
                                            list.get(i).getEmpl().add(new Cajero(an, ht, ha, mv, cantEmp, user, contras, nombre, apellido, nacionalidad, sala));
                                        }

                                    } else if (empleado == 2) {

                                        ArrayList<String> cajer = new ArrayList<String>();

                                        System.out.println("Ingrese el usuario : ");
                                        String user = leer.next();
                                        System.out.println("Ingrese la contraseña");
                                        String contras = leer.next();
                                        System.out.println("Ingrese el nombre : ");
                                        String nombre = leer.next();
                                        System.out.println("Ingrese el Apellido: ");
                                        String apellido = leer.next();
                                        System.out.println("Ingrese su nacionalidad: ");
                                        String nacionalidad = leer.next();
                                        System.out.println("Ingrese su salario: ");
                                        int sala = leer.nextInt();
                                        System.out.println("Ingrese los cajeros que supervisa actualmente : ");
                                        String caje = leer.next();
                                        cajer.add(caje);
                                        System.out.println("Ingrese su salario promedio : ");
                                        int salapr = leer.nextInt();
                                        System.out.println("Ingrese la meta promedio: ");
                                        int prome = leer.nextInt();
                                        for (int i = 0; i < list.size(); i++) {
                                            list.get(i).getEmpl().add(new Supervisor(cajer, sala, prome, user, contra, nombre, apellido, nacionalidad, salapr));
                                        }

                                    } else if (empleado == 3) {
                                        ArrayList<String> clien = new ArrayList<String>();
                                        System.out.println("Ingrese el usuario : ");
                                        String user = leer.next();
                                        System.out.println("Ingree la contraseña");
                                        String contras = leer.next();
                                        System.out.println("Ingrese el nombre : ");
                                        String nombre = leer.next();
                                        System.out.println("Ingrese el Apellido: ");
                                        String apellido = leer.next();
                                        System.out.println("Ingrese su nacionalidad: ");
                                        String nacionalidad = leer.next();
                                        System.out.println("Ingrese su salario: ");
                                        int sala = leer.nextInt();

                                        System.out.println("Ingrese sus clientes: ");
                                        String clientes = leer.next();
                                        clien.add(clientes);
                                        System.out.println("Ingrese la cnatidad de productos comprados: ");
                                        int cantcom = leer.nextInt();
                                        System.out.println("Ingrese los creditos que tienen :");
                                        int cred = leer.nextInt();
                                        for (int i = 0; i < list.size(); i++) {
                                            list.get(i).getEmpl().add(new Asesor(clien, cantcom, cred, user, contras, nombre, apellido, nacionalidad, sala));
                                        }
                                    } else {
                                        System.out.println("No hay rango ingresado: ");
                                    }
                                    break;

                                }
                                case 3: {
                                    ArrayList<String> produc = new ArrayList<String>();
                                    System.out.println("Ingrese el nombre : ");
                                    String nombre = leer.next();
                                    System.out.println("Ingrese el Apellido: ");
                                    String apellido = leer.next();
                                    System.out.println("Ingrese su salario: ");
                                    int sala = leer.nextInt();
                                    System.out.println("Ingrese su nacionalidad: ");
                                    String nacionalidad = leer.next();
                                    System.out.println("Ingrese su credito: ");
                                    int credi = leer.nextInt();
                                    System.out.println("Ingrese los productos que ha comprado: ");
                                    String produt = leer.next();
                                    produc.add(produt);
                                    System.out.println("Ingrese la cantidad de productos que ha comprado: ");
                                    int cantpro = leer.nextInt();
                                    System.out.println("Ingrese la direccion : ");
                                    String dire = leer.next();
                                    System.out.println("Ingrese el usuario : ");
                                    String user = leer.next();
                                    System.out.println("Ingree la contraseña");
                                    String contrase = leer.next();
                                    
                                    for (int i = 0; i < list.size(); i++) {
                                        list.get(i).getClien().add(new Clientes(nombre, apellido, sala, nacionalidad, credi, produc, cantpro, dire, user, contrase));
                                    }
                                }

                            }
                        }
                        break;
                    }
                    case 2: {
                        opcion = 0;
                    }
                    while (opcion != 8) {
                        System.out.println("MENU\n"
                                + "1.Eliminar Articulo\n"
                                + "2.Eliminar Empleados\n"
                                + "3.Eliminar Clientes\n"
                                + "4.Editar Articulo\n"
                                + "5.Editar Empleado\n"
                                + "6.Editar Clientes\n"
                                + "7.Imprimir todos los productos "
                                + "8.Salir del sistema");
                        opcion = leer.nextInt();
                        switch (opcion) {

                        }

                    }

                }
            }
        }

    }

}
