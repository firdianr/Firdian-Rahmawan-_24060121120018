/**
 * Nama File	: Lingkaran.java		29/3/2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: kelas implementasi IArea berupa cara menghitung
		  luas Lingkaran
 *
*/

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
	private double jejari;

	public Lingkaran(double r){
		jejari = r;
	}

	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}