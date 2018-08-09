package com.kobuts.mochila.solveet;

public class Objeto implements Comparable<Objeto>{ 
    int peso; 
    int valor; 
    double ratio; 
     
    public Objeto(){ 
        peso = 0; 
        valor = 0; 
        ratio = -1; 
    } 
     
    public Objeto(int peso, int valor){ 
        this.peso = peso; 
        this.valor = valor; 
        /*if(peso > 0){ 
            ratio = this.valor / this.peso; 
        }else{ 
            ratio = -1; 
        } */
        ratio = peso;
    } 
 
    @Override 
    public int compareTo(Objeto o) { 
        int res = 0; 
        if((this.ratio > o.ratio) || 
            ((this.ratio == o.ratio) && (this.peso < o.peso))){ 
            res = -1; 
        }else if((this.ratio < o.ratio) || 
                ((this.ratio == o.ratio) && (this.valor > o.valor)) || 
                ((this.ratio == o.ratio) && (this.valor == o.valor) && 
                        (this.peso < o.peso))){ 
            res = 1; 
        } 
        return res; 
    } 
     
    public String toString(){ 
        return "(" + peso + " , " + valor + " , " + ratio + ")"; 
    } 
} 