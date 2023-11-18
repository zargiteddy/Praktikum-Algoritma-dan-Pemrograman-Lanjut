import java.util.Scanner;

public class SumDigit {

        public static long Tes(int n){
			if (n == 0)
				return 0;
			else if (n == 1)
				return 1;
			else
				return ((n-2) + (n*4));
		}

		public static void main(String args[]){
			 Scanner input = new Scanner (System.in);
			 System.out.print("masukkan angka: ");
			 int n=input.nextInt();
			 System.out.println("Hasil rekursif = "+Tes(n));
		 }
	 }
