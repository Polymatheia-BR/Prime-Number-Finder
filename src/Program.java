
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int z = 0;
		int qtd = 0;
			
		System.out.println("Localizador de Números Primos\n(Prime Number Finder)\nDigite o número de acordo com a opção desejada: ");
		System.out.println("1 - Definir um limite\n2 - Procurar indefinidamente");
		int menu = input.nextInt();
		
		if(menu == 1) {
			System.out.print("Digite um limite: ");
			int limite = input.nextInt();
			
			for(int x = 1;x<=limite;x++) {
				for(int i = 1;i<=x;i++) {
					if(x%i == 0) {
						z++;
					}
				}
				if(z == 2) {
					System.out.println(x);
					qtd++;
					z = 0;
				} else {
					z = 0;
				}
			}
			System.out.println(qtd + "° numeros encontrados.");
		
		}
		
		if(menu == 2) {
			int x = 1;
			while(true) {
				while(true) {
					x++;
					for(int i = 1;i<=x;i++) {
						if(x%i == 0) {
							z++;
						}
					}
					if(z == 2) {
						System.out.println(x);
						z = 0;
					} else {
						z = 0;
					}
				}
			}
		}
		input.close();

	}

}
