package com.sr.primenum;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		new PrimeBean(a,b);
		sc.close();

	}

}
