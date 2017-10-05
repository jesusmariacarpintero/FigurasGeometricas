package com.example.ejb.domain;

public class Cubo extends Geometric{
	// Aristas
	float a;
	
	public Cubo(float a) {
		super(12, 6);
		// TODO Auto-generated constructor stub
		this.a = a;
	}

	@Override
	public float calculoArea() {
		// TODO Auto-generated method stub
		return 6*a*a;
	}

	@Override
	public float calculoVolumen() {
		// TODO Auto-generated method stub
		return a*a*a;
	}

}
