package com.example.ejb.bussines;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.example.ejb.domain.Esfera;
import com.example.ejb.domain.Geometric;

/**
 * Session Bean implementation class Calculo
 */
@Stateless
@LocalBean
public class Calculo {
	
    /**
     * Default constructor. 
     */
    // public Calculo(float radio){
    public Calculo(){
		System.out.println("Contenedor Cálculo");
		// esfera = new Esfera(radio);
    }

	public float getArea(Geometric geometric){		
		return geometric.calculoArea();		
	}

	public float getVolumen(Geometric geometric){
		return geometric.calculoVolumen();		
	}
    
}
