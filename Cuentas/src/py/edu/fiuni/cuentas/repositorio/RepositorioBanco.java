/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cuentas.repositorio;

import java.util.ArrayList;
import java.util.List;
import py.edu.fiuni.cuentas.modelo.Banco;
import py.edu.fiuni.cuentas.modelo.Cliente;

/**
 *
 * @author Arnaldo
 */
public class RepositorioBanco implements Repositorio<Banco> {
 
    private static ArrayList<Banco> bancos = new ArrayList();

    @Override
    public void guardar(Banco obj) {
       this.bancos.add((Banco)obj); 
    }

    @Override
    public void eliminar(Banco obj) {
      ;  
    }
    
    public List<Banco> getAll() {
        return bancos;
    }
    
}
