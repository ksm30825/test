package javaTest1_�����.test;

public class Test8 {

	public static void main(String[] args) {
		int[][] array = {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};
		double sum=0;
		double avg=0;
		int sumLength=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sumLength=array[i].length*array.length;
				sum+=array[i][j];
				avg=sum/sumLength;
			}
		}
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
	}

}
