package csw.practica4;
import static org.junit.Assert.*;
import org.junit.*;



public class TestJUnitOtherAnnotations {
			
		//declaraci�n de variables
		static float base;
		static float altura;
		static float radio;	
		static float valor1;
		static float valor2;
		static float valor3;		
		static float[] arrayEsperado = new float[4];
		static float[] arrayObtenido;
		
		CalcularArea cuadrado;
		CalcularArea rectangulo;
		CalcularArea triangulo;
		CalcularArea circulo;	
		CalcularArea cuadradoExpected;
		
		@BeforeClass
		public static void asignarValorVariables() {
			
			System.out.println("@BeforeClass para inicializar los valores de las variables necesarias para ejecutar las pruebas \n");	
			
			base = 2;
			altura = 4;
			radio = 8;	
			valor1 = 2;
			valor2 = 4;
			valor3 = 8;				
			arrayObtenido = new float[4];
			arrayEsperado[0]=4;
			arrayEsperado[1]=8;
			arrayEsperado[2]=4;
			arrayEsperado[3]=(float) 201.06;
		}
		
		//declaraci�n de objetos
		@Before
		public void asignarValoresObjetos() {
					
			System.out.println("@Before para inicializar los valores de los objetos antes de la ejecucion de cada @test");	
					
			cuadrado = new CalcularArea(base);
			rectangulo = new CalcularArea(base,altura);
			triangulo = new CalcularArea(base,altura);
			circulo = new CalcularArea(radio);			
			cuadradoExpected = new CalcularArea(base);	
		}
		
		//establecemos el valor de los objetos a null despu�s de todas las pruebas
		@After
		public void eliminarObjetos() {
			
			System.out.println("@After para inicializar el valor de los objetos a null despu�s de la ejecuci�n de cada @test. \n");	
			
			cuadrado = null;
			rectangulo = null;
			triangulo = null;
			circulo = null;				
		}		
		
		@AfterClass
		public static void eliminarValorVariables() {
			
			System.out.println("@AfterClass para inicializar a 0 los valores de las variables que se usaron para ejecutar las pruebas");	
			
			base = 0;
			altura = 0;
			radio = 0;
			valor1 = 0;
			valor2 = 0;
			valor3 = 0;		
			arrayObtenido = null;
			arrayEsperado = null;
		}		
		
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
		 public void testAreaCuadrado2() {
			System.out.println("assertNull");		
			//comprobamos que el valor es nulo				
			 assertNull(cuadrado.areaCuadrado());		 
		 }
			
		@Test
		public void testAreaRectangulo2() {		
			System.out.println("assertSame");			
			//comprobamos si dos objetos est�n referenciados al mismo objeto
			assertSame(cuadradoExpected, cuadrado);		
		 }
		
		@Test
		public void testAreaTriangulo2() {
			System.out.println("assertNotSame");		
			//comprobamos si dos objetos NO est�n referenciados al mismo objeto		
			assertNotSame(cuadrado,rectangulo);
		 }
		
		@Ignore
		public void testArrays() {
			
			System.out.println("assertArrayEquals");			
			
			arrayObtenido[0]=cuadrado.areaCuadrado();
			arrayObtenido[1]=rectangulo.areaRectangulo();
			arrayObtenido[2]=triangulo.areaTriangulo();
			arrayObtenido[3]=circulo.areaCirculo();	
			
			//comprobamos si dos arrays con iguales
			assertArrayEquals(arrayEsperado, arrayObtenido, 0);
		 }
		 
		
}
