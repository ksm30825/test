package javaTest1_±è¼ö¹Î.test;

public class Test10 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
		int[] copyArr = new int[array.length*array[0].length];
		int sw=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]%3==0) {
					copyArr[4*i+j]=array[i][j];
				}
			}
		}
		for(int i=1;i<copyArr.length;i++) {
			for(int j=0;j<i;j++) {
				if(copyArr[i]<=copyArr[j]) {
					int temp;
					temp = copyArr[i];
					copyArr[i]=copyArr[j];
					copyArr[j]=temp;
					if(copyArr[i]==copyArr[j]) {
						copyArr[j]=0;
					}
				}
			}
		}
		System.out.print("copyArr : ");
		for(int i=1;i<copyArr.length;i++) {
			if(copyArr[i]!=0) {
				
				System.out.print(copyArr[i]+ " ");
			}
		}
		
	}
	

}
