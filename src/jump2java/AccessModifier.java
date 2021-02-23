package jump2java;
//접근제어자

public class AccessModifier {
	// 1. private
	//접근제어자가 private으로 설정되었다면 private이 붙은 변수/메소드는 해당 클래스에서만 접근이 가능함
	private String secret;
	private String getSecret() {
		return this.secret;
	}
	
	

}
