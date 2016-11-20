package hw;

import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		System.out.print(GG(n));
		
	}
	
	public static int GG(int n){
	
		if(n != 0){return GG(n / 10) + 1;}
		return 0;
		
	}

}
