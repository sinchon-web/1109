package arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		String name[]= {"소연", "혜경", "학철"};
		int tot[]= {170,150,160};
		int rank[]=new int[3];//{1 , 3, 2}
		
		for(int i=0; i<3; i++) {
			rank[i]=1;
			//i:2 < j:0, 1, 2
			for(int j=0;j<3;j++) {
				if(tot[i] < tot[j]) {//160<170, 160<150, 160<160
					rank[i]++;
				}
			}
		}
		
		
		for(int i=0; i<3; i++) {
			System.out.printf("%s %d %d\n", name[i], tot[i], rank[i]);
		}
	}

}
