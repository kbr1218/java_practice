package jump2java;

public class TestStringBuffer {
	public static void main4(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Hello");
		sb1.append(" ");
		sb1.append("jump to java");
		System.out.println(sb1.toString());
		//toString() 메소드는 String 자료형으로 변경
		
		//위 StringBuffer 예시를 String 자료형으로 표현하면
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "jump to java";
		System.out.println(temp);
		
		//insert : 특정 위치에 원하는 문자열을 삽입할 수 있음
		StringBuffer sb2 = new StringBuffer();
		sb2.append("jump to java");
		sb2.insert(5, "hello ");
		System.out.println(sb2.toString());
		
		//substring : String 자료형의 substring 메소드와 사용법이 동일함
		//substring(시작위치, 끝위치) -> StringBuffer 객체의 시작위치 ~ 끝 위치 앞까지 출력
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Hello jump to java");
		System.out.println(sb3.substring(0, 10));
		}
}
