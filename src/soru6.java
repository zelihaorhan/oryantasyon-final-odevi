import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
		// carpma islemini toplama kullanarak yapın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz:");
		int s1=scan.nextInt();
		System.out.print("İkinci sayıyı giriniz:");
		int s2=scan.nextInt();
		int sonuc=0;
		for(int i=0;i<s2;i++) {
			sonuc+=s1;
		}
		
		System.out.print(sonuc);

	}

}
