package String;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = ("Java");
		String B = new String("Java");
		
		String C = new String("인데 머 어쩌라고");
		String D = new String("꼽냐고 ㅋㅋㅋ");
		
		System.out.println(A != B);
		System.out.println(C == D);
		System.out.println(A.equals(B));
		
		String F = B + C + D;
		System.out.println(F);
	}

}
