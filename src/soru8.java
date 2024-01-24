import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		// girilen sayının istenilen sayıya gore modunu hesaplayınız
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Modunu hesaplamak istediginiz sayiyi giriniz:");
		int sayi = scan.nextInt();
		
		System.out.print("Hangi sayıya gore mod hesaplamak istersiniz:");
		int mod = scan.nextInt();
		
		int sonuc=sayi%mod;
		System.out.print(sonuc);

	}

}
