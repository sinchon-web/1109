package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,5,6,7,6};
		double a[]=new double[10];
		//집합구조
		
		//Collection
		
		//중복허용하지 않는 데이터구조
		HashSet<Integer> set=new HashSet<>();
		//set.add(3.14);
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(6);
		
		System.out.println( set.size() );
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		

	}

}
