import javax.swing.JOptionPane;
/*
 * Calculo IMC:
 *IMC = pesoEmQuilogramas / (alturarEmMetros * alturaEmMetro)
 */
public class Desafio_calculo_IMC_15 {
	public static void main(String[] args) {
		 String peso = JOptionPane.showInputDialog("Qual o seu peso Quilograma?");
		 String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
		 
		 
		 double pesoEmQuilogramas = Double.parseDouble(peso);
		 double alturaEmMetros = Double.parseDouble(altura);
		 //double pesooEmQuilogramas = 70;
		// double alturarEmMetros = 1.76;
		 double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Peso não ideal";
		msg = "IMC = " + imc + "\n" + msg;	
		
		JOptionPane.showMessageDialog(null, msg); 
		System.out.println("IMC = " + imc);
		System.out.println(msg);
	}
}


/*		CALCULO DO IMC INDICE DE MASSA CORPORAL
 * 	IMC		=	PESO / (ALTURA)2
 * 
 * < 20		:	Abaixo do Peso
 * 20-25	:	Peso Ideal
 * 25-30	:	Sobrepeso
 * 30-35	:	Obesidade Moderada
 * 35-40	:	Obesidade Severa
 * 40-40	:	Obesidade Mórbita
 * > 50		:	Super-Obesidade
 */