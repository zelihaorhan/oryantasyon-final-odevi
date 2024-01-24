import java.util.Scanner;
public class soru1 {

	public static void main(String[] args) {
		//iki sayının toplamını veren programın kodunu yazın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İlk sayı:");
		int s1=scan.nextInt();
		System.out.print("İkinci sayı:");
		int s2=scan.nextInt();
		
		int t=s1+s2;
		System.out.print(t);
	}

}
