package jump2java;

import java.util.HashMap;

public class TestMap {
	public static void main7(String[] args) {
		//맵(Map)은 딕셔너리(dictionary)와 비슷함, key-value 값으로 이루어짐
		//Map 자료형에는 HashMap, LinkedHashMap, TreeMap 등이 잇음
		
		//put : key-value 값 입력할 때 이용
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map);
		
		//get : key에 해당하는 값을 얻기 위해 이용
		System.out.println(map.get("people"));				// -> "사람" 출력
		
		//containsKey : Map에 해당 Key가 있는지 조사하여 결과값 리턴
		System.out.println(map.containsKey("people"));		// -> 있으면 true
		
		//remove : Map의 항목을 삭제하는 메소드, key값에 해당하는 key-value 삭제 후 value 값 리턴
		System.out.println(map.remove("people"));
		
		//size : Map의 갯수 리턴
		System.out.println(map.size());
		
		/*Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져옴
		 *가끔 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우 또는 입력된 key에 의해 소트된 데이터를 가져올 때
		 *이런 경우에는 LinkedHashMap이나 TreeMap을 사용하는 것이 유리함
		 *LinkedHashMap은 입력된 순서대로 데이터가 출력됨
		 *TreeMap은 입력된 Key의 소트순으로 데이터가 출력됨
		 */
	}
}
