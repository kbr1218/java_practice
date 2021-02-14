package jump2java;

public class HelloWorld {
	public static void main1(String args[]) {
		System.out.println("Hello World");
		
		int age = 10;
		long countOfStar = 8764827384923849L;
		//long 자료형을 쓸 때 숫자가 int 자료형의 최대값보다 큰 경우 뒤에 L(또는 l)을 써야함
		System.out.println(countOfStar);
		
		float pi = 3.14F;
		double morePi = 3.14195265358979323846;
		//자바 실수형은 디폴트가 double, float에 값을 대입할 때는 숫자 뒤에 F(또는 f)를 써야함, 안쓰면 컴파일 에러
		
		double d1 = 123.4;
		double d2 = 1.234e2;
		//d2의 e2은 10의 제곱 의미 -> 1.234 * 10제곱 -> 123.4 -> 결과적으로 d1 = d2
		
		int octal = 023;	//숫자 0으로 시작하면 8진수, 023 -> 십진수 19
		int hex = 0xC;		//0x로 시작하면 16진수, 0xC -> 십진수 12
		
		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		System.out.println(7 % 3);	//나머지 계산
		System.out.println(3 % 7);
		
		
	}

}
//점프 투 자바 02-3 main 메소드부터