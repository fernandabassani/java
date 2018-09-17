import java.util.Scanner;
public class Entrada_de_Dados_Com_Scanner_7 {
	
	public static void main(String [] args) {
		//chamada do programa
		//System.out.println(args[0]);
		// interagindo com o usuario
		
		Scanner s = new Scanner(System.in);// in significa entrada e out significa a saida	
		System.out.println("Qual o seu nome?");
		String nome= s.nextLine();
		System.out.println("Bem vindo " + nome);
	}
}
