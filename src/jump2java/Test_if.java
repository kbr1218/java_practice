package jump2java;

import java.util.ArrayList;

public class Test_if {
	public static void main8(String[] args) {
		//if문 예시
		boolean money1 = true;
		if (money1) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		//if문의 기본구조
		/* if (조건문) {			-> 참과 거짓을 판단하는 문장
		 * <수행할 문장1>
		 * <수행할 문장2>
		 * ...
		 * }else {
		 * <수행할 문장A>
		 * <수행할 문장B>
		 * ... 
		 */
		//조건판단을 하는 경우 자료형(boolean)보다는 비교 연산자(<, >, ==, !=, <=, >=)를 쓰는 경우가 더 많음
		
		int x = 3;
		int y = 2;
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x == y);
		System.out.println(x != y);
		
		//if문 예시2
		int money2 = 2000;
		if (money2 >= 3000) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		//조건 판단에 쓰이는 다른 연산자
		//x || y -> x와 y 중 적어도 하나가 참이면 참
		//x && y -> x와 y 모두 참이어야 참
		//!x -> x가 거짓이면 참
		//if문 예시 3
		int money3 = 2000;
		boolean hasCard = true;
		
		if (money3 >= 3000 || hasCard) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		//contains : List 안에 해당 값이 있으면 Listname.contains("xx")가 참이 되므로 if문 다음 문장이 수행
		//if문 예시 4
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("cellphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		//else if(다중 조건 판단) : 이전 조건문이 거짓일 때 수행, 개수에 제한 없이 사용할 수 있음
		//else if문 예시 5
		boolean hasCard5 = true;
		ArrayList<String> pocket5 = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("cellphone");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		}else if (hasCard5) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
	}
}
