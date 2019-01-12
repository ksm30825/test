package javaTest1_김수민.test;

public class Test6 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수 입력 (1~5) : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println("** 입력이 정상적으로 되었습니다! **");break; 
		case 2 : System.out.println("** 조회가 시작되었습니다! **");break;
		case 3 : System.out.println("** 수정이 정상적으로 되었습니다! **");break;
		case 4 : System.out.println("** 삭제가 정상적으로 되었습니다! **");break;
		case 5 : System.out.println("** 정상적으로 종료 되었습니다! **");break;
		default : System.out.println("** 다시 입력해 주세요! **");
		}
	}
}
