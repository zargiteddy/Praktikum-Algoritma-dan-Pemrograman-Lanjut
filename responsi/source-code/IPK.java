import java.util.Scanner;
public class IPK{
	public static void main(String args[]){
	Scanner scan = new Scanner (System.in);
	int nim;
	int sem;
	String nama;
	System.out.print("NIM: ");
	nim=scan.nextInt();
	System.out.print("Masukkan nama: ");
    nama=scan.next();
    System.out.print("Jumlah Semester: ");
    sem=scan.nextInt();
	double[] data = new double [8];
	int[] keluar = new int [8];
	for (int i=0;i<8;i++){
		System.out.print("IPS "+(i+1)+":");
		data[i]=scan.nextDouble();
	}
	System.out.println(" Penghargaan setiap semester: ");
	keluar = penghargaan(data);
	for(int i=0;i<8;i++){
		System.out.println(data[i]+" "+keluar[i]);
	}
}
public static int[] penghargaan(double[] x){
	int n = x.length;
	int hasil[] = new int [n];
	for (int i=0;i<n;i++){
		if ((x[i]>3.0) && (x[i]<3.5)){
			hasil[i]=100000;
		}else if (x[i]>=3.5){
			hasil[i]=200000;
		}
	}
	return hasil;
}}