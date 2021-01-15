package csw.practica4;

public class CalcularArea {
	
	//valor lo usamos para base y radio
	float valor;
	float altura;	
	
	//constructor para cuadrada y circulo
	public CalcularArea(float valor) {
		super();
		this.valor = valor;
		
	}
	
	//constructor para rectanguloy triangulo	
	public CalcularArea(float valor, float altura) {
		super();
		this.valor = valor;
		this.altura = altura;	
	}		

	public float areaCuadrado() {
	 	  
		 return (float) (Math.pow(valor, 2));	 
	 }
	
	public float areaRectangulo() {
		 
		 return (valor*altura);	 
	 }
	 
	 public float areaTriangulo() {	 
		 
		 return ((valor*altura)/2);	 
	 }
	 
	 public float areaCirculo() { 
		 
		 return (float) ( Math.PI*(Math.pow(valor,2)));
	 }
	 
 
}
