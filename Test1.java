package javaTest1_�����.test;

public class Test1 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("���� �Է� (1~100)  : ");
		int num = sc.nextInt();
		if(num>=1&&num<=100) {
			if(num%2==0) {
				System.out.println("2�� ����Դϴ�.");
			}else {
				System.out.println("2�� ����� �ƴմϴ�.");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
