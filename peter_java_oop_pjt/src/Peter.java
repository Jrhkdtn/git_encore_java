

public class Peter {
	
	//byte -> short -> int -> long -> float ->double(묵시적 형변환)
	
	//byte <- short <- int <- long <- float <-double(명시적 형변환)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("섭섭님과 함께하는 JAVA");
            
            
            //지역변수는 메서드 내에 선언하는 변수
            int intValue = 10;
            
            char charValue ='M';
            double doubleValue =3.14;
            // = float doubleValue = 3.14F
            String stringValue = "섭섭님";  // -- String은 첫문자가 소문자면 안됨
            boolean booleanValue = false ;
            
            System.out.println("정수값 : "+intValue);
            System.out.println("문자값 : "+charValue);
            System.out.println("실수값 : "+doubleValue);
            System.out.println("문자열값 : "+stringValue);
            System.out.println("논리값 : "+booleanValue);
           
	}

}
