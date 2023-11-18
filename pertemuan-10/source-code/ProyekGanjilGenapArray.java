import java.util.Scanner;
public class ProyekGanjilGenapArray{
	public static boolean[]cekGanjilGenapArray(int[]x){
		boolean hasil[] = new boolean[10];
		for (int i=0;i<x.length;i++){
			if((x[i]%2)==0){
				hasil[i] = true;
			}else{
				hasil[i] = false;
			}
		}
		return hasil;
	}
	public static void main(String args[]){
		int data [] = new int[10];
		boolean hasilCek[] = new boolean[10];
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<10;i++){
			System.out.println("Masukkan data ke-"+(i+1)+":");
			data[i] = scan.nextInt();
		}
		hasilCek = cekGanjilGenapArray(data);
		System.out.println("=========================");
		System.out.println("==Hasil Pengecekan=======");
		System.out.println("=========================");

		for(int i=0;i<10;i++){
			System.out.println(" "+data[i]);
			if(hasilCek[i]==true){
				System.out.println("Genap");
			}else if(hasilCek[i]==false){
				System.out.println("Ganjil");
			}
			System.out.println();
		}
	}
}