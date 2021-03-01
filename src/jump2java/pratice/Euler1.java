package jump2java.pratice;

/* 프로젝트 오일러 퀴즈 중 가장 첫번째 퀴즈 "Multiple of 3 and 5"
 * 10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다. 이들의 총합은 23이다. 
 * 1000미만의 자연수에서 3, 5의 배수의 총합을 구하라.
 */
public class Euler1 {
	int max;
	public Euler1(int max) {
		this.max = max;
	}
	
	public int sumOf3And5() {
		int sum = 0;
		for (int i = 0; i < max; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main2(String[] args) {		
		System.out.println(new Euler1(10).sumOf3And5());
		System.out.println(new Euler1(1000).sumOf3And5());
	}

}
