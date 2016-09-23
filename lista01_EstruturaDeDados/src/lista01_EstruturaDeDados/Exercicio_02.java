package lista01_EstruturaDeDados;

public class Exercicio_02 {

	public static void main(String[] args) {
 
		//Exercico 02
		for (int i = 2; i < 100; i++) {
			boolean primo = true;
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				System.out.println(i);
			}
		}

	}
}
