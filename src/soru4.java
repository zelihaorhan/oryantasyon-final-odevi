import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		// doğum tarihi girilen kişinin yaşını hesaplayınız
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dogum tarihi:");
		int d=scan.nextInt();
		System.out.print("Mevcut yıl:");
		int m=scan.nextInt();
		
		int yas=m-d;
		System.out.print(yas);

	}

}
