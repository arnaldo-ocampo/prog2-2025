/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.Objects;

/**
 *
 * @author Arnaldo
 */
public class Cliente {

    private final double PI; 
    
    private String nombre = null;
    private int edad = 0;
    private int numDocumento = 0;
    private String email = null;

    public Cliente() {
        this("", "");
        //PI = 3.14;
        this.nombre = "";
        this.email = "";
        this.edad = 18;
        this.numDocumento = 1000;
    }

    public Cliente(int nroDoc, String email) {
        this("", 18, nroDoc, email);
    }

    public Cliente(String name, String email) {
        this(name, 18, 1000, email);
    }

    public Cliente(String nombre, int edad, int nroDoc, String email) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.numDocumento = nroDoc;
        PI = 3.14;
    }

    public void printData() {
        //PI = 3.14;
        System.out.println("Nombre:" + this.nombre);
        System.out.println("CI Nro:" + this.numDocumento);
    }

    /**
     *
     * @param c
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cliente)) {
            return false;
        }
        Cliente temp = (Cliente) obj;
        if (this.numDocumento == temp.numDocumento) {
            return true;
        } else {
            return false;
        }
        
        //return this.numDocumento == temp.numDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + this.edad;
        hash = 53 * hash + this.numDocumento;
        hash = 53 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public String toString() {
        return "Nombre:" + this.nombre + "\n"
                + "CI Nro:" + this.numDocumento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNroDocumento() {
        return this.numDocumento;
    }

    public void setNroDocumento(int ci) {
        this.numDocumento = ci;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
