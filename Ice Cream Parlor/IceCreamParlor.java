import java.util.Scanner;
/*
2
4
5
1 4 5 3 2
4
4
2 2 4 3*/

public class IceCreamParlor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nCases = sc.nextInt();
		while(nCases-- > 0){
			int k = sc.nextInt();
			int nFlavors = sc.nextInt();
			sc.nextLine();
			String [] flavors = sc.nextLine().split(" ");
			System.out.printf("%s\n", solve(k, nFlavors, flavors));
		}
		sc.close();
	}

	private static String solve(int k, int nFlavors, String[] flavors) {
		for(int i = 0; i < flavors.length; i++){
			for(int j = i+1; j < flavors.length; j++){
				if(Integer.parseInt(flavors[i]) + Integer.parseInt(flavors[j]) == k)
					return (i+1)+" "+(j+1);
			}
		}
		//Should never happen
		return null;
	}
}
