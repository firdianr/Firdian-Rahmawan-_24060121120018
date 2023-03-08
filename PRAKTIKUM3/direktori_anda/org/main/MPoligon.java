/**
 * File		: MPoligon.java 		08/03/23
 * Penulis 	: Firdian Rahmawan (24060121120018)
 * Deskripsi 	: 
 * kelas yang berisi Program Utama bangun Poligon
 * 
 * **/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas()+"\n");
	
		Segitiga segitiga = new Segitiga(5, 12, 3);
		segitiga.printInfo();
		System.out.println("Sisi Miring Segitiga : " + segitiga.hitungSisiMiring());
		System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
	}
}