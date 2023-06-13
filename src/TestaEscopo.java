
public class TestaEscopo {
	
	public static void main (String[] args) {
		
		
		int idade = 17;
		int quantidadePessoas = 9;
		
		boolean acompanhantes;
		
		if (quantidadePessoas >= 2) {
			acompanhantes = true;
		} else {
			acompanhantes = false;
		}
		
		if (idade >= 18 || acompanhantes) {
			System.out.println("Seja bem-vindo!" + "\n");
		} else {
			System.out.println("Desculpe, mas você não pode entrar!" + "\n");
		}
		
		System.out.println("valor de acompanhantes é -> " + acompanhantes);
	}

}
