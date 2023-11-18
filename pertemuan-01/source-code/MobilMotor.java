import java.util.Scanner;
public class MobilMotor{
 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  String kendaraan,merek;
  System.out.print("Masukkan jenis kendaraan\n1. Mobil\t2. Motor\nPilihan:");
  kendaraan = input.next();

  switch(kendaraan){
   case "1":
     System.out.print("Masukkan merek mobil:\n1. Honda\t2. Suzuki\nPilihan: ");
     merek = input.next();
     if (merek.equals("1")) {
     System.out.println
("Pilih mobil merek Honda:\n1. Jazz (170 jt)\t2. Brio (120 jt)\t3. Mobilio (170 jt)");
     }else if (merek.equals("2")) {
     System.out.println
("Pilih mobil merek Suzuki:\n1. APV (180 jt)\t2. Swift (155 jt)\t3. Ertiga (170 jt)");
     }else{
     System.out.println("Pilihan tidak ada");
     }
     break;

   case "2":
     System.out.print("Masukkan merek motor\n1.Honda\t2.Yamaha\nPilihan:");
     merek = input.next();
     if (merek.equals("1")) {
     System.out.println
     ("Pilih motor merek Honda:\n1. Vario (15 jt)\t2. Supra (12 jt)");
     }else if (merek.equals("2")) {
     System.out.println
     ("Pilih motor merek Yamaha:\n1. Mio (14 jt)\t2. Vixion 20 jt)");
     }else{
     System.out.println("Pilihan tidak ada");
     }
     break;
     default:
     System.out.println("Pilihan tidak ada");
    }
  }
}