package com.example.ejb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.ejb.bussines.Calculo;
import com.example.ejb.domain.Cilindro;
import com.example.ejb.domain.Cono;
import com.example.ejb.domain.Cubo;
import com.example.ejb.domain.Esfera;
import com.example.ejb.domain.ParceToFloat;

// import com.example.ejb.bussines.Greeting;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletSLessEjbFG")
public class ServletSLessEjbFG extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      @EJB
	  private Calculo calculo;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSLessEjbFG() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Valida parametros
		Float arista = ParceToFloat.parceToFloat(request.getParameter("arista"));
		Float radio_esfera = ParceToFloat.parceToFloat(request.getParameter("radio_esfera")); 
		Float radio_cilindro = ParceToFloat.parceToFloat(request.getParameter("radio_cilindro"));  
		Float altura_cilindro = ParceToFloat.parceToFloat(request.getParameter("altura_cilindro")); 
		Float radio_cono = ParceToFloat.parceToFloat(request.getParameter("radio_cono"));  
		Float altura_cono = ParceToFloat.parceToFloat(request.getParameter("altura_cono"));
		String result = null;
		String addResult = null;
		float area;
		float volumen;	

		// Poner un método en la clase Calculo.java para que todo el negocio esté allí
		if (arista!=null) {
			Cubo cubo = new Cubo(arista);
			area = calculo.getArea(cubo);
			volumen = calculo.getVolumen(cubo); 
			result = "<h3>Para el Cubo de "+ cubo.getLados() + " lados, " + cubo.getCaras() + " caras  y una arista de " + arista +
			         " cm. su Área es de: " + area + " cm. al cuadrado y su Volumen es de: " + volumen + " cm. al cubo.</h3>";
		}
		
		if (radio_esfera!=null) {
			Esfera esfera = new Esfera(radio_esfera);
			area = calculo.getArea(esfera);
			volumen = calculo.getVolumen(esfera); 
			addResult = "<h3>Para la Esfera de "+ esfera.getLados() + " lados, " + esfera.getCaras() + " caras y con un radio de " + 
			            radio_esfera + " cm. su Área es de: " + area + " cm. al cuadrado y su Volumen es de: " + volumen + " cm. al cubo.</h3>";
			if (result == null) {
				result = addResult;					
			}else{
				result += addResult;					
			}				
		}		

		if (radio_cilindro!=null && altura_cilindro!= null) {
			Cilindro cilindro =  new Cilindro(radio_cilindro, altura_cilindro);
			area = calculo.getArea(cilindro);
			volumen = calculo.getVolumen(cilindro);
			addResult = "<h3>Para el Cilindro de "+ cilindro.getLados() + " lados, " + cilindro.getCaras() + " caras, de " + altura_cilindro + 
					    " cm. de altura y con un radio de " + radio_cilindro + " cm. su Área es de: " + area + 
					    " cm. al cuadrado y su Volumen es de: " + volumen + " cm. al cubo.</h3>";
			if (result == null) {
				result = addResult;					
			}else{
				result += addResult;					
			}				
		}
		
		if (radio_cono!=null && altura_cono!= null) {
			Cono cono =  new Cono(radio_cono, altura_cono);
			area = calculo.getArea(cono);
			volumen = calculo.getVolumen(cono);
			addResult = "<h3>Para el Cono de "+ cono.getLados() + " lados, " + cono.getCaras() + " caras, una altura de " + altura_cono +
			            " y con un radio de " + radio_cono + " cm. su Área es de: " + area + 
			            " cm. al cuadrado y su Volumen es de: " + volumen + " cm. al cubo.</h3>";
			if (result == null) {
				result = addResult;					
			}else{
				result += addResult;					
			}				
		}
		
		if (result == null) {
			result = "<h3> Error con los parametros </h3>";
		}
		
	    //presentacion 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();  
		
		out.println("<html>"); 
		out.println("<head>");
		out.println("<title>CALCULO</title>");
		out.println("</head>");
		
		out.println("<body>");
		    out.println("<h1> CALCULO </h1>");
		    //TODO mejor usar append
			out.println(result);
		
			out.println("<p><a href='../formulario.html'>Retornar</a></p>"); 
			out.println("</body>");
		
		out.println("</html>"); 
			
	}

}
