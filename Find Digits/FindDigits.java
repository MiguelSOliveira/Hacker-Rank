import java.util.Scanner;


public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nCases = sc.nextInt();
		for(int i = 0; i < nCases; i++){
			char[] number = sc.next().toCharArray();
			int count = 0;
			for(int j = 0; j < number.length; j++){
				if(Character.getNumericValue(number[j]) == 0);
				else if(Integer.parseInt(new String(number)) % Character.getNumericValue(number[j]) == 0)
					count++;
			}
			System.out.println(count);
		}
	}

}
