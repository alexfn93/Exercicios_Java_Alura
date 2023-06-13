
public class TestaCondicional {
	
	public static void main (String[] args) {
		
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 0;
		
		if (idade >= 18) {
			System.out.println("Você pode entrar");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, pois está acompanhado.");
			} else {
				System.out.println("infelizmente você não pode entrar.");
			}
		}
	}

}
