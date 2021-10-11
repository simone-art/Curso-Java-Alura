
public class TestaConversao {
	
	public static void main (String[] args) {
		double salario = 1500.50;
		//Com o parêntesis, está tentando fazer um cast,
		//que obriga o Java a forzar e converter a variável no tipo int neste caso
		
		int valor = (int) salario;
		System.out.println(valor);
	}

}
