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
public class Banco implements Comparable<Banco> {
    
    private int codigo = 0;
    private String nombre = null;
    private String direccion = null;
    private String correo = null;
    private String telefono = null;
    
    public Banco (){
        this(0, "", "", "", "");
    }
    
    public Banco(int codigo, String nombre, String direcc, String correo, String telef){
        this.codigo = codigo;
        this.nombre =  nombre;
        this.direccion = direcc;
        this.correo = correo;
        this.telefono = telef;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    public String toString(){
        return "[" + codigo + "] : " + nombre; 
    }
    
    
    @Override
    public int compareTo(Banco b){
        //return b.nombre.compareTo(this.nombre);
        
        /*if(this.codigo == b.codigo){
            return 0;
        }        
        if(this.codigo < b.codigo){
            return -1;
        }        
        return 1;
        */
        //return codigo == b.codigo ? 0 : (codigo < b.codigo ? -1 : 1);
        return codigo - b.codigo;
    }
}
