package jump2java.house.person;
//.을 이용해서 하위 패키지를 만들 수 있음
//jump2java.house.person은 jump2java.house 패키지의 서브 패키지


//패키지 사용하기 : import하기
import jump2java.house.HousePark;
//house 패키지 내의 모든 클래스를 import 할 때 : * 입력
//import jump2java.house.*;

//HouseKim과 동일한 패키지 내에 있는 클래스라면 HouseKim 클래스를 사용하기 위해 imprort를 따로 할 필요 없음
//같은 패키지 내에서는 import X

public class EungYoungPark extends HousePark {
	public static void main(String[] args) {
		EungYoungPark eyp = new EungYoungPark();
		System.out.println(eyp.lastname1);
		//HousePark의 lastname1 변수가 protected로 설정되어 있기 때문에 eyp.lastname1 같은 접근이 가능함
	}

}
