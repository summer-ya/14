package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 = a<b || --a>c++;
		System.out.println("a="+a+",b="+b+",c="+c);
		//���������� ���࿬�� (Shortcut)
		// a<b�� true�̹Ƿ� ||�� or ���߿� �ϳ��� ���̾ ��ü�� true��, ���� ������ ����� �ʿ�X
		
		
		
		

		
		boolean res2;
		res2 = c<b++ && c-->++a; 
		System.out.println("a="+a+",b="+b+",c="+c);
		// && �� �Ѵ� true���� true, c<b++�� false�̹Ƿ� ������ false
		
		// AND ������ ���� �ǿ����ڰ� false��� ���������� ������ ���� �ʴ´�
		// OR ������ ���� �ǿ����ڰ� true��� ���������� ������ ���� �ʴ´�
	}

}
