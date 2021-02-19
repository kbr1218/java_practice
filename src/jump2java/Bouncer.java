package jump2java;

//다형성(폴리모피즘, Polymorphism)
public class Bouncer {
//	public void barkAnimal (Animal animal) {	//입력으로 받은 animal 객체가 Tiger/Lion이면 "어흥"/"으르렁" 출력
//		if (animal instanceof Tiger) {
//			//instanceof : 특정 객체가 특정 클래스의 객체인지 조사할 때 사용되는 자바 내장 키워드
//			//animal instanceof Tiger : "animal" 객체가 new Tiger로 만들어진 객체인가?"를 묻는 조건식
//			System.out.println("어흥");
//		} else if (animal instanceof Lion) {
//			System.out.println("으르렁");
//		}
	
	
	//Tiger, Lion 메소드에 bark 메소드 구현 후
	public void barkAnimal(Barkable animal) {
		animal.bark();
		}
	//tiger, lion 객체는 각각 Tiger, Lion 클래스의 객체이면서 Animal 클래스의 객체이기도 하고 Barkable, Predator
	// 인터페이스의 객체이기도 함 -> barkAnimal 메소드의 입력 자료형을 Animal에서 Barkable로 바꾸어 쓸 수 있음
	// 하나의 객체가 여러개의 자료형 타입을 가질 수 있음 -> ***다형성, 폴리모피즘(Polymorphism)***
	
	
	public static void main17(String[] args) {
		Tiger tiger = new Tiger();			//Tiger와 Lion 클래스는 Animal 클래스를 상속받은 자식 클래스임
		Lion lion = new Lion();			//자식 클래스는 언제나 부모 클래스의 자료형으로 사용할 수 있음
											//Tiger tiger = new Tiger();와 Animal tiger = new Tiger();가 같음
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		
		//Tiger 클래스의 객체를 여러 자료형으로 표현할 수 있음
		Tiger tiger1 = new Tiger();
		Animal animal1 = new Tiger();
		Predator predator1 = new Tiger();
		Barkable barkable1 = new Tiger();
		//알아야 할 점 - Predator로 선언된 predator 객체와 Barkable로 선언된 barkable 객체는 사용할 수 있는 메소드가 서로 다름
		//			   predator 객체는 getFood() 메소드가 선언된 Predator 인터페이스의 객체이므로 getFood 메소드만 호출 가능
		//			   이와 마찬가지로 Barkable로 선언된 barkable 객체는 bark 메소드만 호출 가능
	}
	//6장 콘솔 입출력부터 하면 됨

}
