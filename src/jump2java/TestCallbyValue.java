package jump2java;

//메소드로 객체를 전달할 경우 메소드에서 객체의 객체변수(속성) 값을 변경할 수 있음
class Updater {
	//public void update(int count) { -> int 자료형을 전달받을 경우 값이 변하지 않음
	public void update(TestCallbyValue counter) {	// -> 객체를 전달받으면  값이 변함
		TestCallbyValue.count++;
	}
}

public class TestCallbyValue {
// 파일 내에 클래스 두 개가 있을 수 있음
// 단, 파일명이 TestCallbyValue.java라면 파일 안의 TestCallbyValue라는 클래스는 public으로 선언하라는 규칙이 있음
    static int count = 0;
    public static void main14(String[] args) {
    	TestCallbyValue myCounter = new TestCallbyValue();
        System.out.println("before update: " + myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update: " + myCounter.count);
    }
}


