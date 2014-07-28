import java.util.Scanner;

/*
 * 3
 *	10 2 5
 *	12 4 4
 *	6 2 2
 */


public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nTests = sc.nextInt();
		for(int i = 0; i < nTests; i++){
			int chocolates = sc.nextInt();
			int costChoc = sc.nextInt();
			int wrappers = sc.nextInt();
			int answer = chocolates / costChoc;
			int total = chocolates / costChoc;
			while(answer >= wrappers){
				int extra = answer / wrappers;
				answer = extra + (answer % wrappers);
			    total += extra;
			}
			System.out.println(total);
		}
	}

}
