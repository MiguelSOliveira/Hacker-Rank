import java.util.Scanner;


/*
 * Sample Input #00
 *	
 *	3
 *	abc
 *	abcba
 *	abcd
 *	Sample Output #00
 *	
 *	2
 *	0
 *	4
 */

public class TheLoveLetterMystery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nTests = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < nTests; i++){
			String messageString = sc.nextLine();
			char[] messageArray = messageString.toCharArray();
			int count = 0;
			for(int j = 0, n = messageArray.length-1; j < messageArray.length/2; j++, n--){
				count += Math.abs((int) messageArray[n] - messageArray[j]);
			}
			System.out.println(count);
		}
		sc.close();
	}

}
