package jump2java;

public class Testfor {
	public static void main(String[] args) {
		//for문 예 1 : 전형적인 for문
		//numbers라는 배열의 첫번째 요소부터 마지막 요소까지 출력
		String[] numbers = {"one", "two", "three"};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//for의 조건문 : for (초기치; 조건문; 증가치)
		//for문 예 2
		int[] marks = {90, 25, 67, 45, 80};
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 60) {
				System.out.println((i + 1) + "번 학생은 합격입니다. ");
			}else {
				System.out.println((i+1) + "번 학생은 불합격입니다. ");
			}
		}
		
		//for와 continue : for문 안의 문장을 수행하는 중 continue문을 만나면 for문의 처음으로 돌아감
		//for문 예 3
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 60) {
				continue;
			}
			System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다. ");
		}
		
		//for문을 이용한 구구단
		//for문 예 4
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
		//print와 println의 차이점 : print는 줄바꿈문자(\n)를 포함하지 않고 출력
		//println은 줄바꿈문자(\n)를 포함해서 출력
		//for문과 while문은 유사하기 때문에 서로 바꿔서 쓸 수 있음
		
		//for each문 : J2SE 5.0에 추가
		//평범한 for문장 예시1
		String[] numbers1 = {"one", "two", "three"};
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}
		
		//위의 for문을 for each문으로 변경
		for(String number: numbers1) {
			System.out.println(number);
		}
		
		/*foreach문의 구조
		 * for (type var: iterate) { 
		 * 		body-of-loop
		 * }
		 * iterate는 루프를 돌릴 객체, iterate 객체에서 하나씩 순차적으로 var에 대입되어 for문 수행
		 * iterate에 들어가는 타입은 주로 배열 및 ArrayList
		 * foreach문은 반복 횟수를 따로 명시적으로 주는 것이 불가능, 1스탭씩 순차적으로 반복할 때만 사용 가능
		 */
		
		//05장 객체지향 프로그래밍 할 차례
	}
}
