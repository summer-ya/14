package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		//���׿����� - ����
		
		// ++ : ����������
		// -- : ���ҿ�����
		
		// �ǿ����ڷ� ������ ������ ���� 1 ����(����)��Ų��
		//----------------------------------------------------------
		
		int num;
		
		num = 15; //������ 15�� �ʱ�ȭ
		
		System.out.println( num );
		System.out.println( num-- ); //���ҿ���, ���� ����, ��ġ ����
		System.out.println( num );
		
		System.out.println("---------------");
		
		num = 15; //������ 15�� �ʱ�ȭ
		
		System.out.println( num );
		System.out.println( --num ); //���ҿ���, ���� ����, ��ġ ����
		System.out.println( num );
		
		// ** ���� ���������ڴ� ������ ���� Ȱ�� ���� ������ ���� ������Ų��.
		// ** ���� ���������ڴ� ������ ���� Ȱ���� �Ŀ� ������ ���� ������Ų��.
		
		System.out.println("---------------");
		
		num = 15;
		System.out.println( num );
		
		num = 13;
		
		System.out.println( num ++ -10 - ++num);
		//���� ��°����? -12
		//������� �� num������ ��? 15
		
		
		
		
		
	}

}
