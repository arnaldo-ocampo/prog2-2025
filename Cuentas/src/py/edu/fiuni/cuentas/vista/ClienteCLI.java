/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cuentas.vista;

import java.util.Scanner;
import py.edu.fiuni.cuentas.controlador.ControladorCliente;
import py.edu.fiuni.cuentas.modelo.Cliente;

/**
 *
 * @author Arnaldo
 */
public class ClienteCLI {
    
    private static Scanner scanner = new Scanner(System.in);
    private static ControladorCliente control = new ControladorCliente();

    public void ejecutar() {
        boolean salir = false;
        do {
            String opcion = pedirOpcion();
            salir = procesarOpcion(opcion);
        } while (!salir);

        System.out.println("Muchas Gracias!!!!");
    }

    private static String pedirOpcion() {
        imprimirMenu();
        String op = scanner.nextLine();
        //TODO: VERIFICAR QUE LA OPCION INGRESADA ES VALIDA
        return op;
    }

    private static void imprimirMenu() {
        System.out.println("\n\n");
        System.out.println("Opciones:");
        System.out.println("[1] - Crear Cliente");
        System.out.println("[2] - Listar Clientes");
        System.out.println("[3] - Ver Cantidad de Clientes");
        System.out.println("[9] - Salir");
        System.out.println("Ingrese su opcion>> ");
    }

    
    private static boolean procesarOpcion(String opcion) {

        if ("9".equals(opcion)) {
            return true;
        }

        if ("1".equals(opcion)) {
            crearCliente();

        } else if ("2".equals(opcion)) {
            System.out.println("En Construccion");
            //control.listarClientes();
            
        } else if ("3".equals(opcion)) {
            //System.out.println("En Construccion");
            mostrarCantidadClientes();
        }
        return false;
    }
    
    
    private static void crearCliente() {
        System.out.println("Ingrese el nombre del Cliente:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el Email del Cliente:");
        String email = scanner.nextLine();
        
        Cliente nuevoCliente = new Cliente(nombre, email);
        
        control.guardarCliente(nuevoCliente);
        
        System.out.println("Cliente guardado con exito!");
    }
    
    private static void mostrarCantidadClientes() {
        System.out.println("Cantidad total de Clientes:: " + control.getCantidadCliente());
    }

}
