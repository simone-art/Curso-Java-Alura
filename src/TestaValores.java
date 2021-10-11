
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;

		// quanto vale o segundo?
		//Neste caso a variável no Java, guarda o valor e não a referência

		System.out.println(segundo);
		
		
	}

}
