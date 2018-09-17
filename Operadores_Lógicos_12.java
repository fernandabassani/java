
public class Operadores_Lógicos_12 {
	public static void main(String[] args) {
		
		int x = 6;
		//System.out.println((x >= 1) && (x <=10));// x está dentro de 1 e 10? sim,então é true, 
												// e se x tiver fora de 1 e 10 é retornara false.
		
		//System.out.println((x <= 1) || (x <=5));// se for negativo ele é false.
		//System.out.println((x >= 1) || (x <=5)); // Se for positivo ele é true
		
		System.out.println(!(x >= 1)); //x é menor ou igual a 1 ? nao, mas ele inverte para not e dizerá que é false.
	}
}

/*
 * &&  -> AND (e)
 * ||  -> OR  (ou)
 * !   -> NOT (não) 
 */
