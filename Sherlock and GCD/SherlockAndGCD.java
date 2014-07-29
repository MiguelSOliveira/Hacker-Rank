import java.util.Scanner;

public class SherlockAndGCD {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int nCases = sc.nextInt();
		while(nCases-- > 0){
			String[] arrayNumber = new String[sc.nextInt()];
			sc.nextLine();
			System.out.println(answer(arrayNumber));
		}
		sc.close();
	}
	
	static int findGCD(int n1, int n2){
		if(n2 == 0)
			return n1;
		else return findGCD(n2, n1 % n2);
	}

	static String answer(String[] arrayNumber){
		int gcd = 0;
		arrayNumber = sc.nextLine().split(" ");
		for(int i = 0; i < arrayNumber.length; i++){
			for(int j = 0; j < arrayNumber.length; j++){
				if(i != j && i < j){
					gcd = findGCD(Integer.parseInt(arrayNumber[i]), Integer.parseInt(arrayNumber[j]));
					if(gcd == 1){
						return "YES";
					}
				}
			}
		}
		return "NO";
	}
	

}
