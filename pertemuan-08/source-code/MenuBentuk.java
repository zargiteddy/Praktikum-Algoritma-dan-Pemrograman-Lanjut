import java.util.Scanner;
public class MenuBentuk {
public static Scanner input = new Scanner(System.in);

public static void persegi()
{
 double sisi,luas;
     System.out.println("===Menghitung Luas Persegi===");
     System.out.print("Masukkan sisi=");
     	sisi = input.nextDouble();
     	luas = sisi * sisi;
     System.out.println("luas persegi="+luas);
}

public static void persegipanjang()
{
double panjang,lebar,luas;
System.out.println("===Menghitung Luas Persegi Panjang===");
    System.out.print("Masukkan panjang=");
	panjang = input.nextDouble();
    System.out.print("Masukkan lebar=");
	lebar = input.nextDouble();
	luas = panjang * lebar;
    System.out.println("luas persegi panjang="+luas);
}

public static void segitiga()

{
double alas,tinggi,luas;
    System.out.println("===Menghitung Luas Segitiga===");
    System.out.print("Masukkan alas=");
	alas = input.nextDouble();
    System.out.print("Masukkan tinggi=");
	tinggi = input.nextDouble();
	luas = (alas * tinggi)/2;
    System.out.println("luas persegi segitiga="+luas);
}

public static void main(String[] args) {
int pilih;

do
{
	System.out.println("==========MENU==========");
	System.out.println("1.Luas Persegi");
	System.out.println("2.Luas Persegi Panjang");
	System.out.println("3.Luas Segitiga");
	System.out.println("0.Keluar");
	System.out.print("Masukkan Pilihan:");

pilih =input.nextInt();
switch(pilih)
	{
	case 1 : persegi();
		break;
	case 2 : persegipanjang();
		break;
	case 3 : segitiga();
		break;
		}
	}
	while ((pilih!=0)||(pilih>3));
	System.out.println("Terima Kasih");
	}
}