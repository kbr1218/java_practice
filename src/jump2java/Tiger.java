package jump2java;
//interface 연습 클래스
public class Tiger extends Animal implements Predator, Barkable {
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
