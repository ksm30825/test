package javaTest1_�����.test;
public class Test5 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("ù��° ���� �Է� (1~9): ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� (1~9): ");
		int num2 = sc.nextInt();
		if((num1>=1&&num1<=9)&&(num2>=1&&num2<=9)) {
			int gob = num1*num2;
			if(gob>=10) {
				System.out.println("�� �ڸ� ���Դϴ�.");
			}else {
				System.out.println("�� �ڸ� ���Դϴ�.");
			}
		}else {
			System.out.println("1~9������ ���� �Է����ּ���");
		}
	}
}
