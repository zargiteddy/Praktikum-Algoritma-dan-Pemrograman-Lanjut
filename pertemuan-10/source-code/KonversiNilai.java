import java.util.Scanner;
public class KonversiNilai{
	public static void main(String[]args){
	Scanner scan = new Scanner (System.in);
	int nilai;
	char huruf;
	double[] data = new double [10];
	char[] keluar = new char [10];
	int i = 0;
	while (i<10){
		System.out.print("data ke-"+(i+1)+":");
		data[i]=scan.nextDouble();
		i++;
	}
	System.out.println("=======================");
	System.out.println(" Hasil Konversi ");
	System.out.println("=======================");
	keluar = konversiNilai(data);

	int j = 0;
	while (j<10){
	System.out.println(data[j] + " " + keluar [j]);
	j++;
		}
	}
public static char[] konversiNilai(double[] x){
	int n = x.length;
	char hasil[] = new char [n];
	int i = 0;
	while(i<n){
		switch ((int) (x[i]/10)){
			case 10:
			case 9:
			case 8:
				hasil[i] = 'A';
				break;
			case 7:
			case 6:
				hasil[i] = 'B';
				break;
			case 5:
			case 4:
				hasil[i] = 'C';
				break;
			case 3:
			case 2:
				hasil[i] = 'D';
				break;
			case 1:
			case 0:
				hasil[i] = 'E';
				break;
			default:
				hasil[i] = 'z';
			}
			i++;
		}
		return hasil;
}}