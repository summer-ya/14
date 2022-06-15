package test;

import java.util.Scanner;

public class choisogonyacsoo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number 1 >> ");
		int n1 = sc.nextInt();
		System.out.print("Input Number 2 >>");
		int n2 = sc.nextInt();
		System.out.println();
		
		int min = (n1<n2) ? n1 : n2;
		int gcd = 0;
		for(int i=1; i<=min; i++) {
			if(n1 % i == 0 && n2 % i ==0 )
				gcd = i;
		}
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + n1 * n2 / gcd);
	}

}
