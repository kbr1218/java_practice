package jump2java;

public class TestArray {
	public static void main5(String[] args) {
		int[] odds = {1, 3, 5, 7, 9};
		String[] weeks1 = {"월", "화", "수", "목", "금", "토", "일"};
		//위 배열은 모두 1차원 배열, 2차원 이상의 배열은 프로그래밍시 잘 사용하지 않음
		
		String[] weeks2 = new String[7];	//길이 값이 없을 때(=> "[]") 컴파일 오류 발생
		weeks2[0] = "월";
		weeks2[1] = "화";
		System.out.println(weeks2[0]);
		System.out.println(weeks2[3]);		//배열이 비었으면 null
		
		//배열의 길이만큼 for문 돌리기
		String[] weeks3 = {"월", "화", "수", "목", "금", "토", "일"};
		for (int i = 0; i < weeks3.length; i++) {
			System.out.println(weeks3[i]);
		}
		//자바 코드를 작성하면서 가장 많이 보게 될 오류 : ArrayIndexOutOfBoundsException
		// -> 배열의 길이는 7개인데 8번째 값을 구하려고 하는 경우 발생
	}
}
