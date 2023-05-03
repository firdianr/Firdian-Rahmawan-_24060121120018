/*
 * Nama File	: Pegawai.java		3 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program berisi class Pegawai
 * 
*/

public class Pegawai{
	private String nama;
	private int gajiPokok = 5000000;

	public void setNama(String nama){
		this.nama = nama;
	}

	public void setGaji(){
		this.gajiPokok = gajiPokok;
	}

	public String getNama(){
		return this.nama;
	}

	public int getGajiPokok(){
		return this.gajiPokok;
	}

	public void tampilData(){
		System.out.println("Nama : "+ this.getNama()+
		" , Gaji Pokok : " + this.getGajiPokok() +
		", Tunjangan/Bonus : -");
	}
}