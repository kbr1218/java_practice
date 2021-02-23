package jump2java;

public class Counter {
	//static을 붙이지 않은 경우 c1, c2 객체 생성 시 count 값을 1씩 증가하더라도 c1과 c2의 count는 독립적인
	//값을 갖기 때문에 count가 증가되지 않고 1이 나옴
	static int count = 0;
	//static을 붙인 경우 count값이 공유되어 증가된 결과값이 나옴 -> 공유 용도로 사용
	Counter(){
		this.count++;
		System.out.println(this.count);
	}
	
	//static method
	public static int getCount() {
		return count;
	}
	
	public static void main20(String[] args) {		//main20
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		//main 메소드에서 getCount 메소드는 Counter.getCount와 같의 클래스를 통해 호출함
		//static 메소드 안에서는 인스턴스 변수 접근이 불가능함
		// -> count는 static 변수이기 때문에 static method에서 접근이 가능한 것
		System.out.println(Counter.getCount());
		
		//static 메소드는 유틸리티 성 메소드를 작성할 때 많이 사용 ex> 오늘 날짜 구하기, 숫자에 콤마 추가하기 등
	}

}
