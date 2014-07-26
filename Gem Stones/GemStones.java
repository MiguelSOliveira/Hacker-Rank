import java.util.HashSet;
import java.util.Scanner;

/*
 * Sample Input
 * 
 * 3
 * abcdde
 * baccd
 * eeabg
 * 
 * Sample Output
 * 
 * 2
 */


public class GemStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nRocks = in.nextInt();
		in.nextLine();
		
		HashSet<Character> firstSet = new HashSet<Character>();
		HashSet<Character> nextSet = new HashSet<Character>();
		
		for(char i = 'a'; i <= 'z'; i++){
			firstSet.add(i);
		}
		for(int i = 0; i < nRocks; i++){
			nextSet.clear();
			char[] nextElements = in.next().toCharArray();
			for(int j = 0; j < nextElements.length; j++){
				nextSet.add(nextElements[j]);
			}
			firstSet.retainAll(nextSet);
		}
		System.out.println(firstSet.size());
	}
}
