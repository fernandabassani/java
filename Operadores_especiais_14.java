//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Operadores_especiais_14 {


	public static void main(String[] args) {
		
		//int idade = 26;
		//String x = (idade >= 18) ? "Maior de idade" : "Menor de Idade";
		//System.out.println(x);
								/* A variavel idade é de 26;
								 * é do tipo String x e vai chamar o metodo idade e se for maior ou igual 
								 * que 18 , ela vai retornar maior ou menor de idade. 
								 * ? : -> esse é operador tenário
								 */
		//String sexo = "F" , pais = "Brasil";
		
		//Scanner s = new Scanner (System.in);
		//System.out.println("Informe o Raio");
		//double raio = s.nextDouble();
		
		//double raio = 10;
		//raio.toString();
		//String i2 = Double.toString();
		//this.value = value;
		//String i1 = "101010101";
		//double raio = Double.parseDouble(i1);
		
		String resultadoRaio = JOptionPane.showInputDialog("Digite o raio");
		
		
		//Diâmetro : 2r
		//double raio = 10;
		double raio = Double.parseDouble(resultadoRaio);
		double diametro = 2 * raio;
		System.out.println ("Diametro="+diametro);
		
		//Circunferencia : 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("circunferencia="+circunferencia);  
		
		//Area de um circulo --> PI r2
		
		double area = pi * (raio * raio);
		System.out.println("area="+area);
		
		
		
		
		
		
		
		
		
	}
}

/*
 * OPERADORES DE BITS (BITWISE)
 * 
 * &		|		^		~		<<=		// não necessario ainda estudar isso, só irá estudar Oper.Espec.
 * &=		|=		^|		>>=		>>>=
 * 
 * OPERADORES ESPECIAIS
 * 
 * ?:		Operador Ternário
 * ,		Separação de Expressoes
 * ()		Chamada de Método
 * (cast)	Coerção Unária
 * 
 * DIAMETRO E AREA DE CIRCULO
 * 
 * 
 * */
