package java03_scanner;

import java.util.Scanner;

public class Scanner_02 {
	public static void main(String[] args) {
		
		// ���ڿ�(String) �Է¹ޱ�
		
		// 1. �Է°�ü ���� ����(java.util.Scanner)
		// ** ��ü - Ŭ���� ����
		Scanner in;
		
		
		// 2. �Է°�ü ��� ����(Ȱ��ȭ) - new
		in = new Scanner(System.in);
				
				;
		// 3. ���ڿ�(String) �Է¹ޱ� - nextLine() �޼ҵ�
		System.out.println("���ڿ� �Է� : ");
		
		String str = in.nextLine(); //
		
	
		
		// 4. �Է¹��� ���ڿ� ����ϱ�
		System.out.println("�Է¹��� ���ڿ� : " + str);
		
		
//		in.next
		
	}

}
