package com.kobuts.mochila.solveet;


import java.util.LinkedList;
import java.util.List; 

public class ProblemaMochila { 
	 
    public static void main(String[] args) { 
        int peso = 1000; 
        List<Objeto> listaObjetos= new LinkedList<Objeto>(); 
        listaObjetos.add(new Objeto(11200,11200));
        listaObjetos.add(new Objeto(10050,10050));
        listaObjetos.add(new Objeto(20000,20000));
        listaObjetos.add(new Objeto(100,100));
        listaObjetos.add(new Objeto(200,200));
        listaObjetos.add(new Objeto(201,201));
        listaObjetos.add(new Objeto(202,202));
        listaObjetos.add(new Objeto(300,300));
        listaObjetos.add(new Objeto(500,500));
        listaObjetos.add(new Objeto(600,600));
        listaObjetos.add(new Objeto(650,650));
        listaObjetos.add(new Objeto(700,700));
        listaObjetos.add(new Objeto(800,800));
        listaObjetos.add(new Objeto(810,810));
        listaObjetos.add(new Objeto(900,900));
        listaObjetos.add(new Objeto(999,999));
        listaObjetos.add(new Objeto(99,99));
        listaObjetos.add(new Objeto(1500,1500));
        listaObjetos.add(new Objeto(2000,2000));
        listaObjetos.add(new Objeto(3000,3000));
        listaObjetos.add(new Objeto(4000,4000));
        listaObjetos.add(new Objeto(5000,5000));
        listaObjetos.add(new Objeto(6000,6000));
        listaObjetos.add(new Objeto(7000,7000));
        listaObjetos.add(new Objeto(9999,9999));
        listaObjetos.add(new Objeto(5555,5555));
        listaObjetos.add(new Objeto(2222,2222));
        listaObjetos.add(new Objeto(1111,1111));
        listaObjetos.add(new Objeto(1500,1500));
        listaObjetos.add(new Objeto(1600,1600));
        listaObjetos.add(new Objeto(8000,8000));
        listaObjetos.add(new Objeto(9000,9000));
        listaObjetos.add(new Objeto(1520,1520));
        listaObjetos.add(new Objeto(6450,6450));
        listaObjetos.add(new Objeto(11200,11200));
        listaObjetos.add(new Objeto(10050,10050));
        listaObjetos.add(new Objeto(20000,20000));
        listaObjetos.add(new Objeto(100,100));
        listaObjetos.add(new Objeto(200,200));
        listaObjetos.add(new Objeto(201,201));
        listaObjetos.add(new Objeto(202,202));
        listaObjetos.add(new Objeto(300,300));
        listaObjetos.add(new Objeto(500,500));
        listaObjetos.add(new Objeto(600,600));
        listaObjetos.add(new Objeto(650,650));
        listaObjetos.add(new Objeto(700,700));
        listaObjetos.add(new Objeto(800,800));
        listaObjetos.add(new Objeto(810,810));
        listaObjetos.add(new Objeto(900,900));
        listaObjetos.add(new Objeto(999,999));
        listaObjetos.add(new Objeto(99,99));
        listaObjetos.add(new Objeto(1500,1500));
        listaObjetos.add(new Objeto(2000,2000));
        listaObjetos.add(new Objeto(3000,3000));
        listaObjetos.add(new Objeto(4000,4000));
        listaObjetos.add(new Objeto(5000,5000));
        listaObjetos.add(new Objeto(6000,6000));
        listaObjetos.add(new Objeto(7000,7000));
        listaObjetos.add(new Objeto(9999,9999));
        listaObjetos.add(new Objeto(5555,5555));
        listaObjetos.add(new Objeto(2222,2222));
        listaObjetos.add(new Objeto(1111,1111));
        listaObjetos.add(new Objeto(1500,1500));
        listaObjetos.add(new Objeto(1600,1600));
        listaObjetos.add(new Objeto(8000,8000));
        listaObjetos.add(new Objeto(9000,9000));
        listaObjetos.add(new Objeto(1520,1520));
        listaObjetos.add(new Objeto(6450,6450));
        
        Mochila mochila = new Mochila(listaObjetos, peso); 
        System.out.println(mochila.toString()); 
        List<Objeto> solucion = mochila.resolver(); 
        System.out.println("Solución: " + solucion.toString());
        int speso=0;
        int svalor=0;
        for(Objeto obj : solucion) {
        	speso += obj.peso;
        	svalor += obj.valor;
        	System.out.println("> "+obj.peso + " - "+obj.valor);
        }
        System.out.println(">> "+speso+" - "+svalor);
    } 
} 
