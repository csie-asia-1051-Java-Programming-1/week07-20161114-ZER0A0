package ex;
/*
 * Date: 2016/11/14
 * Author: 105021041 ·¨«Ø®f
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		System.out.print(GG(n));}
	
	public static int GG(int x){
		if(x == 1){return x;}
		else{return x * GG(x - 1);}}}