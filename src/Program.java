
public class Program {

	public static void main(String[] args) {
		int z = 0;
		
		for(int x = 1;x<=100;x++) {
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
