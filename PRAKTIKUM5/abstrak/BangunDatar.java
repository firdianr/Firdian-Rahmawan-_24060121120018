/**
 * Nama File	: BangunDatar.java		29/3/2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: kelas abstrak, berisi abstraksi bangun datar
 *
*/

public abstract class BangunDatar{
	protected double luas;

	public abstract double hitungLuas(double sisi);

	public void setLuas(double l){
		luas = l;
	}

	public double getLuas(){
		return luas;
	}
}