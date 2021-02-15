package jump2java;

public class TestMethod {
	//메소드
	//믹서기에 과일을 갈아서 과일 주스를 만들 때, 과일=입력 / 과일주스=출력(리턴값) / 믹서기=메소드(함수)
		
	/* 메소드의 구조
	 * public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
	 * 		...
	 *  	return 리턴값; ->리턴자료형이 void인 경우에는 return문이 필요 없음
	 * }
	 */
	
	//메소드의 종류 : 입력과 출력이 모두 있는 메소드, 입력과 출력이 모두 없는 메소드, 입력은 없고 출력은 있는 메소드, 입력은 있고 출력은 없는 메소드
	//리턴값을 받는 것은 return 명령어로만 가능
	
	//메소드 예시1 : 평범한 메소드(입력과 출력이 모두 있는 메소드)
	//메소드 사용 방법 : 리턴값 받을 변수 = 객체.메소드명(입력인수1, 입력인수2, ...)
	public int sum1(int a, int b) {			//입력값 = int 자료형 a, int 자료형 b
		return a+b;							//리턴값 = int 자료형
	}

	//메소드 예시2 : 입력값이 없는 메소드
	//메소드 사용 방법 : 리턴값 받을 변수 = 객체.메소드명()
	public String say1() {					//입력값 = 없음
		return "Hi";						//리턴값 = String 자료형
	}
	
	//메소드 예시3 : 리턴값이 없는 메소드
	//메소드 사용 방법 : 객체.메소드명(입력인수1, 입력인수2, ...)
	public void sum2(int e, int f) {		//입력값 = int 자료형 e, int 자료형 f
		System.out.println(e + "와" + f + "의 합은 " + (e + f) + "입니다. ");
											//리턴값 = void(없음)
	}
	
	//메소드 예시4 : 입력값도 리턴값도 없는 메소드
	//메소드 사용 방법 : 객체.메소드명()
	public void say2() {					//입력값 = 없음
		System.out.println("Hi");			//리턴값 = void(없음)
	}
	
	/* return의 또다른 쓰임새 : 특정 조건에 따라 메소드를 즉시 빠져나가고 싶은 경우 return문 이용
	 * 문자열을 출력하지만 return값은 없음(헷갈리지 않게 주의!!) + 리턴값은 return문에 의해서만 생성 가능
	 * 참고. return문을 써서 메소드를 빠져나가는 방법은 리턴 자료형이 ***void형인 메소드에만 해당***
	 * (리턴 자료형이 명시되어있는 경우 메소드에서 return문만 작성하면 컴파일 오류 발생)
	 */
	public void say_nick(String nick) {
		if("fool".equals(nick)) {
			return;
		}
		System.out.println("My nickname is " + nick + ".");
	}
	
	/*메소드 내에서 선언된 변수의 효력 범위
	 * public void var(int a){ 라는 문장에서 입력 인수를 뜻하는 변수 a는 메소드 안에서만 쓰임
	 * 메소드 밖의 변수 a가 아님 -> 메소드에서 쓰이는 변수는 메소드 밖의 변수 이름들과 전혀 상관 없음 -> ***로컬변수(local variable)***
	 * 만약 var의 입력값이 int자료형이 아닌 객체였다면, 객체를 메소드의 입력으로 넘기고 메소드가 객체의 속성값(객체변수값)을
	 * 	변경한다면 메소드 수행 이후에도 객체는 변경된 속성값을 유지함 -> 메소드에 값을 전달하느냐 vs. 객체를 전달하느냐 차이
	 */
	//메소드 효력 범위 예시1 : return문을 이용해서 변경된 값 적용하기
	public int vartest1(int g) {
		g++;
		return g;				//return이 있기 때문에 g의 값은 vartest메소드의 리턴값으로 대입(1이 증가된 값)
	}
	
	//메소드 효력 범위 예시2 : 객체 넘기기
	int h;		//객체변수 h -> 이전에는 main메소드에서 선언했는데 지금은 TestMethod클래스의 객체변수로 선언
	public void vartest2(TestMethod test) {
		test.h++;		//TestMethod 클래스의 객체를 입력받아 해당 객체의 객체변수 h를 1만큼 증가시킴
	//참고. 주목해야 할 부분은 : vartest2 메소드의 입력 파라미터가 값이 아닌 TestMethod클래스의 객체임
	//	   이렇게 메소드가 객체를 전달받으면 메소드 내의 객체는 전달받은 객체 그 자체로 수행됨
	//	   따라서 입력으로 전달받은 myTest7객체의 객체변수 h의 값이 증가하는 것
	//int자료형과 같은 primitive 자료형인 경우 값 전달, 그 이외의 경우(reference 자료형)는 객체가 전달됨
	}
	
	//this를 이용한 vartest3 메소드 예시
	int i;		//객체변수 i
	public void vartest3() {
		this.i++;			//this를 이용하여 객체에 접근(myTest객체를 굳이 전달할 필요가 없음)
	}
	
	
	
	//main 함수
	public static void main (String[] args) {
		int a = 3;
		int b = 4;
		
		TestMethod myTest1 = new TestMethod();
		int c = myTest1.sum1(a, b);		//sum 메소드의 리턴타입이 int이기 때문에 리턴값을 저장하는 c의 자료형도 int여야 함
		System.out.println(c);
		
		TestMethod myTest2 = new TestMethod();
		String d = myTest2.say1();		//메소드를 호출할 때 아무 값도 넣지 않고 써야함
		System.out.println(d);
		
		TestMethod myTest3 = new TestMethod();
		myTest3.sum2(5, 6);
		
		TestMethod myTest4 = new TestMethod();
		myTest4.say2();
		
		TestMethod myTest5 = new TestMethod();
		myTest5.say_nick("fool");
		myTest5.say_nick("호랑말코");
		
		int g = 1;
		TestMethod myTest6 = new TestMethod();
		g = myTest6.vartest1(g);			//return문 이용
		System.out.println(g);
		
		TestMethod myTest7 = new TestMethod();
		myTest7.h = 1;
		myTest7.vartest2(myTest7);			//vartest2메소드에 1 값을 전달하는 대신, TestMethod클래스의 객체인 myTest7를 넘기게 수정
		System.out.println(myTest7.h);
		
		TestMethod myTest8 = new TestMethod();
		myTest8.i = 1;
		myTest8.vartest3();
		System.out.println(myTest8.i);
	}
	
	//05-3 Call by Value할 차례
}
