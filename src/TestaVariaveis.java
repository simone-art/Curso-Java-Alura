
public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.println("Ol� novo teste");
		
		//Definindo uma vari�vel do tipo inteiro
		//O Java � uma linguagem fortemente tipada e n�o aceita uma vari�vel sem definir antes o tipo dela
		int idade;
		idade = 37;
		System.out.println(idade);
		
		idade = 30 + 10;
		System.out.println(idade);
		
		idade = (7 * 5) + 2;
		System.out.println(idade);
		// O + neste caso serve pra concatenar mensagens
		System.out.println("A idade �: " + idade);
	}

}
