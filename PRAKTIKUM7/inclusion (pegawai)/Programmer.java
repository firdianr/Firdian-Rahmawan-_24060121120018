/*
 * Nama File	: Pegawai.java		3 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program berisi class Programmer
 * 
*/

public class Programmer extends Pegawai{
	private int bonus = 450000;

	public Programmer (String nama){
		this.setNama(nama);
		this.setGaji();
		this.bonus = bonus;
	}

	public int getBonus(){
		return this.bonus;
	}

	public void tampilData(){
		System.out.println("Nama : "+ this.getNama() +
		" , Gaji Pokok : " + this.getGajiPokok() +
		" , Bonus : " + this.getBonus());
	}
}