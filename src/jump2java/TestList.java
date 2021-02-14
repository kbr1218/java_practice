package jump2java;

import java.util.ArrayList;

public class TestList {
	public static void main6(String[] args) {
		/*자바 J2SE 5.0 버전 이후부터 ArrayString<String> pitches = new ArrayList<String>();
		 * 이런 식으로 어떤 객체를 포함하는지에 대해서 명확하게 표현하는 것을 권고하는 warning이 뜸    */
		
		//List 자료형 : ArrayList, LinkedList 등의 List 인터페이스를 구현한 자료형이 있음
		//add
		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142"); //add 메소드를 사용해서 pitches에 저장
		//첫 번째 위치에 "133"이라는 수를 삽입하고 싶다면 아래와 같이 코딩
		pitches.add(0, "133");
		
		//get
		System.out.println(pitches.get(1));				//특정 인덱스의 값 추출
		
		//size
		System.out.println(pitches.size());				//ArrayList의 갯수 리턴
		
		//contains
		System.out.println(pitches.contains("142"));	//리스트 안에 항목값이 있는지를 판별해서 boolean으로 리턴
		
		//remove -> remove(객체) 와 remove(인덱스) 가 있음
		System.out.println(pitches.remove("129")); 		//remove(객체)는 리스트에서 객체에 해당하는 항목 삭제하고 삭제한 결과 리턴 -> true
		System.out.println(pitches.remove(0));			//remove(인덱스)는 해당 인덱스 항목을 삭제하고 삭제된 항목 리턴 -> 138
		
		
		/*TestGenerics 03-8 제네릭스
		 * 자바 J2SE 5.0 이후에 도입된 개념
		 * ex> ArrayList<String> aList = new ArrayList<String>();
		 * 이전에는 <String>이 없었음 -> 오류가 나지는 않지만 Warning 메세지가 뜸
		 * 종류 : <String>, <Integer>, <Animal>, <Dog>
		 * 제네릭스를 사용하지 않을 경우에는 Object 자료형으로 인식됨
		 * aList에 값을 가져올 경우에는 항상 Object 자료형에서 형변환(casting)을 해 주어야만 함
		 */
	}
}
