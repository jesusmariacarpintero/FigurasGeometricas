package com.example.ejb.domain;

public class Cono extends Geometric{
	private static final float PI = 3.1416f;
	private float r;
	private float h;
	
	public Cono(float r, float h) {
		super(Integer. MAX_VALUE, 2);
		// TODO Auto-generated constructor stub
		this.r= r;
		this.h= h;
	}

	@Override
	public float calculoArea() {
		// TODO Auto-generated method stub		
		float g = (float) Math.sqrt(((double)h*(double)h)+((double)r*(double)r));
		return (PI*r*r)+(PI*r*g);
	}

	@Override
	public float calculoVolumen() {
		// TODO Auto-generated method stub
		return PI*r*r*h/3;
	}

}
