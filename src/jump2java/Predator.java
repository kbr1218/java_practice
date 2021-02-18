package jump2java;

//증요 클래스를 작성할 때(여기서는 ZooKepper class가 중요)
//클래스의 구현체와 상관없이 인터페이스를 기준으로 중요 클래스를 작성해야 함
//구현체(Tiger, Lion, Crocodile...)는 늘어가지만 인터페이스(Predator)는 하나이기 때문

public interface Predator {
	public String getFood();		

	/* 인터페이스 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없음 -> 인터페이스 규칙
	 * getFood라는 메소드는 인터페이스를 implements한 클래스들이 구현해야 함
	 * 위처럼 메소드를 추가하면 Tiger, Lion 등 Predator 인터페이스를 구현한 class에 컴파일 오류 발생
	 * 오류 해결 위해 Tiger, Lion에 getFood 메소드 구현
	 */

}
