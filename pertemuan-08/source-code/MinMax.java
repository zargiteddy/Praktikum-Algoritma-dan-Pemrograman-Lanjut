import java.util.Scanner;
public class MinMax{
	public static void main(String args[]){
		Scanner masuk = new Scanner(System.in);

		int num1;
		int num2;

		System.out.print("Masukkan nilai 1 = ");
		num1=masuk.nextInt();
		System.out.print("Masukkan nilai 2 = ");
		num2=masuk.nextInt();

		int min = (Math.min(num1,num2));
		int max = (Math.max(num1,num2));

		System.out.println("=========================");
		System.out.println("Nilai minimal = " + min);
		System.out.println("Nilai maksimal = " + max);
	}
}
