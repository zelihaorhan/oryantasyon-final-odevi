import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		// girilen sayının faktoriyelini hesaplayan kod
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int s=scan.nextInt();
		
		int f=1;
		
		for(int i=1;i<=s;i++) {
			f*=i;
		}
		
		System.out.print(f);

	}

}
