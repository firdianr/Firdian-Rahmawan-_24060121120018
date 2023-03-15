/**
 * File		: BujurSangkar.java 		15/03/23
 * Penulis 	: Firdian Rahmawan (24060121120018)
 * Deskripsi 	: 
 * kelas yang berisi Konstruktor, dan Selektor BujurSangkar
 * **/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;

	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}

	public double hitungLuas(){
		return this.panjangSisi * this.panjangSisi;
	}

	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}