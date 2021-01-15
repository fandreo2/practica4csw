package csw.practica4;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestParticionValor {
	
	//declaraci�n de variables
		float base = 1;
		float base1 = 2;
		float base2 = 3;		
		float radio = 4;		
		float radio1 = 5;		
		float altura = 6;			
		float valor1 = 2;
		float valor2 = 4;
	
				
		//declaraci�n de objetos
		CalcularArea cuadrado = new CalcularArea(base);		
		CalcularArea rectangulo = new CalcularArea(base1,altura);		
		CalcularArea triangulo = new CalcularArea(base2,altura);
		CalcularArea circulo = new CalcularArea(radio);
		CalcularArea circulo1 = new CalcularArea(radio1);
		
		@Test
		public void testAreaCuadrado() {		 
			
			System.out.println("areaCuadrado:" + cuadrado.areaCuadrado());		
			//comprobamos si dos valores son iguales		
			cuadrado.areaCuadrado();
			assertEquals(valor2,cuadrado.areaCuadrado(), 0);
		 }
		
		@Test
		public void testAreaRectangulo() {
			System.out.println("areaRectangulo:" + rectangulo.areaRectangulo());		
			//comprobamos que se cumple la condici�n  
			assertTrue(rectangulo.areaRectangulo()==valor2); 		
		 }		
		
		@Test
		public void testAreaTriangulo() {
			System.out.println("areaTriangulo:" + triangulo.areaTriangulo());		
			 //comprobamos que NO se cumple la condici�n 
			 assertFalse(triangulo.areaTriangulo()==valor1);		 
		 }
		
		@Test
		 public void testAreaCirculo() {
			 System.out.println("areaCirculo:" + String.format("%.2f",circulo.areaCirculo()));		
			//comprobamos que el valor no es nulo 			
			 assertNotNull(circulo.areaCirculo());		 
		 }

		@Test
		 public void testAreaCirculo1() {
			 System.out.println("areaCirculo1:" + String.format("%.2f",circulo1.areaCirculo()));		
			//comprobamos que el valor no es nulo 			
			 assertNotNull(circulo1.areaCirculo());		 
		 }
		
	

}
