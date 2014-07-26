import java.util.Scanner;

/*
 * Sample Input #00
	4
	5
	6
	7
	8
	Sample Output #00
	
	6
	9
	12
	16
 */

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nTests = sc.nextInt();
		for(int i = 0; i < nTests; i++){
			long k = sc.nextInt();
			long sum = 2;
			long cont = 0;
			long constante = 2;
			for(int j = 2; j < k-1; j++){
				cont++;
				sum += constante;
				if(cont == 2){
					constante++;
					cont = 0;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
