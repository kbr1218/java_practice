package jump2java;

class Singleton{
//	//getInstance는 static 메소드를 이용해서 Singleton 객체를 돌려받을 수 있지만 getInstance를 호출할 때마다 새로운 객체를 생성함
//	public static Singleton getInstance() {
//		return new Singleton();
//	}
	
	
	//Singleton 클래스에 one이라는 static 변수를 두고 getInstance 메소드에서 one값이 null인 경우에만
	//객체를 생성하도록 해서 one 객체가 한 번만 만들어지도록 함
	private static Singleton one;
	private Singleton() {
	}
	
	
	//처음 getInstance가 호출되면 one이 null값임 -> new에 의해 객체 생성
	//한 번 생성된 one은 static 변수이기 때문에 이후에는 null이 아님 ->
	//다시 getInstance 메소드가 호출되면 one은 null이 아니므로 이미 만들어진 싱글톤 객체인 one을 항상 리턴함
	public static Singleton getInstance() {
		if(one == null) {
			one = new Singleton();
		}
		return one;
	}
	
}

public class SingletonTest {
	public static void main22(String[] args) {		//main22
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		
		//07-4 예외처리부터
	}

}
