public class Biodata{
    private String nik,nama,jk,alamat;
    private int umur;

//  method mutator
     public void setNik(String nik) {
     this.nik=nik;
     }
     public void setNama(String nama) {
     this.nama=nama;
     }
     public void setJk(String jk) {
     this.jk=jk;
 	 }
     public void setUmur(int umur) {
	 this.umur=umur;
	 }
	 public void setAlamat(String alamat) {
	 this.alamat=alamat;
}

//method accessor
     public String getNik() {
     return nik;
     }
     public String getNama() {
     return nama;
	 }
	 public String getJk() {
	 return jk;
	 }
	 public int getUmur() {
	 return umur;
	 }
	 public String getAlamat() {
	 return alamat;
}

public static void main(String args[]){

     Biodata data=new Biodata();
     data.setNik("3404900909000009");
     data.setNama("Raden Isnawan Argi Aryasatya");
     data.setJk("Laki-Laki");
     data.setUmur(21);
     data.setAlamat("Los Angeles, California");

	 System.out.println("=========DATA PRIBADI=========");
     System.out.println("NIK\t\t: "+ data.getNik());
     System.out.println("Nama\t\t: "+ data.getNama());
     System.out.println("Jenis kelamin\t: "+ data.getJk());
     System.out.println("Umur\t\t: "+ data.getUmur());
     System.out.println("Alamat\t\t: "+ data.getAlamat());
    }
}