import java.util.Scanner;

public class aumentoSalario {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double salario1;
		double salario2;
		double salario3;
		
		System.out.println("Digite o primeiro sal�rio:");
		salario1 = leitor.nextDouble();
		System.out.println("Digite o segundo sal�rio:");
		salario2 = leitor.nextDouble();
		System.out.println("Digite o terceiro sal�rio:");
		salario3 = leitor.nextDouble();
		
		System.out.println("------------");
		
		if (salario1 < 2000) {
			System.out.println("O novo sal�rio ser� " + salario1 * 1.1 + " reais.");
			}
		else if ((salario1 >= 2000 ) & (salario1 <= 5000)) {
			System.out.println("O novo sal�rio ser� " + salario1 * 1.07 + " reais.");
		}
		else {
			System.out.println("O novo sal�rio ser� " + salario1 * 1.05 + " reais.");
		}
		
		System.out.println("------------");
		
		if (salario2 < 2000) {
			System.out.println("O novo sal�rio ser� " + salario2 * 1.1 + " reais.");
			}
		else if ((salario2 > 2000 ) & (salario2 < 5000)) {
			System.out.println("O novo sal�rio ser� " + salario2 * 1.07 + " reais.");
		}
		else {
			System.out.println("O novo sal�rio ser� " + salario2 * 1.05 + " reais.");
		}
		
		System.out.println("------------");
		
		
		if (salario3 < 2000) {
			System.out.println("O novo sal�rio ser� " + salario3 * 1.1 + " reais.");
			}
		else if ((salario3 > 2000 ) & (salario3 < 5000)) {
			System.out.println("O novo sal�rio ser� " + salario3 * 1.07 + " reais.");
		}
		else {
			System.out.println("O novo sal�rio ser� " + salario3 * 1.05 + " reais.");
		}
}
}
		
