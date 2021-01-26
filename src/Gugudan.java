import java.util.Scanner;

public class Gugudan {
	//method 만들기
	public static int[] calculate(int times) {		
		int[] result = new int[9];						
    	for(int i = 0; i < result.length; i++)	{     		
    		result[i] = times * (i + 1);				
    	}
    	return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
		System.out.println(result[i]);	
		}
	}
	

    	
    	
//    	//배열&반복문 안의 반복문을 이용해서 구구단 만들기
//    	int[] result = new int[9];							//배열 크기 지정, 9개의 정수값 저장 가능
//    	for(int j = 2; j < 10; j++) {
//    		for(int i = 0; i < result.length; i++)	{     		//result.length -> result의 크기
//    			result[i] = j * (i + 1);						//배열의 시작은 항상 0임, 따라서 0 + 1부터 시작
//    		}
//    		for(int i = 0; i < result.length; i++) {
//    			System.out.println(result[i]);
//    		}
//    	}
    		
    	
//    	//8, 9단
//    	System.out.println("구구단 중 출력할 단은?");
//    	Scanner scanner = new Scanner(System.in);
//    	int number = scanner.nextInt();
//    	System.out.println("사용자가 입력한 값 : " + number);
//    	
//    	if (number < 2) {
//    		System.out.println("2 ~ 9의 값만 입력해주세요");
//    	}else if (number > 9) {
//    		System.out.println("2 ~ 9의 값만 입력해주세요");    		
//    	} else {
//    		for(int i = 1; i < 10; i++) {
//    			System.out.println(number * i);
//    		}
//    		
//    	}
   
    	//6단
//    	int i = 1;
//    	while(i < 10) {
//    		System.out.println(6 * i);
//    		i += 1; 	//i++
//    	}
//    	
//    	//7단
//    	for(int j = 1; j < 10; j++) {
//    		System.out.println(7 * j);    		
//    	}
    	
    	//2단
//    	System.out.println("2단");
//    	System.out.println(2 * 1);
//    	System.out.println(2 * 2);
//    	System.out.println(2 * 3);
//    	System.out.println(2 * 4);
//    	System.out.println(2 * 5);
//    	System.out.println(2 * 6);
//    	System.out.println(2 * 7);
//    	System.out.println(2 * 8);
//    	System.out.println(2 * 9);
    	
    	//3단자바
//    	System.out.println("3단");
//    	System.out.println(3 * 1);
//    	System.out.println(3 * 2);
//    	System.out.println(3 * 3);
//    	System.out.println(3 * 4);
//    	System.out.println(3 * 5);
//    	System.out.println(3 * 6);
//    	System.out.println(3 * 7);
//    	System.out.println(3 * 8);
//    	System.out.println(3 * 9);
    	
    	//4단
//    	System.out.println("4단");
//    	int result = 4 * 1;
//    	System.out.println(result);
//    	result = 4 * 2;
//    	System.out.println(result);
//    	result = 4 * 3;
//    	System.out.println(result);
//    	result = 4 * 4;
//    	System.out.println(result);
//    	result = 4 * 5;
//    	System.out.println(result);
//    	result = 4 * 6;
//    	System.out.println(result);
//    	result = 4 * 7;
//    	System.out.println(result);
//    	result = 4 * 8;
//    	System.out.println(result);
//    	result = 4 * 9;
//    	System.out.println(result);

    	//(사용자입력값)단
//    	System.out.println(number * 1);
//    	System.out.println(number * 2);
//    	System.out.println(number * 3);
//    	System.out.println(number * 4);
//    	System.out.println(number * 5);
//    	System.out.println(number * 6);
//    	System.out.println(number * 7);
//    	System.out.println(number * 8);
//    	System.out.println(number * 9);
//    	System.out.println("새로운 내용 추가");
    	
    	
}
