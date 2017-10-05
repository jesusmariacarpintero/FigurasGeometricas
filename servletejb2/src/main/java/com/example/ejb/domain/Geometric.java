package com.example.ejb.domain;

public abstract class Geometric {

	private int lados;
	private int caras;
	
	public Geometric(int lados, int caras){
		this.lados = lados;
		this.caras = caras;
	}
	
	public abstract float calculoArea();	
	public abstract float calculoVolumen();
	
	public int getLados(){
		if(lados == Integer.MAX_VALUE){
			return 0;
		}else{
			return lados;
		}
	}
	
	public int getCaras(){
		if(caras == Integer.MAX_VALUE){
			return 0;
		}else{
			return caras;			
		}
	}
	
}
