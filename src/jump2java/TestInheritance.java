package jump2java;

//Animal Class는 전에 만들었던 것 사용
public class TestInheritance extends Animal {
//상속 방법 : 자식클래스 extends 부모클래스	
	public void sleep() {							//자식 클래스에 sleep 메소드 추가
		System.out.println(this.name + " zzz");
	}

	//자바에서 만드는 모든 Class는 Object라는 클래스를 상속받게 되어 있음.
	public class Animal1 extends Object{
		String name1;
		
		public void setName1(String name1) {
			this.name1 = name1;
		}
	}
		
	public static void main15(String[] args) {		//main15
		TestInheritance dog1 = new TestInheritance();
		dog1.setName("poppy");
		System.out.println(dog1.name);
		
		//IS-A 관계 : 상속관계에 있을 때 자식 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있음
		//예시1
		Animal dog2 = new TestInheritance();
		/* 위 코드는 "개로 만든 객체는 동물 자료형이다."라고 읽을 수 있음
		 * 
		 * 예시2
		 * TestInheritance dog3 = new Animal();
		 * -> 부모 클래스로 만든 객체를 자식 클래스의 자료형으로 사용할 경우(반대의 경우), 컴파일 오류 발생
		 * 예시3
		 * TestInheritance dog = new Animal();
		 * -> 위 코드는 "동물로 만든 객체는 TestInheritance 자료형이다"라고 읽을 수 있음
		 *    동물로 만든 객체는 "개"말고 "호랑이", "사자"도 가능함 -> 예시3도 성립할 수 없음
		 */
		
		//자바에서 만드는 모든 객체는 Object 자료형으로 사용할 수 있음
		Object animal = new Animal(); 			//-> 이 가능
		Object dog = new TestInheritance();		//-> 이 가능
		
	}
}
