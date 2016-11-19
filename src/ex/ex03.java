package ex;
/*
 * Date: 2016/11/14
 * Author: 105021041 ·¨«Ø®f
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int data[][] = new int[n][n];
		
		for(int x = 0 ; x < n ; x ++){
		for(int xx = 0 ; xx < n ; xx ++){
			data[x][xx] = scn.nextInt();}}
		System.out.println(var2(n,data));
		System.out.print(std2(var2(n,data)));
	}
	
	public static double var2(int m , int data[][]){
		
		double t = 0 , t2 = 0;
		
		for(int y = 0 ; y < m ; y ++){
		for(int yy = 0 ; yy < m ; yy ++){
			t = t + data[y][yy];}}
		t = t / (m * m);
		for(int z = 0 ; z < m ; z ++){
		for(int zz = 0 ; zz < m ; zz ++){
			t2 = t2 + ((data[z][zz] - t) * (data[z][zz] - t));}}
		t2 = t2 / (m * m);
		return t2;
	}
	
	public static double std2(double t3){
		return Math.sqrt(t3);
	}
	
}
