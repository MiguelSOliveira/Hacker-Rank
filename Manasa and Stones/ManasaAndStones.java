import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		int nTests = sc.nextInt();
		for(int i = 0; i < nTests; i++){
			int nRocks = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for(int j = 0; j < nRocks; j++){
				set.add(b*j + (nRocks-j-1)*a);
			}
			int[] stones = new int[nRocks];
			int n = 0;
			for(int j : set){
				stones[n] = j;
				n++;
			}
			Arrays.sort(stones);
			for(int j : stones){
				System.out.print(j + " ");
			}
			System.out.println();
			set.clear();
		}
		sc.close();
	}
}