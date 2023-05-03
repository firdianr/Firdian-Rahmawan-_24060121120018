/*
 * Nama File	: Pegawai.java		3 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program berisi class Manajer
 * 
*/

public class Manajer extends Pegawai{
	private int tunjangan = 700000;

	public Manajer (String nama){
		this.setNama(nama);
		this.setGaji();
		this.tunjangan = tunjangan;
	}

	public int getTunjangan(){
		return this.tunjangan;
	}
	
	public void tampilData(){
		System.out.println("Nama : "+ this.getNama()+
		" , Gaji Pokok : " + this.getGajiPokok() +
		" , Tunjangan : " + this.getTunjangan());
	}
}