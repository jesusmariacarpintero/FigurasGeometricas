package com.example.ejb.domain;

public class ParceToFloat {
	public static Float parceToFloat(String strAltura){
		Float altura = null; 
		
		try{
			altura = Float.valueOf(strAltura);
		}catch(RuntimeException e){
			 e.printStackTrace(); 
		}
		return altura; 
	}
}
