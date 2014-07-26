import java.util.Scanner;


/*  8 5
 *	2 3 1 2 3 2 3 3
 *	0 3
 *	4 6
 *	6 7
 *	3 5
 *	0 7
 */

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int lengthFreeway = in.nextInt();
		int testCases = in.nextInt();
		
		int[] lane = new int[lengthFreeway];
		for(int i = 0; i < lengthFreeway; i++){
			lane[i] = in.nextInt();
		}
		for(int i = 0; i < testCases; i++){
			int enterLane = in.nextInt();
			int exitLane = in.nextInt();
			int minLength = 3;
			for(int j = enterLane; j <= exitLane; j++){
				if(lane[j] == 1){
					if(minLength > 1)
						minLength = 1;
					}
				else if(lane[j] == 2){
						if(minLength > 2)
							minLength = 2;
						}
			}
			System.out.println(minLength);
		}
	}

}
