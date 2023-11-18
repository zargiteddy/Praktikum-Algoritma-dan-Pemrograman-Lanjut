import java.util.Scanner;
public class Usia{
	public static void main(String args[]){
	Scanner scan = new Scanner (System.in);
	int[] data = new int [7];
	String[] keluar = new String [7];
	for (int i=0;i<7;i++){
		System.out.print("Usia-"+(i+1)+":");
		data[i]=scan.nextInt();
	}
	System.out.println("=======================");
	System.out.println(" Hasil Konversi ");
	System.out.println("=======================");
	keluar = konversiNilai(data);
	for(int i=0;i<7;i++){
		System.out.println(data[i]+" "+keluar[i]);
	}
}
public static String[] konversiNilai(int[] x){
	int n = x.length;
	String hasil[] = new String [n];
	for (int i=0;i<n;i++){
		if ((x[i]>0)&&(x[i]<=5)){
			hasil[i]="balita";
		}else if ((x[i]>=6) && (x[i]<=10)){
			hasil[i]="anak";
		}else if ((x[i]>=11) && (x[i]<=20)){
			hasil[i]="remaja";
		}else if ((x[i]>=21) && (x[i]<=35)){
			hasil[i]="dewasa";
		}else if ((x[i]>=36) && (x[i]<=50)){
			hasil[i]="paruh baya";
		}else if (x[i]>50){
			hasil[i]="tua";
		}else{
			hasil[i]="Usia salah";
		}
	}
	return hasil;
}}
