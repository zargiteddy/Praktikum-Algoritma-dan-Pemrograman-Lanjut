import java.util.Scanner;
public class spaswitchh{
public static void main (String arg[]){
Scanner in=new Scanner(System.in);

	int gel;
	String jen,jur;
	System.out.print("masukkan gelombang (1/2) : ");
	gel=in.nextInt();
 	System.out.print("masukkan jenjang (D3/S1) : ");
	jen=in.next();
    System.out.print("masukkan jurusan : ");
 	jur=in.next();

 switch(gel)
 {
 case 1:
 switch(jen)
 {
	case "D3":
		switch(jur){
		case "TA":
 		System.out.println("SPA gel "+gel+" : Rp. 6.900.000 ");
 		break;
 		case "KA":
 		System.out.println("SPA gel "+gel+" : Rp. 7.900.000 ");
 		break;
  		case "MI":
 		System.out.println("SPA gel "+gel+" : Rp. 8.900.000 ");
 		break;
		default:
 	System.out.println("salah memasukkan jurusan");
}
 break;
   case "S1":
		switch(jur){
		case "TI":
		System.out.println("SPA gel "+gel+" : Rp. 13.400.000 ");
		break;
		case "SI":
		System.out.println("SPA gel "+gel+" : Rp. 12.400.000 ");
 		break;
		default:
 	System.out.println("jurusan tidak terdaftar");
 }
 break;
 }
break;

case 2:
switch(jen)
{
	case "D3":
		switch(jur){
		case "TA":
 		System.out.println("SPA gel "+gel+" : Rp. 8.900.000 ");
 		break;
 		case "KA":
 		System.out.println("SPA gel "+gel+" : Rp. 9.900.000 ");
 		break;
  		case "MI":
 		System.out.println("SPA gel "+gel+" : Rp. 10.900.000 ");
 		break;
		default:
 	System.out.println("salah memasukkan jurusan");
break;
}
break;
case "S1":
	switch(jur){
	case "TI":
 	System.out.println("SPA gel "+gel+" : Rp. 13.900.000 ");
 	break;
 	case "SI":
 	System.out.println("SPA gel "+gel+" : Rp. 12.900.000 ");
 	break;
	default:
 System.out.println("jurusan tidak terdaftar");
 }
 break;
 }
 	break;
	default:
 	System.out.println("Salah masukkan gelombang");
 	}
 }}
