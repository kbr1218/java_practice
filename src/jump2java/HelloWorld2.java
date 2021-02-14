package jump2java;

public class HelloWorld2 {
	public static void main2(String args[]) {
		
		boolean isSuccess = true;
		boolean isTest = false;
		//boolean 예시
		boolean a = 2 > 1;
		boolean b = 1 == 2;
		boolean c = "3".equals("2");
		boolean d = 3 % 2 == 1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//예시1
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		if (isTall) {
			System.out.println("키가 큽니다. ");
		}
		//예시2
		int i = 3;
		boolean isOdd = i % 2 == 1;
		System.out.println(isOdd);
		
		//문자형 예시, 한 개의 문자 값에 대한 자료형 = char
		//단일 인용부호로 감싸야 함(그냥 따옴표)
		char a1 = 'a';			//문자값
		char a2 = 97;			//아스키코드값
		char a3 = '\u0061';		//유니코드값
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//문자열 예시, String
		//new라는 키워드는 객체를 만들 때 사용 (첫번째 방식이 가독성이 좋음)
		String a01 = "Happy Birthday";
		String b02 = "a";
		String c03 = new String("Happy Java");
		String d04 = new String("123");
		
		//원시자료형(primitive) = int, long, double, float, boolean, char -> new 키워드로 생성할 수 없음
		//원시자료형은 리터럴(literal)로 값을 세팅할 수 있음
		//String은 "Happy Java"와 같이 리터럴로 표기가 가능하지만 primitive 자료형은 아님
		
		//String 자료형에 자주 사용되는 메소드
		//equals
		String e = "hello";
		String f = "java";
		String g = "hello";
		System.out.println(e.equals(b));
		System.out.println(f.equals(c));
		//문자열 비교할 때는 반드시 equals를 사용해야 함, == 을 사용할 경우 false가 나오는 문제 발생
		
		//indexOf : a라는 문자열에서 Java라는 문자열이 시작되는 위치를 알고 싶은 경우 indexOf
		String h = "Hello Java";
		System.out.println(h.indexOf("Java"));
		
		//replaceAll : 문자열 중 특정 문자를 다른 문자로 바꿀 때
		String j = "Hello Java";
		System.out.println(j.replaceAll("Java", "World"));
		
		//substring : 문자열 중 특정 부분을 뽑아낼 경우에 사용 (시작위치 ~ 끝 위치, 끝위치는 포함X)
		String k = "Hello World";
		System.out.println(k.substring(0, 4));
		
		//toUpperCase : 문자열을 모두 대문자로 변경할 때 <-> 모두 소문자로 변경할 때는 toLowerCase
		String l = "Hello Java";
		System.out.println(l.toUpperCase());
		
	}	
}
