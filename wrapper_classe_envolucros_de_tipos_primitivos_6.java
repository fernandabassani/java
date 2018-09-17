
public class wrapper_classe_envolucros_de_tipos_primitivos_6 {
	
	public static void main(String [] args) {
		
		@SuppressWarnings("deprecation")
		Double preco = new Double("12.45"); 
		double d = preco.doubleValue();    // doublevalue - esta recuperando o valor desse preco   
		int i = preco.intValue();			 // int, float ... e assim por diante converte esse valor preco
		byte b = preco.byteValue();			// converte o valor do tipo byte... e assim por diante
		@SuppressWarnings("deprecation")
		Boolean casada = new Boolean("true");
		
		System.out.println(preco);
		System.out.println(casada);
		
		// Conversao estática  
		
		double d1 = Double.parseDouble("123.45"); // conversao do tipo string . Eventualmente o tipo string passa o valor
		int il = Integer.parseInt("123");		// a converter do tipo inteiro     || do tipo inteiro, float...
		float fl = Float.parseFloat("3.14F");	
		System.out.println(d1);
		System.out.println(il);
		System.out.println(fl);
		
		int i2 = Integer.valueOf("101011", 2);	  // converter um valor binario no numero inteiro
		System.out.println(i2);
	
	}
}

//Classes WRAPPER PRIMITIVAS:
//Integer, Byte, Short, Long, Float, Double, Character(representa char),
//Void, Boolean
