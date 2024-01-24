import java.util.Scanner;

public class soru9 {

	public static void main(String[] args) {
		// girilen sayının kac basamaklı oldugunu hesaplayan kod
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayiyi giriniz:");
		int sayi=scan.nextInt();
		int basamak=1;
		while(sayi>9) {
			sayi=sayi/10;
			basamak++;
		}
		System.out.print(basamak);
	}

}
