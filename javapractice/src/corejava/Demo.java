package corejava;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
