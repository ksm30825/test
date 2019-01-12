package javaTest1_±è¼ö¹Î.test;

public class Test7 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double sum=0;
		for(int i=0; i<array.length;i++) {
			if(i%2!=0)continue;
			sum+=array[i];
			System.out.println("array["+i+"] : "+array[i]);
		}
		System.out.println("ÇÕ°è : "+sum);
	}
}
