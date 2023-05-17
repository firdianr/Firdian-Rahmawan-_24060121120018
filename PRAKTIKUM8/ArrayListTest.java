/*
 * File : ArrayListTest.java		17 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: program penggunaan objek Array
		  sebagai Collection class
 *
*/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){

		// inisialisasi ArrayList yang hanya dapat berisi objek String
		ArrayList<String> strings = new ArrayList<String>();

		// menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");

		// menghapus elemen
		strings.remove("praktikum");

		// iterasi pada keseluruhan ArrayList
		for (String s : strings){
			System.out.println(s + " ");
		}
	}
}