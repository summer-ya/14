package java02_operator;

public class Teranry {
	public static void main(String[] args) {
		
		//���� ������ - ����
		// ���� ������
		// �������ǿ�����
		
		
		// ���ǽ��� true���� false���� �Ǵ��ϰ� ��ȯ�ϴ� ������� �޶�����
		
		//			���ǽ�  ?���ǽ��� ���� �� ��ȯ�ϴ� �� : ���ǽ��� ������ �� ��ȯ�ϴ� ��
		
		//			** ���ǽ� - ture/false �� �Ǻ��� �� �ִ� �����
		//--------------------------------------------------------------------------------
		
		//int num1 = 30, num2 = 20;
		//int num1 = 20, num2 = 20;
		int num1 = 10, num2 = 20;
		
		System.out.println( num1 > num2 ? "num1�� ũ��" : "num1�� ũ�� �ʴ�");
		System.out.println( num1 > num2 ? "num1�� ũ��" : "num1�� �۰ų� ����");
		
		//-----------------------------------------------
		System.out.println("----------------------------");
		
		String resultText = num1 == num2 ? "����" : "���� �ʴ�";
		
		System.out.println(resultText);
		//-----------------------------------------------
		
		// �� ���� �߿��� ū ���� �����Ѵ�
		int result = num1 > num2 ? num1 : num2;
		System.out.println(result);
				
		
		
	}

}
