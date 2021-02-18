package jump2java;


public class HouseDog extends TestInheritance {
	/* 메소드 오버라이딩(Method overriding)
	 *  HouseDog 클래스에 TestInheritance 클래스와 동일한 형태(입출력이 동일)의 sleep 메소드를 구현하면
	 * 	HouseDog 클래스의 sleep 메소드가 TestInheritance의 sleep 메소드보다 더 높은 우선순위를 가짐
	 *  HouseDog 클래스의 sleep 메소드가 호출됨
	 *  -> !!!메소드 오버라이딩(Method Overriding)!!!, 메소드 덮어쓰기  	
	 */

	/* name이라는 객체변수에 값을 설정해야만 객체가 설정될 수 있도록 강제하는 방법 -> 생성자 이용
	 * 아래 메소드처럼 메소드명=클래스명이고 리턴 자료형이 없는 메소드를 생성자라고 함
	 * 생성자의 규칙
	 * 1. 클래스명 = 메소드명
	 * 2. 리턴타입 정의X
	 * 생성자는 객체가 생성될 때 호출됨, 객체가 생성될 때는 new라는 키워드로 객체가 만들어질 때
	 */
	public HouseDog(String name) {		//-> 이 생성자는 입력값으로 문자열을 필요로 함
		this.setName(name);				//따라서 new 키워드로 객체를 만들 때 문자열을 전달해야만 함
	}
	
	//생성자 오버로딩 : 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있음
	public HouseDog(int type) {		//위 생성자는 String 자료형을 받는 생성자
		if (type == 1) {			//이거는 int 자료형을 받는 생성자
			this.setName("yorkshire");
		}else if (type == 2) {
			this.setName("bulldog");
		}
	}
	
	public void sleep() {
		System.out.println(this.name + " zzz in house.");
	}
	
	
	
	/* 메소드 오버로딩(Method overloading)
	 *  sleep이라는 메소드가 있지만 동일한 이름의 sleep 메소드를 또 생성할 수 있음
	 *  단, 메소드의 입력 항목이 다를 때만 가능(새로 만든 sleep 메소드는 입력항목으로 hour라는 int 자료형이 추가됨)
	 *  -> !!!메소드 오버로딩(method overloading)!!!
	 */
	public void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours.");
	}
	
	
//05-5 생성자 연습 위해서 주석 처리
//	public static void main(String[] args) {		//main16
//		HouseDog housedog = new HouseDog();
//		houseDog.setName("happy");
//		houseDog.sleep();			//sleep() 메소드 호출
//		houseDog.sleep(3);			//sleep(int hour) 메소드 호출
//	}
	
	//다중 상속 - 자바는 다중 상속을 지원하지 않음
	//05-5 생성자
	public static void main16(String[] args) {
		HouseDog happy = new HouseDog("Happy");		//생성자 호출 시 문자열을 전달해야 함 (); 일 경우 컴파일 오류 발생
		System.out.println(happy.name);
		//생성자를 사용했을 때 setName("Hello")와 같은 필수적인 행동을 객체 생성시에 제어할 수 있게 되는 것임
		HouseDog yorkshire = new HouseDog(1);
		System.out.println(yorkshire.name);
	}
	
	//default 생성자
	public class Dog2 extends Animal{
		public Dog2() {		//생성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 경우 -> default 생성자
							//default 생성자를 구현하면 new Dog2()로 Dog2 객체가 만들어질 떄 이 default 생성자가 실행됨
							//클래스에 생성자가 하나도 없는 경우 컴파일러가 자동으로 default 생성자 추가(사용자가 작성한 생성자가 하나라도 있는 경우, 컴파일러는 default 생성자를 추가하지 않음)
			
		}
		
		public void sleep() {
			System.out.println(this.name + "zzz");
		}
	}
	
}
