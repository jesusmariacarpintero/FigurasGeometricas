package com.example.ejb.test;

import org.junit.Assert;
import org.junit.Test;

// import com.example.ejb.bussines.Calculo;
import com.example.ejb.domain.Cilindro;
import com.example.ejb.domain.Cono;
import com.example.ejb.domain.Cubo;
import com.example.ejb.domain.Esfera;

public class TsetSLessEjbFG {

	// private Calculo calculo cambio;
	
	@Test
	public void testCubo(){
		// Lo esperado
		float expectArea = 24;
		float expectedVolumen = 8;
		
		// Lo devuelto por programa
		Cubo cubo = new Cubo(2);
		
		// Miramos si es cierto
		// ¿Debería ser así
		// Assert.assertEquals(expectArea, calculo.getArea(cubo), 0.1);
		Assert.assertEquals(expectArea, cubo.calculoArea(), 0.1);
		Assert.assertEquals(expectedVolumen, cubo.calculoVolumen(), 0.1);
	}

	@Test
	public void testEsfera(){
		// Lo esperado
		float expectArea = (float) 12.56;
		float expectedVolumen = 4.18f;
		
		// Lo devuelto por programa
		Esfera esfera = new Esfera(1);
		
		// Miramos si es cierto
		Assert.assertEquals(expectArea, esfera.calculoArea(), 0.1);
		Assert.assertEquals(expectedVolumen, esfera.calculoVolumen(), 0.1);
	}

	@Test
	public void testCilindro(){
		// Lo esperado
		float expectArea = (float) 131.94;
		float expectedVolumen = 113f;
		
		// Lo devuelto por programa
		Cilindro cilindro = new Cilindro(3, 4);
		
		// Miramos si es cierto
		Assert.assertEquals(expectArea, cilindro.calculoArea(), 0.1);
		Assert.assertEquals(expectedVolumen, cilindro.calculoVolumen(), 0.1);
	}

	@Test
	public void testCono(){
		// Lo esperado
		float expectArea = (float) 201.22;
		float expectedVolumen = 157.08f;
		
		// Lo devuelto por programa
		Cono cono = new Cono(5, 6);
		
		// Miramos si es cierto
		Assert.assertEquals(expectArea, cono.calculoArea(), 0.1);
		Assert.assertEquals(expectedVolumen, cono.calculoVolumen(), 0.1);
	}
}
