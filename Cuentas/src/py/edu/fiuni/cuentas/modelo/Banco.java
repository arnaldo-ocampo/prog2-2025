package py.edu.fiuni.cuentas.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Arnaldo
 */
public class Banco {
    
    private String nombre = null;
    private String direccion = null;
    private String correo = null;
    private String telefono = null;
    
    public Banco (){
        this("", "", "", "");
    }
    
    public Banco(String nombre, String direcc, String correo, String telef){
        this.nombre =  nombre;
        this.direccion = direcc;
        this.correo = correo;
        this.telefono = telef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
}
