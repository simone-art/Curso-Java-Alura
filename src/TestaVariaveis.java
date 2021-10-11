
public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.println("Olá novo teste");
		
		//Definindo uma variável do tipo inteiro
		//O Java é uma linguagem fortemente tipada e não aceita uma variável sem definir antes o tipo dela
		int idade;
		idade = 37;
		System.out.println(idade);
		
		idade = 30 + 10;
		System.out.println(idade);
		
		idade = (7 * 5) + 2;
		System.out.println(idade);
		// O + neste caso serve pra concatenar mensagens
		System.out.println("A idade é: " + idade);
	}

}
