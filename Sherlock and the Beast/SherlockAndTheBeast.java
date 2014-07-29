import java.util.Scanner;


/*
 * Sample Input
	
	4
	1
	3
	5
	11
	Sample Output
	
	-1
	555
	33333
	55555533333
 */


public class SherlockAndTheBeast {

	static String sherlock(int n){
		int digits = n;
		int fives = 0;
		int threes = 0;
		
		while(digits > 0){
			if(digits % 3 == 0){
				fives = digits;
				break;
			}
		digits -= 5;
		}
		threes = n - digits;
		if(threes % 5 != 0 || digits < 0)
			return "-1";
		StringBuilder answer = new StringBuilder();
		while(fives-- > 0)
			answer.append(5);
		while(threes-- > 0)
			answer.append(3);
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nCases = sc.nextInt();
		for(int i = 0; i < nCases; i++){
			int n = sc.nextInt();
			System.out.println(sherlock(n));
		}
		sc.close();
	}
}
