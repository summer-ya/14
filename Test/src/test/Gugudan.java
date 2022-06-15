package test;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력하세요 >> ");

		int dan = sc.nextInt();
		if(dan>1) {
			for(int i = 1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}

		}
	}
}



