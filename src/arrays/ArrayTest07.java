package arrays;


public class ArrayTest07 {

	public static void main(String[] args) {
		
		int[] ar;
		int[][] arr;
		
		int arr1[][], arr2[][];
		int[] arr3[], arr4, arr5[][]; 
		
		arr=new int[2][3];
		//2차원배열은 1차원배열의 집합(2개존재)
		//arr[0], arr[1]
		//arr[0][0], arr[0][1], arr[0][2]
		//arr[1][0], arr[1][1], arr[1][2]
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		System.out.println( arr.length );//2
		System.out.println( arr[0].length );//3
		System.out.println( arr[1].length );//3
		
		for(int i=0; i<arr[0].length ; i++) {
			System.out.println(arr[0][i]);
		}
		
		for(int i=0; i<arr[1].length ; i++) {
			System.out.println(arr[1][i]);
		}
		
		
		

	}

}
