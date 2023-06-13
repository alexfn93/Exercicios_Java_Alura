
public class TesteIR {

	public static void main(String[] args) {

		double salario = 200000.00;

		if (salario >= 2112.01 && salario <= 2826.65) {
			salario = salario - (salario * 0.075);
			System.out.println("O IR é de 7,5%. Seu salário será de: " + salario);
			
		} else if (salario >= 2826.66 && salario < 3751.05) {
			salario = salario - (salario * 0.15);
			System.out.println("O IR é de 15%. Seu salário será de: " + salario);
			
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			salario = salario - (salario * 0.225);
			System.out.println("O IR é de 22.5%. Seu salário será de: " + salario);
			
		} else if (salario > 4664.68) {
			salario = salario - (salario * 0.275);
			System.out.println("O IR é de 27.5%. Seu salário será de: " + salario);
			
		} else {
			System.out.println("Este salário está isento de IR.");
		}
	}
}
