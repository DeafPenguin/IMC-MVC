package rest;
 
 import java.util.Date;
 
 public class Calculo {
 
	private float peso;
	private float altura;
 	private String resultado;
 	private String dataDeProcessamento;

 	public float getPeso() {
 		return peso;
 	}
 
 	public void setPeso(int peso) {
 		this.peso = peso;
 	}
 	
 	public float getAltura() {
 		return altura;
 	}
 
 	public void setAltura(int altura) {
 		this.altura = altura;
 	}
 	
 	public String getResultado() {
 		return resultado;
 	}
 
 	public void setResultado(String resultado) {
 		this.resultado = resultado;
 	}
 
 	public String getDataDeProcessamento() {
 		return dataDeProcessamento;
 	}
 
 	public void setDataDeProcessamento(String dataDeProcessamento) {
 		this.dataDeProcessamento = dataDeProcessamento;
 	}
 
 	public Calculo() {
 	}
 
 	public Calculo(float peso, float altura) {
 		this.peso = peso;
 		this.altura = altura;
 	}
 
 	public void calcular() {
 		float quadrado = altura * altura;
 		float calculo = peso/quadrado;
 		if(calculo < 18.5){setResultado("Você está magro com esse indice");}
		else if(calculo>=18.5 && calculo<25){setResultado("Você está normal com esse indice");}
		else if(calculo>=25 && calculo<30){setResultado("Você está com sobrepeso com esse indice");}
		else if(calculo>=30 && calculo<40){setResultado("Você está com obesidade com esse indice");}
		else if (calculo>40){setResultado("Você está com obesidade grave com esse indice");} 		
 		setDataDeProcessamento(new Date().toString());
 	}
 
 }