package jump2java;

//getFood 메소드와 bark 메소드를 모두 사용하고 싶을 때 만든 인터페이스
public interface Barkable_Predator extends Barkable {  

}

/*또는 
 * public interface Barkable_Predator extends Predator, Barkable {  } 
 * public interface Barkable_Predator {
	public void bark();
	public String getFood();
 * 를 사용하면 됨
 * 이 방법은 기존의 인터페이스를 활용함 -> Predator의 getFood 메소드 & Barkable의 bark 메소드를 그대로 상속받을 수 있음
 * 인터페이스는 일반 클래스와 달리 extends를 이용하여 여러 개의 인터페이스를 동시에 상속할 수 있음(Predator, getFood)
 * 즉, ***다중 상속***이 지원됨
 * 참고! 일반 클래스는 단일 상속만 가능
 */
