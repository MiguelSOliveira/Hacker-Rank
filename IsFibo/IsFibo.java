import java.util.Scanner;


public class IsFibo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nNumbers = sc.nextInt();
		long[] fibSequence = {1,1,1};
		while(nNumbers-- > 0){
			long number = sc.nextLong();
			if(number < fibSequence[2]){
				fibSequence[0] = 1;
				fibSequence[1] = 1;
				fibSequence[2] = 1;
			}
			while(fibSequence[2] < number){
				fibSequence[2] = fibSequence[0] + fibSequence[1];
				fibSequence[0] = fibSequence[1];
				fibSequence[1] = fibSequence[2];
			}
			if(fibSequence[2] == number) System.out.println("IsFibo");
			else System.out.println("IsNotFibo");
		}
	}

}
