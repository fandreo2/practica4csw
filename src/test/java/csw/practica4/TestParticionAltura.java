package csw.practica4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestParticionAltura {
	
	       //declaraci�n de variables	       
			float base = 1;
			float altura = 2;			
			float altura1 = 3;			
			float altura2 = 4;
			float altura3 = 5;
			float altura4 = 6;
			float altura5 = 7;
		
			float valor1 = 1;
			float valor2 = 2;
			float valor3 = 3;
			
		
		
			//declaraci�n de objetos			
			CalcularArea rectangulo = new CalcularArea(base,altura);
			CalcularArea rectangulo1 = new CalcularArea(base,altura1);
			CalcularArea rectangulo2 = new CalcularArea(base,altura2);
			
			CalcularArea triangulo = new CalcularArea(base,altura3);			
			CalcularArea triangulo1 = new CalcularArea(base,altura4);			
			CalcularArea triangulo2 = new CalcularArea(base,altura5);	
					
	       
	       @Test
			public void testAreaRectangulo() {
				System.out.println("areaRectangulo:" + rectangulo.areaRectangulo());				
				//comprobamos que se cumple la condici�n  
				assertTrue(rectangulo.areaRectangulo()==valor2);					
			 }
	       
	       @Test
			public void testAreaRectangulo1() {
				
				System.out.println("areaRectangulo1:" + rectangulo1.areaRectangulo());					
				//comprobamos que se cumple la condici�n  				
				assertTrue(rectangulo1.areaRectangulo()==valor1); 				
			 }
	       
	       @Test
			public void testAreaRectangulo2() {
				
				System.out.println("areaRectangulo2:" + rectangulo2.areaRectangulo());	
				//comprobamos que se cumple la condici�n  				
				assertTrue(rectangulo2.areaRectangulo()==valor3); 	
			 }
			
						
			@Test
			public void testAreaTriangulo() {
				System.out.println("areaTriangulo:" + triangulo.areaTriangulo());				
				 //comprobamos que NO se cumple la condici�n 
				 assertFalse(triangulo.areaTriangulo()==valor1);
				 		
			 }
			
			@Test
			public void testAreaTriangulo1() {
			
				System.out.println("areaTriangulo1:" + triangulo1.areaTriangulo());					
				 //comprobamos que NO se cumple la condici�n 			
				 assertFalse(triangulo1.areaTriangulo()==valor2);		
				
			 }
			
			@Test
			public void testAreaTriangulo2() {
				
				System.out.println("areaTriangulo2:" + triangulo2.areaTriangulo());	
				 //comprobamos que NO se cumple la condici�n 					
				 assertFalse(triangulo2.areaTriangulo()==valor3);		
			 }
		

}
