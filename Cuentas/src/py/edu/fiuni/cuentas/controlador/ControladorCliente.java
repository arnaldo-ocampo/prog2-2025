/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cuentas.controlador;

import java.util.ArrayList;
import py.edu.fiuni.cuentas.modelo.Cliente;

/**
 *
 * @author Arnaldo
 */
public class ControladorCliente {
    
    private static ArrayList<Cliente> clientes = new ArrayList();

    public int getCantidadCliente(){
        return this.clientes.size();
    }
    
    public void guardarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public Cliente obtenerClientePorCI(int ci){
        
        /*for(int i = 0; i < this.clientes.size(); i++){
            Cliente temp = this.clientes.get(i);
            if(temp.getNroDocumento() == ci){
                return temp;
            }
        }*/       
        for(Cliente c : this.clientes){
            if(c.getNroDocumento() == ci){
                return c;
            }
        }       
        return null;        
    }
}
