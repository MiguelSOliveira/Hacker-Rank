import java.util.Scanner;
/*
 *  5 3
 *	1 2 100
 *	2 5 100
 *	3 4 100
 */

public class FillingJars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nJars = sc.nextInt();
		int nOperations = sc.nextInt();
		long total = 0;
		for(int i = 0; i < nOperations; i++){
			int startIndex = sc.nextInt();
			int endIndex = sc.nextInt();
			long value = sc.nextInt();
			total += value * (endIndex - startIndex + 1);
		}
		System.out.println(total / nJars);
		sc.close();
	}
}
