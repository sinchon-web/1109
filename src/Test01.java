import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		File f=new File("input.dat");
		try {
			Scanner in=new Scanner(f);
			while(in.hasNext()) {
				int n=in.nextInt();
				System.out.println(n);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
