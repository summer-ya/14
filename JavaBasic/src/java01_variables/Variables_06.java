package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		
		System.out.println(8765); //int�� ���(constant ���Ծ���) 8765
		//--------------------------------------------------------------------
		
		// ����
		int num ;
		num = 1234;
		System.out.println( num );
		//--------------------------------------------------------------------

		// ������ ���ȭ
		// -> �̸��ִ� ���
		 int MAX, MAX2;
		MAX = 100;
		MAX2 = 200;
		System.out.println(MAX + MAX2);
		//--------------------------------------------------------------------

		// �� �л� ��
		final int studentTotalNumber = 30;
		//final int STUDENT_TOTAL_NUMBER = 36;
		
		System.out.println("�л�" + studentTotalNumber + "���� ��հ�");
		
		// ���α׷� ���� ���� �Ժη� ���� �ٲ��� �ʵ��� ����
//		studentTotalNumber = 540;
		//��հ��
		double average = 1000 / studentTotalNumber;
		
		System.out.println("��ü ���" + average);
		
	}

}
