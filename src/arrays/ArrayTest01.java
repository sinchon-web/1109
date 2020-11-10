package arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int n;
		n=10;
		//배열변수 선언
		int[] arr=new int[3];
		//자동으로 변수 3개 만들어준다
		//배열이름[인덱스] : 인덱스는 0~
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println( n );
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		

	}

}
