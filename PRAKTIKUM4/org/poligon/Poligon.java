/**
 * File		: Poligon.java 		15/03/23
 * Penulis 	: Firdian Rahmawan (24060121120018)
 * Deskripsi 	: 
 * kelas yang berisi Konstruktor, dan Selektor Jumlah Sisi Poligon
 * 
 * **/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;

	public Poligon(){
		this.jumlahSisi = 0;
	}

	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}

	public int getJumlahSisi(){
		return this.jumlahSisi;
	}	
}