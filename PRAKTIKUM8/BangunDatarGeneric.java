/*
 * File		: BangunDatarGeneric.java	17 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: kelas kontruksi generic untuk BangunDatar
 *
*/

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;

	public void set(T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}

	public T get(){
		return bangunDatar;
	}

	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}