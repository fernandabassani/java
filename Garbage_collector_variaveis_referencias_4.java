public class Garbage_collector_variaveis_referencias_4 {
	public static void main(String [] args) {
		// Variavel  primitiva
		int x = 7;
		x = 9;   // A primitiva deixa de valer 7 e passa a valer 9.
		
		//Variavel de referencia
		String y = "XTI"; // A referencia XTI ela é (jogada fora) - e se chama (garbage collector)
		y = "xti.com.br"; // caso nao queira nenhuma das referencias entao considera a null.
		y = null; // null = inexistente, leva a nada.
	
		System.out.println(x);
		System.out.println(y);
	}
}