package java02_operator;

public class Binary_04 {
	public static void main(String[] args) {
		
		//���� ������ - ��
		//     &&         ||         !
		//     AND        OR         NOT
		
		//     **  !(NOT) �����ڴ� ���� ������
		
		//     ��(boolean) �������� ���踦 ������ ����� ��ȯ�Ѵ�
		
		// AND ������ �ǿ����ڰ� ��� true�� �� ��ü ����� true
		// OR ������ �ǿ����ڰ� �� �� �ϳ��� true�� �� ��ü ����� true
		
		// NOT ������ �ǿ������� ���� �����Ѵ�(�ݴ�� �ٲ۴�)
		
		//   | (������, Vertical Bar) - shift + \
		//----------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&flase : " + (b1&&b2)); //false
		System.out.println("true||false : " + (b1||b2)); //true
		System.out.println("-----------------------------------");
		
		int num = 77;
		
		System.out.println( num >= 1); //true 
		System.out.println( num <= 100); //true
		
		
		// num������ 1���� ũ�ų� ����, �׸���, num������ 100���� �۰ų� ����
		//  -> num ������ 1~100 ������ ���̴�
		
		
		System.out.println( num >= 1 && num <= 100);
//		System.out.println( ((77 >= 1) && (77 <= 100))); //���� Ȱ��
//		System.out.println( true && ( 77 <= 100)); //������ >= ����
//		System.out.println( true && true )); //������ <= ����
//		System.out.println( true ); // && ����
		
		//---------------------------------------
		System.out.println("------------------------");
		System.out.println( !((num >= 1) && (num <=100)) );
//		System.out.println( !(num >= 1) !&& !(num <=100) );
		System.out.println( num < 1 || num > 100 );
		
		// ** !(������) �������� ����
		// ���迬���ڴ� �ݴ� �������� ġȯ�ȴ�
		
		
	}

}
