package java02_operator;

public class Binary_01 {
	public static void main(String[] args) {
		//���� ������ - ���
		// + - * / %(������)
		//--------------------------------------------------
		int num1 = 17, num2 = 3; //�ǿ�����
		int result; // ������ ������� �����ϴ� ����
		
		result = num1 + num2;
	// 	result = 17   +  3 ; // ������ ���� Ȱ���Ѵ�(�ҷ��´�)
	//  result = 20 ; //���� ����
	//  -> result ������ 20�� �����Ѵ�(�����Ѵ�)
		
		System.out.println("���� ��� : " + result);
		
		System.out.println(num1 + "��  " + num2 + "�� �հ� " + result);
		
		System.out.println("--------------------");
		
		// %
		// ������ ������
		// modular operator
		// mod ������
		
		result = num1 % num2;
	//  result = 17 % 3;
	//  result = 2;
		System.out.println("������ ������ ��� : " + result);
		System.out.println("-----------------------");
		
		System.out.println();
		System.out.println("---- ��� ������ ---");
		
		//�߸��� ����
		System.out.println("num1 + num2 = " + num1+num2);
//		System.out.println("num + num2 = " + 17 + 3);//������ Ȱ��
//		System.out.println("num + num2 = 17" + 3); //���ڿ� ����
//		System.out.println("num + num2 = 173"); //���ڿ� ����
		
		System.out.println("-----------------------");
		System.out.println("num + num2 = " + (num1 + num2) ); 
		System.out.println("num - num2 = " + (num1 - num2) ); 
		System.out.println("num * num2 = " + (num1 * num2) ); 
		System.out.println("num / num2 = " + (num1 / num2) ); // 5.666..67 �� �ƴ� 5�� ���� (��)
		System.out.println("num % num2 = " + (num1 % num2) ); //2 (������)
		//��� ������ �ݵ�� �ǿ����ڵ��� ������ Ÿ���� ���ƾ� ������ �� �ִ�.
		//��� ������ ������� �ǿ����ڵ�� ���� ������Ÿ������ ��ȯ�ȴ�.
		
		System.out.println("--------------------");
		
		System.out.println("17 / 3 = " + (17/3)); //int/int ->int
		System.out.println("17.0 / 3.0 = " + (17.0 / 3.0)); // double/double -> double
		System.out.println( (double) num1 / (double) num2); //����ȯ
	//System.out.println( (double) 17 / (double) 3); // ������ Ȱ��
	//System.out.println( (double) 17.0 / (double) 3.0); // doubleŸ������ ����ȯ
	//System.out.println( 5.6666666666667); // doubleŸ���� ������ ����
		
		System.out.println("--------------------");
		System.out.println( 11 + 34.56 );
		System.out.println( 11 + (int) 34.56 );
		System.out.println("--------------------");
		System.out.println( num1 / (double)num2); //             int / (double)int***********
	//	System.out.println( 17 / (double)3 ); // ����Ȱ��        int / (double)int
	//	System.out.println( 17 / 3.0 );       // ��������ȯ      int /  double
	//	System.out.println( 17.0 / 3.0 );     // �ڵ�����ȯ   double /  double
	//	System.out.println( 5.666666667 );    // ������ ����
		System.out.println("--------------------");
		
		System.out.println("---------�߸� ����� ���---------");
		System.out.println( (double)(num1 / num2) );
//		System.out.println( (double)(17 / 3) );   //���� Ȱ��     (double)(int / int)
//		System.out.println( (double)(5) );        //������ ����   (double)int
//		System.out.println( (double)(5.0) );      //��������ȯ     double
		
		System.out.println("--------------------");
		
		double dNum = 3.14;
		System.out.println("dNum / 2 = " + (dNum/2));
		System.out.println("dNum % 2 = " + (dNum%2));
		
		//**�Ǽ� ��꿡���� �ε��Ҽ����� ������ �߻��� �� �ִ�! ������ ��
		// -> 0.00000000000000001
	}

}
