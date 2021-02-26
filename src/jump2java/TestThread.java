package jump2java;

import java.util.ArrayList;

//Thread : 쓰레드를 이용하면 한 프로세스 내에거 두 가지 또는 그 이상의 일을 동시에 할 수 있음
//		   쓰레드는 순서에 상관없이 동시에 실행됨, 쓰레드가 종료되기 전에 main 메소드가 종료됨

//Runnable 인터페이스 구현 : 쓰레드 객체를 만들 때 사용하는 방법2
//						  Runnable 인터페이스는 run 메소드를 구현하도록 강제함

//public class TestThread extends Thread {
public class TestThread implements Runnable {
	int seq;
	public TestThread(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq + " thread start.");
		try {
			Thread.sleep(1000);		//시작과 종료 사이에 1초의 간격이 생기게 함
		}catch(Exception e) {
			
		}
		System.out.println(this.seq + " thread end.");
	}
	
	public static void main24(String[] args) {	//main24
		
//thread 예시		
//		for (int i = 0; i < 10; i++) {
//			Thread t = new TestThread(i);
//			t.start();
//		}
//		System.out.println("main end.");
		
		
//Join 예시
//생성되는 쓰레드를 담기 위해 ArrayList 객체인 threads를 만든 후, 쓰레드 생성시 생성된 객체를 threads에 저장
//main 메소드가 종료되기 전에 threads에 담긴 각각의 thread에 join 메소드를 호출하여 쓰레드가 종료될 때까지 대기하도록 변경		
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			//Runnable을 implements하고 Thread 생성하는 부분을 변경함
			Thread t = new Thread(new TestThread(i));
			t.start();
			threads.add(t);
		}
		
		//join 메소드는 쓰레드가 종료될 때까지 기다리게 하는 메소드
		//쓰레드가 종료된 후 다음 로직을 수행할 때 필요한 것이 join 메소드임
		for (int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			}catch(Exception e) {
				
			}
		}
		System.out.println("main end.");
	}
}
