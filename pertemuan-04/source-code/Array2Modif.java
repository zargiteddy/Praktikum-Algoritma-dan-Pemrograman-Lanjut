import java.util.Scanner;
public class Array2Modif {
	public static void main(String[] args) {
		Scanner scn1 = new Scanner(System.in);
		Scanner scni = new Scanner(System.in);
			System.out.print("masukkan jumlah kucing :");
			int jum = scni.nextInt();

		String cats[][] = new String[jum][2];

		for(int i=0;i<jum;i++){
			for (int j=0;j<2;j++){
				String type=" ";
			switch (j){
				case 0:
					type = "nama";break;
				case 1:
					type = "warna";break;
		}
		System.out.print("masukkan " +type+ " kucing "+(i+1)+":");
		cats[i][j]=scn1.nextLine();
		}
	}
	System.out.println(" ");
	System.out.println("Nama Kucing\tWarna");
		for(int i=0;i<cats.length;i++){
			for (int j=0;j<cats[i].length;j++){
			System.out.print(cats[i][j]);
			System.out.print("\t\t");
			}
			System.out.println(" ");
			}
	  }
}
