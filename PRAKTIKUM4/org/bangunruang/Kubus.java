/**
 * File		: Kubus.java 		15/03/23
 * Penulis 	: Firdian Rahmawan (24060121120018)
 * Deskripsi 	: 
 * kelas yang berisi Konstruktor, dan Selektor Kubus
 * 
 * **/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;

	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}

	public double hitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}

	public double hitungVolume(){
		return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
	}
}