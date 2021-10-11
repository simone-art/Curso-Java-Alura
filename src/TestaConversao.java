
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1500.50;
		// Com o par�ntesis, est� tentando fazer um cast,
		// que obriga o Java a forzar e converter a vari�vel no tipo int neste caso

		int valor = (int) salario;
		System.out.println(valor);

		// Valor de n�mero longo
		//Deve ser colocado o l min�scula ou mai�scula para o java entender que 
		// � um n�mero grande

		long numero = 343434343434l;
		long numeroFinal = 343434343434L;
		short valorPequeno = 2131;
		byte valorMaisPequeno = 127;
		float pontoFlutuante = 3.14f;
		
		
		System.out.println(numero);
		System.out.println(numeroFinal);
		System.out.println(valorPequeno);
		System.out.println(valorMaisPequeno);
		System.out.println(pontoFlutuante);
	}
}


