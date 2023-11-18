class Mahasiswa{
    public int sks;
    public double ipk;
    public String data;

//  method mutator
     public void setSks(int sks) {
     this.sks=sks;
     }
     public void setIpk(double ipk) {
     this.ipk=ipk;
     }
     public void setData(String data) {
     this.data=data;
 }
//method accessor
     public int getSks() {
     return sks;
     }
     public double getIpk() {
     return ipk;
     }
     public String getData() {
     return data;
     }
}

public class MainMahasiswa{
public static void main(String args[]){

     Mahasiswa mahasiswa=new Mahasiswa();
     mahasiswa.setSks(24);
     mahasiswa.setIpk(4.0);
     mahasiswa.setData("Raden Isnawan Argi, 195410257, Informatika");

     System.out.println("=========DATA PRIBADI=========");
     System.out.println("Data Pribadi\t: "+ mahasiswa.getData());
     System.out.println("Jumlah SKS\t: "+ mahasiswa.getSks());
     System.out.println("IPK\t\t: "+ mahasiswa.getIpk());
    }
}