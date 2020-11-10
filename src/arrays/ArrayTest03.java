package arrays;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		
		int arr[]=new int[3];//점수 3개입력
		int tot = 0;//총점저장
		double avg;//평균
		
		//키보드로 부터 3개의 점수 입력 받으세요
		Scanner sc=new Scanner(System.in);
		
		for(int i=0 ; i<3 ; i++) {
			System.out.printf("점수%d 입력:", i+1);
			arr[i]=sc.nextInt();
			
			tot = tot + arr[i];
		}
		//System.out.print("점수1 입력:");
		//arr[0]=sc.nextInt();
		
		//System.out.print("점수2 입력:");
		//arr[1]=sc.nextInt();
		
		//System.out.print("점수3 입력:");
		//arr[2]=sc.nextInt();
		
		
		//총점 계산
		//tot= arr[0]+arr[1]+arr[2];
		//for(int i=0; i<3; i++) {
		//	tot = tot + arr[i];
		//}
		//tot = tot + arr[0];
		//tot = tot + arr[1];
		//tot = tot + arr[2];
		//평균 계산
		avg= (double)tot/(double)arr.length;
		
		//모든점수, 총점 , 평균(소숫점아래2자리까지 표현) 출력
		System.out.println("점수01\t점수2\t점수3\t총점\t평균");
		System.out.printf("%4d\t", arr[0]);
		System.out.printf("%4d\t", arr[1]);
		System.out.printf("%4d\t", arr[2]);
		System.out.printf("%4d\t",tot);
		System.out.printf("%.2f\n", avg);
		
		
		
		

	}

}
