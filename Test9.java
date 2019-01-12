package javaTest1_梯熱團.test;

public class Test9 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int max=0;
		int mini=10000;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(max<array[i][j]) {
					max=array[i][j];
					
				}
				if(mini>array[i][j]) {
					mini=array[i][j];
				}
			}
		}
		System.out.println("譆渠高 : "+max);
		System.out.println("譆模高"+mini);	
	}
}
