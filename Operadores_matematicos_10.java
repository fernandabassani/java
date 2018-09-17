
public class Operadores_matematicos_10 {
	public static void main(String [] args) {
		
		double a = 7 + 3;		// Adição
		System.out.println(a);
		String aa = "Oi" + " Programador Java";	 // Duas Strings concaternada
		System.out.println(aa);
		
		double b = 7 - 3;		//	Subtração
		System.out.println(b);
		
		double c = 7 * 3;		//	Multiplicação
		System.out.println(c);
		
		double d = 7 / 3;		// Divisão
		System.out.println(d);
		
		double e = 16 % 6;		// Módulo , retorna o resto da divisao de dois numeros
		System.out.println(e);	// 7/3=2*3=6-7= 1 modulo par
		double ee = 4 % 2;		// 4/2=2*2=4-4= 0 modulo impar
		System.out.println(ee);
		
		double f =	+3;    		 // unario, numero positivo
		System.out.println(f);
		double ff = -4;
		System.out.println(ff);	 // unario, numero negativo
		double fff = -(+5);		// (-).(+)=(-); (-).(-)=(+); (+).(-)=(-); (+).(+)=(+).
		System.out.println(fff);
		
		int g = 7;
		int gg = g++; // (int i = "h++;" ->  pós incremento)
		System.out.println("g=" + g);
		System.out.println("gg=" + gg);
		int h = 6; 
		int i = ++h; // ++h -> pré-incremento    
		System.out.println("h=" + h);
		System.out.println("i=" + i);
		
		int j = 9;
		int jj = --j;    // "--j" -> pré-decremento
		System.out.println(j);
		System.out.println(jj);
		int k = 2;
		int l = k--;    // "--j" -> pós-decremento ,isso seria a mesma operaçao de k = k - 1;
		System.out.println(k);
		System.out.println(l);
		
	}
}

/*  ---- Operadores matematicos ---- 
 *  +	->	Adição
 * 	-	->	Subtração
 * 	*	->	Multiplicação
 * 	/	->	Divisão
 * 	%	->	Módulo
 * 	+	->	Positivo
 * 	-	->	Negativo
 * 	++	->	Incremento +1
 * 	--	->	Decremento -1
 * 
 * 
 * 
 * 
 * */
