package jump2java.pratice;

public class Gugu {
	//int형 변수 dan
	int dan;
	
	public Gugu(int dan) {
		this.dan = dan;
	}
	
	public int get(int seq) {
		return this.dan * seq;
	}
	
	public int[] all() {
		int[] result = new int[9];
		for (int i = 0; i < 9; i++) {
			result[i] = this.get(i + 1);
		}
		return result;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		int[] result = all();
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]);
			if(i != result.length - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Gugu gugu = new Gugu(2);
		System.out.println(gugu.get(3));
		System.out.println(gugu);
		for (int i = 2; i < 2; i++) {
			System.out.println(new Gugu(i));
		}
	}

}
