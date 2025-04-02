/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.ArrayList;

/**
 *
 * @author Arnaldo
 */
public class ControladorCuenta {

    private static ArrayList<Cuenta> cuentas = new ArrayList();

    public ControladorCuenta() {
        //this.cuentas = new ArrayList();
    }

    /**
     * Busca una cuenta con el numero especificado
     *
     * @param numero El numero de la cuenta a buscar
     * @return True si existe una cuenta con el numero espcificado en la
     * coleccion interna, de lo contrario false
     */
    public boolean existeCuentaConNumero(int numero) {

        /*for (int i = 0; i < cuentas.size(); i++) {
            Cuenta temp = (Cuenta)cuentas.get(i);
            if(temp.getNumero() == numero){
                return true;
            }
        }        
        return false;*/
        
        /*for(Cuenta cta : cuentas){
            if(cta.getNumero() == numero){
                return true;
            }
        }
        return false;
        */
        
        return cuentas.stream().anyMatch(c -> c.getNumero() == numero);

        /*while (true) {
            System.out.println("hola");
        }
        for (;;) {
            System.out.println("");
        }*/
    }

    public int getCantidadCuentas() {
        return cuentas.size();
    }

    public void agregarCuenta(Cuenta cta) {
        cuentas.add(cta);
    }
}
