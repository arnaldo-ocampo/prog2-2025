/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cuentas.repositorio;

/**
 *
 * @author Arnaldo
 */
public interface Repositorio<M> {
    
    public void guardar(M obj);
    
    public void eliminar(M obj);
}
