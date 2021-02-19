package jump2java;
//interface 연습 class
public class Lion extends Animal implements Barkable_Predator {
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
