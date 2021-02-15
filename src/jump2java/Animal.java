package jump2java;

public class Animal {
	//class : Animal
//	Animal cat = new Animal();		//Class의 기능1 : 객체 만들기(new 이용)
	//클래스에 의해 만들어진 객체 = 인스턴스
	//객체와 인스턴스의 차이 : "cat은 객체", "cat은 Animal의 인스턴스" 라는 표현으로 설명 가능

//	Animal dog = new Animal();
//	Animal horse = new Animal();
	
	//객체변수(Instance variable)
	String name;		//Animal Class에 name이라는 String 변수 추가 -> 클래스에 선언된 변수가 객체변수 (= 인스턴스 변수, 멤버 변수, 속성)
	//객체 변수에 접근하는 방법 : 도트 연산자(.) 이용 -> 객체.객체변수
	
	//메소드(Method) : 객체변수에 값을 대입하는 방법, 클래스 내에 구현된 함수
	public void setName(String name) {		//입력 = String name, 출력 = void(리턴값 없음)
		this.name = name;
		//메소드 호출 방법 : 도트 연산자(.) 이용 -> 객체.메소드
	}
	
	public static void main10(String[] args) {
		Animal cat = new Animal();
		cat.setName("body");				//메소드 호출
		System.out.println(cat.name);		//객체 = cat, 객체변수 = name
		// -> null값 출력, 객체변수로 name을 선언했지만 아무 값도 대입하지 않았기 때문에 null 출력
		
		Animal dog = new Animal();
		dog.setName("happy");
		System.out.println(dog.name);		//cat.name과 dog.name이 다른 값을 출력함 -> name 객체변수는 공유하지 않는 것을 확인
		
		/*
		 * 이 부분은 너무너무 중요함
		 * 클래스에서 가장 중요한 부분은 객체변수의 값이 독립적으로 유지된다는 것 -> 클래스 존재 이유
		 * 객체 지향적(Object Oriented)라는 말도 객체 변수의 값이 독립적으로 유지되기 때문에 가능한 것
		 * 참고. 객체변수의 값은 공유되지 않지만 나중에 static을 이용하면 객체변수를 공유하도록 만들 수 있음
		 */		
	}
	
	
	
}
