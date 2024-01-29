package com.peter.test;





public class StudentVO {
	/* 변수(Variable)

      구문형식 : 접근지정자 변수타입 변수명 ;
     -- 접근지정자(public, private)   

     Syntax format: Access modifier variable type variable name;
    -- Access modifier (public, private)
    --Variable type (Primitive type, Reference type)
    --Variable name (Must start with a lowercase letter)
    변수란 선언 위치가 있는데 (전역, 지역)
*/
	// 전역변수(클래스내에서 접근가능한 범위를 갖는 것)
	private String name;
	
	private int age;
	private double height;
	private boolean isMarriage;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
	
	
	/*
	 * 생성자(Constructor)
	 * 매개변수가 없는 생성자는 기본 생성자
	 * 매개변수가 있는 생성자는 스페셜 생성자
       명시적으로 생성자가 정의되지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일을 진행
	 * 구문형식
	 * 접근지정자 클래스이름([매개변수]){
	 * 
	 * 
	 * 
	 * }
	 * 
	 *
	 * 
	 * 
	 * 
	 * 
	 *  메서드 (함수)
	 *  구문형식
	 *  만약 반환타입이 void가 아니라면 문장이 끝나기 전에 return 키워드를 이용해서 값을 반환
	 *  접근지정자 반환타입 메서드이름([매개변수]){  
	 *     문장;
	 *     return ( 기본값 | 참조값)
	 *  

	 *  }
	 * 
	 * 
	 * 
	 */
	
	
	
	
}
