package test;

public class Hapgye {
	public static void main(String[] args) {

		int sum = 0;

		for(int i=1; i<=1000; i++) {
			if(i%4 == 1 && i%6 ==1 ) {
				sum += i;
			}
		}
		System.out.println("나머지가 1인수의 합 : " + sum);
	}
}

