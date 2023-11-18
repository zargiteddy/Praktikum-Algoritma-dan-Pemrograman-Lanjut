import java.util.Scanner;

public class TugasBulan{
	public static void main (String arg[]){
	Scanner masuk=new Scanner(System.in);
	int bulan,tahun;
	System.out.print("Masukkan bulan : ");
	bulan=masuk.nextInt();
	System.out.print("Masukkan tahun : ");
	tahun=masuk.nextInt();
	switch (bulan) {
		case 1:case 3:case 5:case 7: case 8:case 10:case 12:
		System.out.println("31 hari");
		break;

		case 4:case 6:case 9: case 11:
		System.out.println("30 hari");
		break;
		case 2:
		if (tahun%2==0)
			System.out.print("29 hari");
		else
			System.out.print("28 hari");
			break;
		default:
		System.out.println("Salah input bulan");
		break;
	}
}
}

