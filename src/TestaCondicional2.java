
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testa condicional");
		System.out.println("");

		int idade = 16;
		int quantidadePessoas = 2;
		boolean acompanhante = quantidadePessoas >= 2;
		
		System.out.println("valor de acompanhante -> " + acompanhante);
		System.out.println("");

		if (idade >= 18 || acompanhante) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Desculpe, mas você não pode entrar.");
		}
	}

}
