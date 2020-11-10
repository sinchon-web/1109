package arrays;

public class ArrayTest08 {

	public static void main(String[] args) {
		
		int[][] arr=new int[2][];
		//1차원배열변수 이름
		//arr[0], arr[1]
		arr[0]=new int[] {1,2};
		arr[1]=new int[] {3,4,5};
		
		//int a[], b[];
		//a=new int[10];
		
		int [][] arr1= 
			{
				{1,2},
				{3,4,5}
			};
		
		
		for(int i=0; i<2; i++) {//i: 0, 1
			
			for(int j=0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
