/*
 * File : AngkaSialException.java		31/3/2023
 * Nama	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!
 *
 */

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("Jangan Masukkan Angka 13 karena angka sial !!!");
	}
}