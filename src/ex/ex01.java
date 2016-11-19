package ex;
/*
 * Date: 2016/11/14
 * Author: 105021041 ·¨«Ø®f
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int data[] = new int[n];
		
		for(int x = 0 ; x < n ; x ++){
			data[x] = scn.nextInt();}
		System.out.print(var(n,data));
	}
	
	public static double var(int m , int data[]){
		
		double t = 0 , t2 = 0;
		
		for(int y = 0 ; y < m ; y ++){
			t = t + data[y];}
		t = t / m;
		for(int z = 0 ; z < m ; z ++){
			t2 = t2 + ((data[z] - t) * (data[z] - t));}
		t2 = t2 / m;
		return t2;
	}
	
}