package jump2java;

public class HouseDog extends TestInheritance {
	/* 메소드 오버라이딩(Method overriding)
	 *  HouseDog 클래스에 TestInheritance 클래스와 동일한 형태(입출력이 동일)의 sleep 메소드를 구현하면
	 * 	HouseDog 클래스의 sleep 메소드가 TestInheritance의 sleep 메소드보다 더 높은 우선순위를 가짐
	 *  HouseDog 클래스의 sleep 메소드가 호출됨
	 *  -> !!!메소드 오버라이딩(Method Overriding)!!!, 메소드 덮어쓰기  	
	 */
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
	
	
	
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep();			//sleep() 메소드 호출
		houseDog.sleep(3);			//sleep(int hour) 메소드 호출
	}
	
	//다중 상속 - 자바는 다중 상속을 지원하지 않음
	//05-5 생성자부터
}
