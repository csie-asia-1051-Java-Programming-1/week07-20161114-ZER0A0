package hw;

import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int m = scn.nextInt() , n = scn.nextInt();
		System.out.print(GG(m , n));

	}
	
	public static int GG(int m , int n){
		return(GGG(m) / (GGG(n) * GGG(m - n)));
				
	}
	
	public static int GGG(int x){
		if(x > 1){return x * GGG(x - 1);}
		else{return 1;}
	}

}
