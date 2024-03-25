package String;



public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=2; n<=9; n++){
			if(n == 4 || n == 7) continue;
			System.out.println();
			for(int a=1; a<=9; a++) {
				System.out.println(n * a);
			}	
		}
	}
}
