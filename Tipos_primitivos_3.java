/**
 * Apresentar os conceitos de Variavel
 * @author fernanda b.b.s
 */
public class Tipos_primitivos_3 {
	public static void main (String [] args){
		/*Tipos e tamanhos:
		 *int, byte, short, long, float, double, char, void, boolean.
		 *
		 **/
//	int idade = 21; // Um valor sem fracao.
//	double preco = 12.45; // Um numero fracionado.
//	char sexo = 'M'; // representa apenas uma letra.   (UNICODE)
//	boolean solteira = true; // apenas verdadeiro ou falso = true ou false.	
	
/*	
* TAMANHO:
* byte b = 127; //até cem
*	short s = 32768; // 32 mil
*	int i = 2_000_000_000; //2 bilhoes
*	long l = 9_000_000_000_000_000_000; // 9 quintilhoes
*	double d = 1,7976931348623157E+308; // aceita fraçoes  (IEEE 754)
*	Float f = 123F;
*	
*	i = s; // Cast Implícito
*	System.out.println(s);
*	System.out.println(i);
*
*	i = (int) l; //Cast Explicito
*	System.out.println(l);
*	System.out.println(i);    --> quebrou o valor
*
	forma binaria: */
	byte bb = 0b01010101; // 8 bits ou 1 bytes informação
	short ss = 0b0101010101010101; // 16 bits ou 2 bytes
	int ii = 0b01010101010101010101010101010101; // 32bits ou 4 bytes
	
	System.out.println(bb);
	System.out.println(ss);
	System.out.println(ii);
	
	 /*primitive type:
	  * char = 16 bit
	  *  byte = 8 bit
	  *  short = 16 bit
	  *  int = 32 bit
	  *  long = 64 bit
	  *  float = 32 bit
	  *  double = 64 bit
	  *  boolean = 1 bit
	  *  void = ----
	  *   */
	}
}
