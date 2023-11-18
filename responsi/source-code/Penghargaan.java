import java.util.Scanner;
public class Penghargaan
{
  public static void main(String args[])
  {
   int nim;
   int ips;
   String nama;
     Scanner input=new Scanner(System.in);
     System.out.print("NIM: ");
     nim=input.nextInt();
     System.out.print("Masukkan nama: ");
     nama=input.next();
     System.out.print("Jumlah Semester: ");
     ips=input.nextInt();
     double[] nilai=new double[ips+1];
     for(int i=1;i<ips+1;i++)
     {
		System.out.println("IPS " + i);
        nilai[i]=input.nextInt();
     }
     double grade[]=new double[ips+1];
     double ipk,sum=0;
     for(int i=0;i<ips+1;i++)
     {
        grade[i]=(nilai[i]/10) ;
     }
     for(int i=0;i<ips+1;i++)
     {
       sum+=grade[i];
     }
     ipk=sum/ips;
     System.out.println("ipk="+ipk);
     System.out.println("percantage from cgpa: "+ipk*9.5);
   }
}