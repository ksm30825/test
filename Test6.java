package javaTest1_�����.test;

public class Test6 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("���� �Է� (1~5) : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println("** �Է��� ���������� �Ǿ����ϴ�! **");break; 
		case 2 : System.out.println("** ��ȸ�� ���۵Ǿ����ϴ�! **");break;
		case 3 : System.out.println("** ������ ���������� �Ǿ����ϴ�! **");break;
		case 4 : System.out.println("** ������ ���������� �Ǿ����ϴ�! **");break;
		case 5 : System.out.println("** ���������� ���� �Ǿ����ϴ�! **");break;
		default : System.out.println("** �ٽ� �Է��� �ּ���! **");
		}
	}
}
