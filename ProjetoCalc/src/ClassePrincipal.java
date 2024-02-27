import java.util.Scanner;
public class ClassePrincipal {

	public static void main(String[] args) {
		// AULA PARA APENAS MOSTRAR FUNÇOES DO GITHUB E GIT
		while (true){
			System.out.println("Informe a calculadora:");
			Scanner sc = new Scanner(System.in);
			int numero = sc.nextInt();
			
			System.out.println("Informe a calculadora:");
			Scanner sd = new Scanner(System.in);
			int number = sd.nextInt();
			
			for(int i=0; i<=10; i++){
				
				System.out.printf(numero + " * " + i + " = ");
				System.out.println(numero * i);
			}
			
			
			for(int i=0; i<=10; i++){
				
				System.out.printf(number + " * " + i + " = ");
				System.out.println(number * i);
			}
			
			break;
		}
	}
	
}
