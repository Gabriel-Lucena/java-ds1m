import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {

		int contador;
		int limite;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite seu n�mero inicial:");
		contador = reader.nextInt();
		System.out.println("Digite o limite:");
		limite = reader.nextInt();
		
		while (contador <= limite)  {
			
			if (contador % 2 == 1) {
				System.out.println("O n�mero " + contador + " � �mpar.");
			} else {
				
				System.out.println("O n�mero " + contador + " � par.");
			}
			
			contador = contador  + 1;
			
		}
		
		System.out.print("O Looping acabou!!!");

	}

}
