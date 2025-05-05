/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.cuentas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import py.edu.fiuni.cuentas.modelo.Banco;

/**
 *
 * @author Arnaldo
 */
public class Pruebas {

    public static void main(String args[]) {

        var b1 = new Banco(5, "Rio", "", "", "");
        var b2 = new Banco(2, "Continental", "", "", "");
        var b3 = new Banco(9, "Sudameris", "", "", "");
        var b4 = new Banco(22, "Atlas", "", "", "");
        var b5 = new Banco(1, "GNB", "", "", "");

        LinkedList linked = new LinkedList();

        ArrayList<Banco> bancos = new ArrayList();
        bancos.add(b1);
        bancos.add(b2);
        bancos.add(b3);
        bancos.add(b4);
        bancos.add(b5);

        //Collections.sort(bancos);

        bancos.forEach(banco -> System.out.println(banco));
        
        bancos.remove(new Banco(5, "Rio", "", "", ""));
        
        System.out.println("Despues de borrar");
        
        bancos.forEach(banco -> System.out.println(banco));
        
        
        /*HashMap map = new HashMap<Integer, Banco>();

        map.put(b1.getCodigo(), b1);
        map.put(b2.getCodigo(), b2);
        map.put(b3.getCodigo(), b3);
        map.put(b4.getCodigo(), b4);
        map.put(b5.getCodigo(), b5);
        map.put(789, null);
        map.put(-9875, null);
        

        //map.values().forEach(System.out::println);
        if (map.containsKey("estas")) {
            var s = map.get("estas");
            System.out.println(s);
        }
*/
        /*List<String> list = new ArrayList();
        list.add("Felipe");
        list.add("Felipe");
        list.add("Carlos");
        list.add("Ximena");
        list.add("Maria");

       Collections.sort(list);*/
 /*for(String s : list){
            System.out.println(s);
        }*/
        //list.forEach(System.out::println);
        //list.forEach(Pruebas::fn);
        //list.forEach(s -> System.out.println(s));
    }

    public static void fn(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

}
