package javaTest1_�����.test;

public class Test3 {

	public static void main(String[] args) {
		int num=1;
		double sum=0;
		double avg=0;
		while(num<=100){
			sum+=num;
			avg=sum/num;
			num++;
		}
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
	}
}
