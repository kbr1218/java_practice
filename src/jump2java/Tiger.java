package jump2java;
//interface 연습 클래스
//public class Tiger extends Animal implements Predator, Barkable {
//Predator를 추상 클래스로 바꾼 후
public class Tiger extends Predator implements Barkable {
	//Tiger와 Lion은 이제 Predator 인터페이스 implements에서 Predator 추상클래스를 extends 하는 것으로 변경 

	
	//인터페이스는 ,(콤마)를 이용해서 여러개를 implements 할 수 있음
	public String getFood() {
		return "apple";
	}
	
	//다형성 연습 클래스
	public void bark() {
		System.out.println("어흥");
	}
	//bark 메소드 실행 시 "어흥"을 출력함
	
}
