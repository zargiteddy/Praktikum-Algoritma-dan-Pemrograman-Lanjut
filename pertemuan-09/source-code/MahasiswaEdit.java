public class MahasiswaEdit{
	String nim;
	String nama;
	String prodi;
	double ipk;

	public void setMhs(String nim, String nama, String prodi, double ipk){
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
		this.ipk = ipk;
	}
	public void tampil(){
		System.out.println("NIM \t: " + nim);
		System.out.println("Nama \t: " + nama);
		System.out.println("Prodi \t: " + prodi);
		System.out.println("IPK \t: " + ipk);
	}
	public static void main (String[]args){
		MahasiswaEdit mhs = new MahasiswaEdit();
		mhs.setMhs("195410257","Raden Isnawan","Informatika",4.0);
		mhs.tampil();
}}