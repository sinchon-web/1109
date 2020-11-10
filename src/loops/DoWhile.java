package loops;

public class DoWhile {

	public static void main(String[] args) {
		
		int i=0;
		do {
			
			System.out.println("반복영역"+i);
			i++;
		}while(i<5);
		
		//조건에 상관없이 최소 1번은 실행
		do {
			System.out.println("반복영역");
		}while(false);
		
		
	}

}
