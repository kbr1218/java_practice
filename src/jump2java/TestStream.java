package jump2java;
import java.io.InputStream;			//java.lang에 속해 있지 않은 클래스는 import해서 사용
import java.io.InputStreamReader;	//입력한 문자값을 그대로 출력하기 위해 import함
import java.io.BufferedReader;
import java.util.Scanner;			//Scanner 사용을 위해 import 해야 함

public class TestStream {
	public static void main18(String[] args) throws Exception {		//main18
		InputStream in = System.in;		//System.in은 InputStream의 객체

//한 바이트씩 입력받는 경우 -> 한 글자 씩 변수를 만드는게 불편함 -> 배열 이용
//		int a;
//		int b;
//		int c;
//		
//		a = in.read();					//1byte의 사용자 입력을 받아들임, int 자료형으로 저장됨(아스키 코드값)
//		b = in.read();
//		c = in.read();
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

		
		
		
//길이 3의 배열을 만들어서 출력하는 방법 -> 출력이 아스키 코드라 불편함 -> InputStreamReader 사용
//		byte[] d = new byte[3];
//		in.read(d);
//		
//		System.out.println(d[0]);
//		System.out.println(d[1]);
//		System.out.println(d[2]);
		
		
		
//InputStreamReader를 사용하면 byte 대신 char 배열을 사용할 수 있게 됨
		InputStreamReader reader = new InputStreamReader(in);
//		char[] e = new char[3];
//		reader.read(e);
//		System.out.println(e);
		
//BufferedReader를 사용하는 경우
//BufferedReader는 객체 생성시 생성자의 입력값으로 InputStreamReader의 객체가 필요함
		BufferedReader br = new BufferedReader(reader);
//		String f = br.readLine();
//		System.out.println(f);
		
		
		/* 정리!!
		 * InputStream 			- byte
		 * InputStreamReader	- character
		 * BufferedReader		- String
		 */
		
		
		//Scanner : J2SE 5.0부터 추가된 java.util.Scanner 클래스
		Scanner sc = new Scanner(System.in);		
		//Scanner 클래스는 생성자의 입력으로 System.in 즉 콘솔입력인 InputStream을 필요로 함
		System.out.println(sc.next());
		//next() 메소드는 단어 하나(Token)을 읽어들임
		//next -> 단어, nextLine - 라인, nextInt - 정수
		
		
		/* 콘솔 출력
		* System.out은 PrintStream 클래스의 객체임
		* System.out.println : 콘솔에 문자열 출력 또는 디버깅 시 많이 이용
		* System.err : System.out과 동일한 역할, .err는 오류메시지 출력할 떄 사용함
		*/
	}

}
