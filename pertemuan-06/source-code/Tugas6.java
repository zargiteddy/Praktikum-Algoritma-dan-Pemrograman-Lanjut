import java.util.Scanner;
public class Tugas6{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int sks,total=0;
	String matkul,jenjang;

System.out.print("Masukkan jenjang (D3/S1) = ");
jenjang = input.next();
if(jenjang.equals("D3")||jenjang.equals("S1")){

	if(jenjang.equals("D3")){

	for(int i=1;i<=3;i++){
		System.out.print("Masukkan mata kuliah = ");
			matkul = input.next();
		System.out.print("Masukkan sks = ");
			sks = input.nextInt();
			total = total+sks;}

	} else if(jenjang.equals("S1")){

	for(int i=1;i<=5;i++){
		System.out.print("Masukkan mata kuliah = ");
			matkul = input.next();
		System.out.print("Masukkan sks = ");
			sks = input.nextInt();
			total = total+sks;
			}
		}
		System.out.println("Total sks = "+total);
		}
		else{
			System.out.println("Jenjang tidak ada");
			}
	  }
}