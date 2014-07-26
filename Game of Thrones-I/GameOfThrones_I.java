import java.util.HashSet;
import java.util.Scanner;

/*
 * Sample Input : 01

	aaabbbb
	Sample Output : 01
	
	YES
	Explanation 
	A palindrome permutation of the given string is bbaaabb. 
	
	Sample Input : 02
	
	cdefghmnopqrstuvw
	Sample Output : 02
	
	NO
	Explanation 
	You can verify that the given string has no palindrome permutation. 
	
	Sample Input : 03
	
	cdcdcdcdeeeef
	Sample Output : 03
	
	YES
	Explanation 
 *	A palindrome permutation of the given string is ddcceefeeccdd .
 */


public class GameOfThrones_I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] code = sc.nextLine().toCharArray();
		int counter [];
		HashSet<Character> codeSet = new HashSet<Character>();
		for(int i = 0; i < code.length; i++){
			codeSet.add(code[i]);
		}
		Object[] codeS = codeSet.toArray();
		counter = new int[codeSet.size()];
		for(int i = 0; i < codeS.length; i++){
			for(int j = 0; j < code.length; j++){
				if(codeS[i].equals(code[j])){
					counter[i] += 1;
				}
			}
		}
		if(code.length % 2 == 0){
			for(int i: counter){
				if(i % 2 != 0){
					System.out.println("NO");
					System.exit(0);
				}
			}
		} else {
			int count = 0;
			for(int i : counter){
				if(i % 2 != 0){
					count ++;
					if(count > 1){
						System.out.println("NO");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("YES");
		sc.close();
	}

}
