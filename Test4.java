package javaTest1_�����.test;
public class Test4 {
	public void test4_argument() {
		/*main�� argument*/
	}
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		if(num2<=0) {
			System.out.println("�� : "+(num1+num2));
			System.out.println("�� : "+(num1-num2));
			System.out.println("�� : "+(num1*num2));
			System.out.println("������ : "+"0");
		}else {
			System.out.println("�� : "+(num1+num2));
			System.out.println("�� : "+(num1-num2));
			System.out.println("�� : "+(num1*num2));
			System.out.println("������ : "+(num1/num2));
		}
		
	}
}
