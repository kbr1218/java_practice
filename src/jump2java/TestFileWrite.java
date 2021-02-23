package jump2java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
//파일읽기에서 쓸 것(아래)
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class TestFileWrite {
	public static void main19(String[] args) throws IOException {	//main 19
			
//방법 1.			
		//FileOutputStream output = new FileOutputStream("c:/out.txt");
		//c:/ 디렉토리 및에 out.txt가 생성, FileOutputStream 객체를 생성하기 위해 생성자의 입력으로 파일명을 넘겨줘야 함
		
		//파일에 내용 쓰기
		//for (int i = 1; i < 11; i++) {
			//String data = i + " 번째 줄입니다. \r\n";
			//output.write(data.getBytes());
			//}
			//FileoutputStream에 값을 쓸 때 byte 배열로 써야 하므로 String을 byte 배열로 바꾸어 주는 getByte() 메소드 이용
			//\r\n은 줄바꿈 문자(유닉스는 \n만 있으면 가능, 윈도우즈는 \r을 추가해야 줄바꿈이 제대로 됨)
			//문자열에 FileOutputStream은 불편(String을 byte배열로 변환해야 하기 때문) -> 다음 방법

		
		//}
		//output.close();		
		//파일 객체를 닫아주는 것, 생략 가능(자바 프로그램 종료시 자동으로 닫아줌)
		//사용했던 파일을 닫지 않고 다시 사용하면 에러 발생 가능
		
//방법 2.
//		FileWriter fw = new FileWriter("c:/out.txt");
//		//File Writer를 이용하면 byte배열 대신 문자열을 직접 파일에 쓸 수 있음
//		//\r과 \n을 문자열 뒤에 덧붙여야 하는 불편함은 아직도 있음 -> PrintWriter를 시용하면 됨 -> \r\n 대신 println 메소드 사용 가능
//		for(int i = 1; i < 11; i++) {
//			String data = i + " 번째 줄입니다. \r\n";
//			fw.write(data);
//		}
//		fw.close();
		
		
//방법 3.
//		PrintWriter pw = new PrintWriter("c:/out.txt");
//		for (int i = 1; i < 11; i++) {
//			String data = i + " 번째 줄입니다. ";
//			pw.println(data);
//			//지금까지 써왔던 System.out 대신 PrintWriter를 이용함
//		}
//		pw.close();
		
//파일에 내용 추가하기 (FileWriter 이용)
//		FileWriter fw2 = new FileWriter("c:/out.txt");
//		for (int i = 1; i < 11; i++) {
//			String data = i + " 번째 줄입니다. \r\n";
//			fw2.write(data);
//		}
//		fw2.close();
//		
//		FileWriter fw3 = new FileWriter("c:/out.txt", true);
//		//boolean 입력 파라미터는 추가보드(append)로 열 것인지에 대한 구분값, 기존 파일의 다음부터 글이 추가됨
//		//***new FileWriter(파일명, 추가모드구분)***
//		for (int i = 11; i < 21; i++) {
//			String data = i + " 번째 줄 입니다요. \r\n";
//			fw3.write(data);
//		}
//		fw3.close();
//FileWriter 대신 PrintWriter를 이용하고 싶은 경우는?
		
//파일에 내용 추가하기 (PrintWriter 이용)
//		PrintWriter pw1 = new PrintWriter("c:/out.txt");
//		for (int i = 1; i < 11; i++) {
//			String data = i + " 번째 줄입니다. ";
//			pw1.println(data);
//		}
//		pw1.close();
//		
//		PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
//		//PrintWriter의 생성자의 입력으로 파일명 대신 추가모드로 열린 FileWriter 객체를 사용하면 됨
//		for (int i = 11; i < 21; i++) {
//			String data = i + "번째 줄입니다요:) ";
//			pw2.println(data);
//		}
//		pw2.close();
		
		
		
//파일 읽기 방법 1. : FileInputStream 클래스(byte 배열 이용)
//		byte[] b = new byte[1024];
//		FileInputStream input = new FileInputStream("c:/out.txt");
//		input.read(b);
//		System.out.println(new String(b));
//		input.close();
//byte 배열을 이용해서 파일을 읽어야 하기 때문에 정확한 길이를 모를 경우에는 불편함 -> 라인단위로 읽는다면? 다음 방법
		
		
//파일 읽기 방법 2. : FileReader와 BufferedReader의 조합을 사용해서 라인 단위로 읽기		
		BufferedReader br = new BufferedReader (new FileReader("c:/out.txt"));
		while(true) {
			String line = br.readLine();	//더이상 읽을 라인이 없으면 null 리턴
			if (line == null) break;
			System.out.println(line);
		}
		br.close();
		
		
	}
}

