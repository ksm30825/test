package javaTest1_±è¼ö¹Î.test;

public class Test2 {

	public static void main(String[] args) {
		for(int dan = 2;dan<=5;dan++) {
			for(int su=1;su<=9;su++) {
				if(dan%2!=0&&su%2!=0) {
					System.out.println(dan+" * "+su+" = "+(dan*su));
				}
			}System.out.println();
		}
	}
}
