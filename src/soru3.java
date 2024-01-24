import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// 1'den 100'e kadar olan sayıların toplamını bulan kod
		
		Scanner scan = new Scanner(System.in);
		
		int toplam=0;
		for(int i=1;i<100;i++) {
			toplam+=i;
		}
		System.out.print(toplam);

	}

}
