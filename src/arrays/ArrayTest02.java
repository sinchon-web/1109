package arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		//int[] arr=new int[3];
		//int arr[]=new int[3];
		
		int n=10;
		
		//int arr[]=new int[] {10,20,30};
		int arr[]={10,20,30,40,50,60,11,2,1,5,3,4,5,6,4,56,48,9,1,2,467,49};
		//사이즈 정보 : arr.length
		int size=arr.length;
		
		for(int i=0; i<size ; i++) {
			System.out.println( arr[i] );
		}
		//System.out.println( arr[0] );
		//System.out.println( arr[1] );
		//System.out.println( arr[2] );
		//System.out.println( arr[3] );//exception

	}

}
