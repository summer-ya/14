package java03_scanner;

import java.util.Scanner;

public class Scanner_03 {
	public static void main(String[] args) {
		
		//���ڿ� �Է� ó�� �޼ҵ�(���)
		// nextLine(), next()
		//-------------------------------------
		
		//Ű���� �Է� ��ü
		Scanner sc = new Scanner(System.in);
		
		//���ڿ� ����
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		
		//���ڿ� �Է� �ޱ�
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		//str1 = sc.next();
		//str2 = sc.next();
		
		System.out.print("-----��� -----");
		System.out.println("str1 : " + str1);
		System.out.print("str2 : " + str2);
		
		//nextLine() - '\n'
		//���๮��(���Ͱ�)�� �������� �Է��� �� ���� �ϳ��� ���ڿ��� �Ǵ��Ѵ�
		
		//next() - ' ', '\n', '\t'
		//���鹮��(white space, ws)�� �������� �ϳ��� ���ڿ��� �Ǵ��Ѵ�

	}
	
	
}
