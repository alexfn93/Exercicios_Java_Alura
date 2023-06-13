
public class MeusTestes {
	
	public static void main (String[] args) {
		
		int idade = 68;
		boolean ehIdoso = idade >= 65;
		
		System.out.println(ehIdoso);
		
		int contador = 0;
		
		while (contador <= 10) {
			contador++;
		}
		
		System.out.println(contador);
		
		int total = 0;
		
		for (int i = 0; i <= 10; i++) {
			total = total + i;
		}
		
		System.out.println(total);
	}

}
