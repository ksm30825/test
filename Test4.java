package javaTest1_±è¼ö¹Î.test;
public class Test4 {
	public void test4_argument() {
		/*mainÀÇ argument*/
	}
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		if(num2<=0) {
			System.out.println("ÇÕ : "+(num1+num2));
			System.out.println("Â÷ : "+(num1-num2));
			System.out.println("°ö : "+(num1*num2));
			System.out.println("³ª´©±â : "+"0");
		}else {
			System.out.println("ÇÕ : "+(num1+num2));
			System.out.println("Â÷ : "+(num1-num2));
			System.out.println("°ö : "+(num1*num2));
			System.out.println("³ª´©±â : "+(num1/num2));
		}
		
	}
}
