import java.util.Scanner;
public class ProyekIterasiFungsi {
	public static void cetakUlang(String cetak, int nUlang){
		for(int i=0;i<nUlang;i++){
			System.out.println(cetak);
		}
	}
	public static void main (String args[]) {
		String cetak;
		int nUlang;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan kalimat yang ingin dicetak : ");
		cetak = scan.next();
		System.out.print("Akan dicetak berapa kali : ");
		nUlang = scan.nextInt();
		cetakUlang(cetak, nUlang);
		}
	}