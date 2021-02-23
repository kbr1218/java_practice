package jump2java.house;

public class HousePark {
	//static이 없으면 객체를 생성할 때마다 객체변수 lastname을 저장하기 위해 메모리를 별도로 할당해야 함
	//어떤 객체이던지 값이 변하지 않는 경우라면 static을 사용 -> 메모리 할당을 한 번만 함
	//static을 사용하면 같은 곳의 메모리 주소를 보기 때문에 static 변수의 값을 공유할 수 있음
	//값이 변경되지 않기를 바란다면, static 앞에 final을 붙임 -> final은 한 번 설정되면 그 값을 변경하지 못함
	static String lastname = "Park";
	
	
	//3. protected
	//protected가 붙은 변수/메소드는 동일 패키지 내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능
	protected String lastname1 = "park1";
	
	//4. public
	//public 접근제어자가 붙은 변수/메소드는 어떤 클래스에서도 접근이 가능함
	public String info = "this is public.";
	
	public static void main(String[] args) {
		HouseKim kim = new HouseKim();
		System.out.println(kim.lastname);
		//HouseKim과 HousePark의 패키지는 jump2java.house로 같고 HouseKim의 lastname 변수는 접근제어자가
		//default이므로 HousePark 클래스에서 kim.lastname으로 HouseKim의 lastname 변수에 접근이 가능
		
		//static 변수 test
		HousePark pey = new HousePark();
		HousePark pes = new HousePark();
		
	}

}
