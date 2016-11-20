package hw;

import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		GG(n);

	}
	
	public static int GG(int n){
		if(n > 0){
			System.out.print(n % 10) ; return GG(n / 10);}
		else{return 0;}
	}

}
