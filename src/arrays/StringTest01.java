package arrays;

public class StringTest01 {

	public static void main(String[] args) {
		
		//문자열 상수 풀 : Perm
		String str1="문자열";//문자열상수..
		String str5="문자열";//문자열상수..
		String str2="문자열을 쓸수있습니다.";
		String str3=new String("문자열");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str5));
		System.out.println(str1.intern()==str5.intern());
		
		//특정위치 문자를 리턴
		System.out.println(str1.charAt(0));
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);//false
		
		//두문자열의 비교
		System.out.println(str1.equals(str3));//true
		//문자열을 바이트 단위로 변경
		byte[] sss=str1.getBytes();
		//해당하는 문자열의 index값 반환
		System.out.println(str2.indexOf("쓸수"));
		
		String str4="   자 바   ";
		System.out.println(str4);
		
		//앞위 쓸데없는 공백제거
		System.out.println(str4.trim());
		
		

	}

}
