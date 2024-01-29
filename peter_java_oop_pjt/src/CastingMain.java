
public class CastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 캐스팅 연산자 : (타입)변수명;
		byte x , y, sum ;  // 선언
		
		x = 10;
		y = 10;
		sum =(byte)( x + y);
		
		System.out.println();
		
		System.out.println("sum="+sum);
		System.out.println();
		System.out.println();
		
		char charValue = 'A' ;
		char charValue02 = 'B' ;
		System.out.println("char value =" + charValue);
		System.out.println(charValue + charValue02);
		System.out.println( (char) (charValue + charValue02));
	}

}
