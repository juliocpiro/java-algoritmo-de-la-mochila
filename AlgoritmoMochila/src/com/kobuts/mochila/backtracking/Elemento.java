package com.kobuts.mochila.backtracking;

public class Elemento {
	  
    private int peso;
    private int beneficio;
    private int id;
 
    public Elemento(int id, int peso, int beneficio) {
    	this.id=id;
        this.peso = peso;
        this.beneficio = beneficio;
    }
 
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeso() {
        return peso;
    }
 
    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int getBeneficio() {
        return beneficio;
    }
 
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
 
    @Override
    public String toString(){
        return "id:"+id+", peso:"+peso+", beneficio:"+beneficio;
    }
     
     
}