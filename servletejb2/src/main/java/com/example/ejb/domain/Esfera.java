package com.example.ejb.domain;

public class Esfera extends Geometric{
	private static final float PI = 3.1416f;
	private float r;
	
	public Esfera(float r) {
		super(Integer.MAX_VALUE, 1);
		// TODO Auto-generated constructor stub
		this.r= r;
	}

	@Override
	public float calculoArea() {
		// TODO Auto-generated method stub
		return 4*PI*r*r;
	}

	@Override
	public float calculoVolumen() {
		// TODO Auto-generated method stub
		return 4*PI*r*r*r/3;
	}

}
