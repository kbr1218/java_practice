package jump2java;

//증요 클래스를 작성할 때(여기서는 ZooKepper class가 중요)
//클래스의 구현체와 상관없이 인터페이스를 기준으로 중요 클래스를 작성해야 함
//구현체(Tiger, Lion, Crocodile...)는 늘어가지만 인터페이스(Predator)는 하나이기 때문

//public interface Predator {
//	public String getFood();		

	/* 인터페이스 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없음 -> 인터페이스 규칙
	 * getFood라는 메소드는 인터페이스를 implements한 클래스들이 구현해야 함
	 * 위처럼 메소드를 추가하면 Tiger, Lion 등 Predator 인터페이스를 구현한 class에 컴파일 오류 발생
	 * 오류 해결 위해 Tiger, Lion에 getFood 메소드 구현
	 */
//}

/* 05-8 추상클래스(Abstract Class)
 * 인터페이스 역할도 함녀서 구현체도 가지고 있는 자바의 돌연변이 같은 클래스
 * -> 박응용씨는 추상클래스는 인터페이스로 대체하는 것이 좋은 디자인이라고 이야기함
 * Predator 인터페이스의 원래 기능을 유지하기 위해 변경
 */ 
public abstract class Predator extends Animal{
	public abstract String getFood();
	//추상 클래스를 만들 때 클래스 앞에 abstract를 써야함 + 메소드(getFood) 이름 앞에도 abstract를 붙여야 함
	//abstract 메소드는 인터페이스의 메소드와 같이 몸통이 없음
	//즉, abstract 클래스를 상속하는 클래스에서 해당 abstract 메소드를 구현해야 함
	
	//추상 클래스에는 abstract 메소드뿐만 아니라 실제 메소드도 추가가능
	//추상 클래스에 실제 메소드를 추가하면 Tiger, Lion 등으로 만들어진 객체에서 만든 메소드를 모두 사용할 수 있음
	//실제 메소드 추가 예시
	public boolean isPredator() {
		return  true;
	}
	
}
