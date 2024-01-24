import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		//iki sayının kareleri toplamını veren kod
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İlk sayı:");
		int s1=scan.nextInt();
		System.out.print("İkinci sayı:");
		int s2=scan.nextInt();
		
		int s=s1*s1+s2*s2;
		System.out.print(s);

	}

}
