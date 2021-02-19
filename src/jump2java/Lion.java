package jump2java;
//interface 연습 class

//public class Tiger extends Animal implements Predator, Barkable {
//Predator를 추상 클래스로 바꾼 후
public class Lion extends Predator implements Barkable {
	//Tiger와 Lion은 이제 Predator 인터페이스 implements에서 Predator 추상클래스를 extends 하는 것으로 변경 
	
	//getFood와 bark 메소드를 모두 쓰기 위해 implemets를 Barkable_Predator로 바꿈
	public String getFood() {
		return "banana";
	}
	
	//다형성 연습 클래스
	public void bark() {
		System.out.println("으르렁");
	}
	//bark 메소드 실행 시 "으르렁" 출력

}
