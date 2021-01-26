
public class GugudanMain {
    public static void main(String[] args) {
    	for(int i = 2; i < 10; i++) {
        	int[] result = Gugudan.calculate(i);		//class 이름은 대문자로 시작, method 이름은 소문자로 시작
        	Gugudan.print(result);						//class 이름을 불러와야 method를 쓸 수 있음
    	}
    }
}
