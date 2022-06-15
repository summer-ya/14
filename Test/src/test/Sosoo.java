package test;

import java.util.Scanner;

public class Sosoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input >> ");
		int num = sc.nextInt();
		System.out.println();
		
		boolean isNotPrime = false;
		
		for(int i=1; i<=num; i++) {
			if(i ==1) {
				System.out.println(i + " 소수가 아님 ");
				continue;
			}
			isNotPrime = false;
			
			for(int j=2; j<=i-1; j++) {
				if(i%j == 0 ) {
					isNotPrime = true;
				}
			}
			if(isNotPrime) {
				System.out.println(i + " 소수가 아님");
			} else {
				System.out.println(i + "소수");
			}
		}
	}
}

