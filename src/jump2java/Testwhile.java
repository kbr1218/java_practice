package jump2java;

public class Testwhile {
	public static void main10(String[] args) {
		//while : 반복해서 문장을 수행해야 할 경우 사용
		/*while문 기본 구조
		 * while (조건문) {
		 * 	<수행할 문장 1>
		 * 	<수행할 문장 2>
		 * 	<수행할 문장 3>
		 * 	...
		 * }
		 */
		
		//while문 예시1
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++;			//프로그래밍을 할 때 자주 쓰이는 기법, treeHit += 1 과 같음
			System.out.println("나무를 " + treeHit + "번 찍었습니다. ");
			if (treeHit == 10) {
				System.out.println("나무 넘어갑니다. ");
			}
		}
		
		//무한루프(Loop)
		/*무한루흐 기본 구조
		 * while (true) {    -> 조건문이 true이면 항상 참
		 * 	<수행할 문장1>
		 * 	<수행할 문장2>
		 * 	...
		 * }
		 */
		//while문 예시 2
//		while (true) {
//			System.out.println("Ctrl-C를 눌러야 while문을 빠져나갈 수 있음");
//		}
		
		//while문 빠져나가기 == break
		//while문 예시 3
		int coffee = 10;
		int money = 300;
		
		while (money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다. ");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다. ");
			if (coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다. ");
				break;
			}
		}
		
		//while문 조건문으로 돌아가기 == continue
		//1~10까지 수 중 홀수만 출력하는 프로그램
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
			}		
	}
}
