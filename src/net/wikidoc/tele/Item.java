package net.wikidoc.tele;

public class Item {
	//name, length, value에 직접 접근할 필요 없으므로 private으로 바꾸고 값을 세팅하고 읽기 위해서 getter와 setter를 설정함
	private String name;
	private int length;
	private String value;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	//이름의 길이에 공백을 맞추기 위해 while문 이용
	public String raw() {
		StringBuffer padded = new StringBuffer(this.value);
		// ***문자열을 다시 바이트로 변환하여 길이를 체크한 부분***
/*문자열의 길이를 체크하는 방법 : padded.length()
 * 자바는 한글 한 글자의 길이를 1로 계산하기 때문에 바이트로 변환하지 않고
 * length를 이용해서 길이를 재면 바이트의 실제 길이와 다름 -> 오류 발생
 * 따라서 바이트로 변환 후 길이를 재야 함
 * 
 * ex> "김말이".length(); -> 길이 3
 * 	   "김말이".getByte().length(); -> 길이 6 (바이트로 변환 후 길이)
 */
		
		while(padded.toString().getBytes().length < this.length) {
			padded.append(' ');
		}
		return padded.toString();
	}
	
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("이름");
		item.setLength(10);
		item.setValue("김말이");
		System.out.println("[" + item.raw() + "]");
	}
}
