package jump2java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//예외처리
public class TestException {
//finally 예시
	public void shouldBeRun() {
		System.out.println("ok thanks.");
	}
	
//throw 예시
	//fool이라는 문자열이 입력됨녀 return으로 메소드를 종료해서 별명이 출력되지 못함
	public void sayNick1(String nick1) {
		try {
			if ("fool".equals(nick1)) {
				//return
				//return을 throw new FoolException으로 변경 -> return으로 메소드를 빠져나오는 대신 예외를 강제로 발생시킴
				//FoolException이 상속받은 클래스 : RuntimeException
				throw new FoolException();
			}
			System.out.println("당신의 별명은 " + nick1 +" 입니다. ");
		}catch(FoolException e) {	
			//FoolExceprion에서 Exception을 상속할 경우 try_catch문으로 FoolException을 처리함
			System.err.println("FoolException이 발생했습니다. ");
		}
	}
	
	/* Exception은 크게 두 가지로 구분
	 * 1. RuntimeException - 실행 시 발생하는 예외	(= Unchecked Exception)
	 * 2. Exception		   - 컴파일 시 발생하는 예외	(= Checked Exception)
	 * 즉, Exception은 프로그램 작성 시 이미 예측가능한 예외를 작성할 때 사용하고
	 *    RuntimeException은 발생할 수도 있고 안할 수도 있는 경우에 작성
	 */
	
//throws 예시
	//throws 구문을 이용해서 FoolException을 위로 보낼 수 있음 (= 예외 뒤로 미루기)
	public void sayNick2(String nick2) throws FoolException{
		if ("fool".equals(nick2)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 " + nick2 + "입니다. ");
	}
	

	public static void main23(String[] args)  {		//main23
		//없는 파일을 열려고 할 때 : FileNotFoundException
		//0으로 나누려고 할 때 : ArithmeticException
		//배열의 범위를 벗어날 때 : ArrayIndexOutOfBoundsException

		/*try_catch문
		 * 기본 구조
		 * try {
		 * 		...
		 * } catch(예외1) {
		 * 		...
		 * } catch(예외2) {
		 * 		...
		 * ...
		 * }
		 * try문의 문장에서 예외가 발생하지 않는다면 catch문 다음 문장들은 수행되지 않음
		 * try문 안의 문장에서 해당 예외가 발생하면 해당되는 catch문이 수행됨
		 */
		
		//예외처리 예시1 : ArithmeticException이 발생하면 c에 -1을 대입하도록 예외처리
//		int c;
//		try {
//			c = 4 / 0;
//		}catch(ArithmeticException e) {
//			c = -1;
//		}
//		System.out.println(c);
//	}
		
	
	//finally : 어떤 예외가 발생하더라도 반드시 실행되어야 하는 부분
	//finally 예시
		TestException test = new TestException();
//		int c;
//		try {
//			c = 4 / 0;
//		}catch (ArithmeticException e) {
//			c = -1;
//		}finally {					//예외 발생 여부에 관계없이 무조건 실행
//			test.shouldBeRun();
//		}

		
	//throw 예시
//		test.sayNick1("fool");
//		test.sayNick1("genious");
		
	//throws를 위해 main 메소드 변경
		try {
			test.sayNick2("fool");
			test.sayNick2("genious");
		}catch(FoolException e) {
			System.out.println("FoolException이 발생했슴다. ");
		}
	}
	
	//FoolException 처리를 sayNick에서 vs. main에서 하는 것의 차이?
	/* sayNick 메소드에서 처리하는 경우 test.sayNick("fool");과 test.sayNick("genious"); 두 문장이 모두 수행됨
	 * "fool"에서 FoolException이 발생하지만 "genious" 문장도 수행됨
	 * 
	 * main메소드에서 예외처리를 한 경우 "genious" 문장이 수행되지 않음
	 * 첫 번째 문장에서 예외가 발생해서 catch문으로 빠지기 때문
	 * 
	 * 즉, Exception의 위치로 ***프로그램의 수행 여부를 결정***하고 ***트랜잭션 처리와 밀접한 관계***가 있음
	 * 
	 * 트랜잭션(Transaction) : 하나의 작업 단위를 뜻함
	 */

	//07-5 thread 부터
}
