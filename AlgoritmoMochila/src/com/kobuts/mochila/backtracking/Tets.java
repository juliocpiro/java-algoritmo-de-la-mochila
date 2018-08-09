package com.kobuts.mochila.backtracking;

public class Tets {
	
	public static void main(String[] args) {
		 
        Elemento[] elementos = {
            new Elemento(1,11200,11200),
            new Elemento(2,10050,10050),
            new Elemento(3,20000,20000),
            new Elemento(4,100,100),
            new Elemento(5,200,200),
            new Elemento(6,200,200),
            new Elemento(7,200,200),
            new Elemento(8,300,300),
            new Elemento(9,500,500),
            new Elemento(10,600,600),
            new Elemento(11,650,650),
            new Elemento(12,700,700),
            new Elemento(13,800,800),
            new Elemento(14,810,810),
            new Elemento(15,900,900),
            new Elemento(16,999,999),
            new Elemento(17,99,99),
            new Elemento(18,1000,1000),
            new Elemento(19,1500,1500),
            new Elemento(20,2000,2000),
            new Elemento(21,3000,3000),
            new Elemento(22,4000,4000),
            new Elemento(23,5000,5000),
            new Elemento(24,6000,6000),
            new Elemento(25,7000,7000),
            new Elemento(26,9999,9999),
            new Elemento(27,1000,1000),
            new Elemento(28,5555,5555),
            new Elemento(29,2222,2222),
            new Elemento(30,1111,1111),
            new Elemento(31,1500,1500),
            new Elemento(32,1600,1600),
            new Elemento(33,8000,8000),
            new Elemento(34,9000,9000),
            new Elemento(35,1520,1520),
            new Elemento(36,6450,6450),
            new Elemento(37,2000,2000)
        };
 
        Mochila m_base = new Mochila(10000, elementos.length);
        Mochila m_opt = new Mochila(10000, elementos.length);
 
        System.out.println("Inicia llamado al algoritmo");
        llenarMochila(m_base, elementos, false, m_opt);
 
        System.out.println(m_opt);
        
    }
	
	
	public static void llenarMochila(Mochila m_base, Elemento[] elementos, boolean llena, Mochila m_opt) {
		System.out.println("Entro a mochilo");
	      //si esta llena
	      if (llena) {
	          //compruebo si tiene mas beneficio que otra
	          if (m_base.getBeneficio() >= m_opt.getBeneficio()) {	 
	              Elemento[] elementosMochBase = m_base.getElementos();
	              m_opt.clear();
	              //metemos los elementos
	              for (Elemento e : elementosMochBase) {
	                  if (e != null) {
	                      m_opt.aniadirElemento(e);
	                  }
	              }	 
	          }	 
	      } else {
	    	  //if la suma de todos los pesos es menor o igual al peso maximo, se debe retornar todos los elementos else hacer el calculo
	    	  int sumaTodos = 0;
	    	  for(int i = 0; i < elementos.length; i++) {
	    		  sumaTodos+=elementos[i].getBeneficio();
	    	  }
	    	  if(sumaTodos<=m_base.getPesoMaximo()) {
	    		  for (int i = 0; i < elementos.length; i++) {
		        	  m_base.aniadirElemento(elementos[i]); //añadimos
                  }
	    		  llenarMochila(m_base, elementos, true, m_opt);		          
	    	  }else {
	    		  //Recorre los elementos
		    	  for (int i = 0; i < elementos.length; i++) {
		        	  //si existe el elemento
		              if (!m_base.existeElemento(elementos[i])) {
		            	  //Si el peso de la mochila se supera, indicamos que esta llena
		                  if (m_base.getPesoMaximo() >= m_base.getPeso() + elementos[i].getPeso()) {
		                	  m_base.aniadirElemento(elementos[i]); //añadimos
		                      llenarMochila(m_base, elementos, false, m_opt);
		                      m_base.eliminarElemento(elementos[i]); // lo eliminamos
		                  }else {
		                      llenarMochila(m_base, elementos, true, m_opt);
		                  }
		 
		              }
		 
		          }
	    	  }
	      }
	 
	  }
}
