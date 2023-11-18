import java.util.Scanner;
	public class Menghitung_Nilai{
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    	float total[] = new float[10];
    	String nama, nim, jurusan;
    	String namaMatKul[] = new String[10];
    	String grade[] = new String[10];
		int matkul,i;
    	int uts[] = new int[10];
		int uas[] = new int[10];

System.out.println("=================================");
System.out.println(" Menghitung Nilai Mahasiswa ");
System.out.println("=================================");

	System.out.print(" Masukan Jumlah Mata Kuliah : ");
		matkul = input.nextInt();
	System.out.println("=================================");
	System.out.print("Nama \t\t:");
		nama =  input.next();
	System.out.print("NIM \t\t:");
		nim = input.next();
	System.out.print("Jurusan \t:");
		jurusan = input.next();

	System.out.println("=================================");
		for (i=1;i<=matkul;i++){
	System.out.print("Mata Kuliah ke -"+(i)+" : ");
		namaMatKul[i] = input.next();
	System.out.print("Nilai UTS :");
		uts[i] = input.nextInt();
	System.out.print("Nilai UAS :");
		uas[i] = input.nextInt();

				total[i] = (uts[i]*50/100)+(uas[i]*50/100);
			if((total[i]>80)&&(total[i]<=100))
		  	grade[i] = "A";
			else if((total[i]>65)&&(total[i]<=80))
		   	grade[i] = "B";
			else if((total[i]>50)&&(total[i]<=65))
		   	grade[i] = "C";
			else if((total[i]>40)&&(total[i]<=50))
		   	grade[i] = "D";
			else if(total[i]<40)
		   	grade[i] = "E";
    }
	System.out.println("=================================");
	System.out.println(" Nama\t: " + nama +"\t NIM\t: " + nim);
	System.out.println("=================================");
	System.out.println("Mata Kuliah		Nilai Grade");
	System.out.println("=================================");
    	for (i=1;i<=matkul;i++) {
	System.out.println(namaMatKul[i]+"\t\t"+total[i]+"\t"+grade[i]);
    }
	System.out.println("=================================");
    }
}