package javaTest1_김수민.test;

public class Test1 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수 입력 (1~100)  : ");
		int num = sc.nextInt();
		if(num>=1&&num<=100) {
			if(num%2==0) {
				System.out.println("2의 배수입니다.");
			}else {
				System.out.println("2의 배수가 아닙니다.");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
