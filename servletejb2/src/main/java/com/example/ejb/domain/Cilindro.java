package com.example.ejb.domain;

public class Cilindro extends Geometric{
	private static final float PI = 3.1416f;
	private float r;
	private float h;
	
	public Cilindro(float r, float h) {
		super(Integer. MAX_VALUE, 3);
		// TODO Auto-generated constructor stub
		this.r= r;
		this.h= h;
	}

	@Override
	public float calculoArea() {
		// TODO Auto-generated method stub
		return 2*PI*r*(h + r);
	}

	@Override
	public float calculoVolumen() {
		// TODO Auto-generated method stub
		return PI*r*r*h;
	}

}
