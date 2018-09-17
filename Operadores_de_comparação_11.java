
public class Operadores_de_comparação_11 {
	public static void main(String[] args) {
		
		//int a = 6;
		Integer a = 6;     //Integer é uma classe wrapper
		
		//System.out.println(a == 6); Se esse valor é 6 vai ser true, pois o operador retornar o valor dele mesmo.
		
		//System.out.println(a != 4); //! -> complemento logico, que ajuda tambem comparar o tipo boolean.
									 // se for valor 6, ele é false.. os demais numeros menor ou maior é true.
		
		//System.out.println(a > 7); // 6 é maior que 7? Não, então retornara false... 
									//e se for maior que 5 é true.
		
		//System.out.println(a >= 7); // "a" é maior q 7? false; e se "a" for maior que 5 ou 6? true.
		//System.out.println(a <= 5); // 6 é menor ou igual que 5? false. 6 é menor que 7? true
		
		//System.out.println(a instanceof Integer);  // compara os tipos de dados , compara somento objetos... tipos primitivos não compara.
		System.out.println("oi" instanceof String); // pode verificar se esse objeto é uma String.
		
	}
}

/*
 == -> Igual
 != -> Diferente
 >	Maior
 <	Menor
 >= Maior ou Igual
 <= Menor ou Igual
 
 Instanceof -> Compara Tipos
 */
