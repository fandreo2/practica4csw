package csw.practica4;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestJUnit {
	
	//declaraci�n de variables
	float base = 2;
	float altura = 4;
	float radio = 8;	
	float valor1 = 2;
	float valor2 = 4;
	float valor3 = 8;		
	float[] arrayEsperado = {4,8,4,(float) 201.06};
	float[] arrayObtenido = new float[4];
	
	//declaraci�n de objetos
	CalcularArea cuadrado = new CalcularArea(base);
	CalcularArea rectangulo = new CalcularArea(base,altura);
	CalcularArea triangulo = new CalcularArea(base,altura);
	CalcularArea circulo = new CalcularArea(radio);			
	CalcularArea cuadradoExpected = new CalcularArea(base);
	
	@Test
	public void testAreaCuadrado() {		 
		
		//correcto 
		System.out.println("areaCuadrado:" + cuadrado.areaCuadrado());		
		//comprobamos si dos valores son iguales		
		cuadrado.areaCuadrado();
		assertEquals(valor2,cuadrado.areaCuadrado(), 0);
	 }	
	
	@Test
	public void testAreaRectangulo() {
		
		//error
		System.out.println("areaRectangulo:" + rectangulo.areaRectangulo());		
		//comprobamos que se cumple la condici�n  
		assertTrue(rectangulo.areaRectangulo()==valor2); 		
	 }
	
	@Test
	public void testAreaTriangulo() {
		
		//correcto
		System.out.println("areaTriangulo:" + triangulo.areaTriangulo());		
		 //comprobamos que NO se cumple la condici�n 
		 assertFalse(triangulo.areaTriangulo()==valor1);		 
	 }
	
	@Test
	 public void testAreaCirculo() {
		
		//correcto
		 System.out.println("areaCirculo:" + String.format("%.2f",circulo.areaCirculo()));		
		//comprobamos que el valor no es nulo 			
		 assertNotNull(circulo.areaCirculo());		 
	 }
	
	@Test
	 public void testAreaCuadrado2() {
		//correcto
		//comprobamos que el valor es nulo				
		 assertNull(cuadrado.areaCuadrado());		 
	 }
		
	@Test
	public void testAreaRectangulo2() {		
		
		//error
		//comprobamos si dos objetos est�n referenciados al mismo objeto
		assertSame(cuadradoExpected, cuadrado);		
	 }
	
	@Test
	public void testAreaTriangulo2() {
		
		//correcto
		//comprobamos si dos objetos NO est�n referenciados al mismo objeto		
		assertNotSame(cuadrado,rectangulo);
	 }
	
	@Test
	public void testArrays() {
		
		arrayObtenido[0]=cuadrado.areaCuadrado();
		arrayObtenido[1]=rectangulo.areaRectangulo();
		arrayObtenido[2]=triangulo.areaTriangulo();
		arrayObtenido[3]=circulo.areaCirculo();	
		
		//error
		//comprobamos si dos arrays con iguales
		assertArrayEquals(arrayEsperado, arrayObtenido, 0);
	 }
		
	
	
	

}
