import java.util.Scanner;



public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nTests = in.nextInt();
		for(int i = 1; i <= nTests; i++){
			int answer = 1;
			int nCycles = in.nextInt();
			for(int j = 1; j <= nCycles; j++){
				if(j % 2 != 0){
					answer *= 2;
				} else answer += 1;
			}
			System.out.println(answer);
		}
	}

}
