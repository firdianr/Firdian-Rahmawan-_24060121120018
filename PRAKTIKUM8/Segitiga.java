/*
 * File		: Segitiga.java	17 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: implementasi Segitiga sebagai BangunDatar
 *
*/

import java.lang.Math;

public class Segitiga extends BangunDatar{
	private double alas;
	private double tinggi;

	public Segitiga(double alas, double tinggi){
		this.alas = alas;
		this.tinggi = tinggi;
	}

	public double hitungKeliling(){
		return alas + tinggi + (Math.sqrt(alas*alas + tinggi*tinggi));
	}
}