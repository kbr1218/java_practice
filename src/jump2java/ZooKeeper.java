package jump2java;

public class ZooKeeper {
/*인터페이스 사용 전
 * 	public void feed(Tiger tiger) {
		System.out.println("feed apple");
	}
	
	public void feed(Lion lion) {
		System.out.println("feed banana");
	}
*/	
	
	//인터페이스 사용 후
	//tiger, lion은 Tiger, Lion의 객체이기도 하지만 Predator 인터페이스의 객체이기도 하기 때문에 Predator를 자료형의 타입으로 사용할 수 있음
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
	
	
	public static void main16(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
	}
	//중요한 점! 메소드의 갯수가 줄어들은 것이 아니라 ZooKeeper Calss가 동물들의 종류에 의존적인 클래스에서
	// 동물들의 종류와 상관없는 ***독립적인 클래스***가 되었다든 점임 -> 인터페이스의 핵심
	
}
