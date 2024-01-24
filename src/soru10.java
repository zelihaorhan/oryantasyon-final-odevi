import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
		// girilen iki sayının carpımını hesaplayan kod
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İlk sayiyi giriniz:");
		int s1=scan.nextInt();
		
		System.out.print("İkinci sayiyi giriniz:");
		int s2=scan.nextInt();
		
		int sonuc=s1*s2;
		
		System.out.print(sonuc);
		

	}

}
