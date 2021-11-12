
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int z = 0;
		System.out.println("Digite um limite: ");
		int limite = input.nextInt();
		
		for(int x = 1;x<=limite;x++) {
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
		input.close();

	}

}
