/*
 * File		: MapTest.java		17 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program yang menggunakan Generic untuk pasangan
		  Kunci-Nilai
 *
*/

import java.util.*;

public class MapTest{
	public static void main(String[] args){
		// kunci -> integer, nilai -> string
		Map<Integer, String> map;
		map = new HashMap<Integer, String>();

		// menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");

		// mengambil elemen pertama
		System.out.println("Elemen Pertama : "+map.get(1)+"\n");

		// mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> key = map.keySet();

		// mengambil keseluruhan nilai dari kunci
		System.out.println("Menampilkan Seluruh Elemen :");
		for (Integer i : key){
			System.out.println(i + "." + map.get(i));	
		}
	}
}	