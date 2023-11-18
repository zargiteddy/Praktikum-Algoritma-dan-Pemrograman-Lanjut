public class Mahasiswa{
	String nim;
	String nama;
	String prodi;

	public void setMhs(String nim, String nama, String prodi){
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
	}
	public void tampil(){
		System.out.println("NIM \t: " + nim);
		System.out.println("Nama \t: " + nama);
		System.out.println("Prodi \t: " + prodi);
	}
	public static void main (String[]args){
		Mahasiswa mhs = new Mahasiswa();
		mhs.setMhs("195410257","Raden Isnawan","Informatika");
		mhs.tampil();
	}
}