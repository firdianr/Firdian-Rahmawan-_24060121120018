/**
 * File		: MKubus.java 		08/03/23
 * Penulis 	: Firdian Rahmawan (24060121120018)
 * Deskripsi 	: 
 * kelas yang berisi Program Utama dari Kubus
 * 
 * **/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Alas Kubus dengan panjang sisi " + bujurSangkar.getPanjangSisi() +" satuan :" + kubus.hitungLuasAlas() + "\n");
		System.out.println("Volume Kubus dengan panjang sisi " + bujurSangkar.getPanjangSisi() + " satuan :" + kubus.hitungVolume());
	}
}