package javaStudy;

import java.util.Scanner;


public class javaTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int in_ = sc.nextInt();
		
		javaTest01 in_a = new javaTest01();
		
		in_a.print_(in_);
		
		
		
	}
	
	public void print_(int a_) {
		for (int i = 1; i < 10; i++) {
			System.out.println(a_ +" * "+i+" = "+(a_*i));
		}
	}
	
	
}
