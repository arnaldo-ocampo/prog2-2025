/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cuentas.controlador;

import java.util.ArrayList;
import py.edu.fiuni.cuentas.modelo.Cliente;
import py.edu.fiuni.cuentas.repositorio.RepositorioCliente;

/**
 *
 * @author Arnaldo
 */
public class ControladorCliente {
    
    private RepositorioCliente repo = new RepositorioCliente();
    
    
    public int getCantidadCliente(){
        return this.repo.getCantidadCliente();
    }
    
    public void guardarCliente(Cliente cliente){
        
        this.repo.guardar(cliente);
    }
    
    public Cliente obtenerClientePorCI(int ci){
           
        return this.repo.obtenerClientePorCI(ci);
        
        /*for(Cliente c : this.repo.obtenerClientes()){
            if(c.getNroDocumento() == ci){
                return c;
            }
        }       
        return null;*/        
    }
}
