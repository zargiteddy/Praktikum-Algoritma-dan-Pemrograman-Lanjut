public class Mahasiswa{
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