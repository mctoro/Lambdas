/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author cice
 */
public class Main {
        public static void main(String... args){
        
        InterfazFuncional ifuncional = (a, b) -> a + b;
        int suma = ifuncional.operacion(2, 4);
        
        ifuncional = (a, b) -> a - b;
        int resta = ifuncional.operacion(4, 2);
        
        System.out.println(suma);
        System.out.println(resta);
        
        String nombre1 = "Gustavo";
        String nombre2 = "antonio";
        
        String[] nombres = {nombre1, nombre2};
        Comparator<String> comparator = (a, b) -> a.compareTo(b);
        
        Arrays.sort(nombres, comparator);
        
        for (String nombre : nombres) {
            //System.out.println(nombre);
        }
        
        List<String> lista = new ArrayList<>();
        lista.add("gustavo");
        lista.add("antonio");
        lista.add("Felipe");
        lista.add("marcelo");
        lista.sort((a, b) -> a.compareTo(b));
        
        boolean existe = lista.stream().anyMatch(a -> a.contains("f"));
        
        lista.stream().filter(a -> a.toLowerCase().contains("f")).forEach(a -> System.out.println(a));

        /*
        for (String n : lista) {
            System.out.println(n);
        }
        
        System.out.println(existe);
        */
    }
}
