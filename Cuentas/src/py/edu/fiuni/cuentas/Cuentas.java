/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cuentas;

import py.edu.fiuni.cuentas.Cliente;

/**
 *
 * @author Arnaldo
 */
public class Cuentas {

    
    public static void modificarParam(final Cuenta c){
        c.setNumero(34); // = new Cuenta();
    }
    
    public static void main(String[] args) {

        //String saludo = "hola";
        //modificarParam(saludo);
        //System.out.println(saludo);
        
        int numero = 4;
        int x = numero;
        numero = 9;
        
        System.out.println(x);
        
        
        
        Banco banco = new Banco();
        final Cliente c1 = new Cliente("Steve Jobs", 67, 1000, "steve@apple.com");
        Cliente c2 = new Cliente("Steve Jobs", 67, 1000, "steve@apple.com");
        Cliente c3 = null;
        Cliente c4 = null;
        
        c1.setNombre("fulano menganez"); // = new Cliente();
        
        Cuenta cuenta1 = new Cuenta(banco, c1, "GS", 5000);
        Cuenta cuenta2 = new Cuenta(banco, c2, "USD", 6000);
        
        modificarParam(cuenta1);
        
        System.out.println(cuenta1);
        /*System.out.println(cuenta2);
        
        int a = 100000;
        
        cuenta1.depositar(a);
        cuenta1.transferirA(cuenta2, 10000);
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);*/
        
        //System.out.println(a);
        
        //System.out.println(cuenta1.getSaldo());
        
        
        //System.out.println(c1.equals(c2));
        
        //System.out.println(null == null);
        
/*
        //c1.printData();
        
        System.out.println(c1);
        System.out.println(c2);
        
        String strC1 = c1.toString();
        String strC2 = c2.toString();

        //String s1 = "HOLA";
        //String s2 = "HOLA";
        
        System.out.println(c1.equals(c2));
        
        */
        /*System.out.println("C1 " + strC1);
        System.out.println("C2 " + strC2);

        System.out.println(strC1.equals(strC2));**/

        //System.out.println(strC1);
        //System.out.println(strC2);
        //System.out.println(strC1 == strC2);
        //System.out.println(c1.equals(c2));

        /*
        ControladorCuenta control = new ControladorCuenta();

        //System.out.println("# Cuentas 1: " + control.getCantidadCuentas());

        control.agregarCuenta(new Cuenta(null, null, "gs", 500));
        control.agregarCuenta(new Cuenta(null, null, "gs", 600));
        control.agregarCuenta(new Cuenta(null, null, "gs", 700));
        control.agregarCuenta(new Cuenta(null, null, "gs", 800));

        boolean b =  control.existeCuentaConNumero(700);
        System.out.println("700" + b);
        
         */
 /*System.out.println("# Cuentas 1: " + control.getCantidadCuentas());

        ControladorCuenta control2 = new ControladorCuenta();

        System.out.println("# Cuentas 2: " + control2.getCantidadCuentas());
        control2.agregarCuenta(new Cuenta());
        control2.agregarCuenta(new Cuenta());

        System.out.println("# Cuentas 2: " + control2.getCantidadCuentas());
        System.out.println("# Cuentas 1: " + control.getCantidadCuentas());
         */
    }

}
