package com.kobuts.mochila.solveet;

import java.util.Collections; 
import java.util.LinkedList; 
import java.util.List; 

public class Mochila { 
 private List<Objeto> listaObjetos; 
 private int pesoM�ximo; 
  
 public Mochila(){ 
     listaObjetos = new LinkedList<Objeto>(); 
     pesoM�ximo = 0; 
 } 
  
 public Mochila(List<Objeto> listaObjetos, int pesoM�ximo){ 
     this.listaObjetos = new LinkedList<Objeto>(listaObjetos);  
     this.pesoM�ximo = pesoM�ximo; 
 } 
  
 public List<Objeto> resolver(){ 
     List<Objeto> res  = new LinkedList<Objeto>(); 
     Collections.sort(listaObjetos); 
//     System.out.println(listaObjetos); 
     int totalPeso = 0; 
     while(!listaObjetos.isEmpty() && totalPeso < pesoM�ximo){ 
         Objeto o = listaObjetos.get(0); 
         if(totalPeso + o.peso <= pesoM�ximo){ 
             res.add(o); 
             listaObjetos.remove(0); 
             totalPeso += o.peso; 
         }else{ 
             listaObjetos.remove(0); 
         } 
     } 
      
     return res; 
 } 
  
 public String toString(){ 
     String res = "Peso m�ximo: " + pesoM�ximo + "\nLista de objetos: "; 
     res += listaObjetos.toString(); 
      
     return res; 
 } 
} 