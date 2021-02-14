package jump2java;

public class Testswitch_case {
	public static void main9(String[] args) {
		/*switch/case문의 구조
		 * switch (입력변수) {
		 * 		case 입력값1 : ...
		 * 			 break;
		 * 		case 입력값2 : ...
		 * 			 break;
		 * 		...
		 * 		default : ...
		 * 			 break;
		 */
		//switch/case 문 예시
		int month = 8;
		String monthString = "";
		switch (month) {
		case 1 : monthString = "January";
		break;
		case 2 : monthString = "February";
		break;
		case 3 : monthString = "March";
		break;
		case 4 : monthString = "April";
		break;
		case 5 : monthString = "May";
		break;
		case 6 : monthString = "June";
		break;
		case 7 : monthString = "July";
		break;
		case 8 : monthString = "August";
		break;
		case 9 : monthString = "September";
		break;
		case 10 : monthString = "October";
		break;
		case 11 : monthString = "November";
		break;
		case 12 : monthString = "December";
		break;
		default : monthString = "Invalid month";
				break;
		}
		System.out.println(monthString);
		
		//month가 1~12가 아니라면 default 문장이 실행됨
		//입력이 정형화되어있는 경우 if문보다는 switch/case문이 가독성이 좋음
		//switch/case문은 if else문으로 변경 가능하지만 반대의 경우는 안 될 수도 있음
		//파이썬은 switch/case문이 없음
	}
	
}
