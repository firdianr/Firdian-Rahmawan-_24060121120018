/*
 * File		: LambdaList.java	31 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Implementasi Lambda padad list, digunakan sebagai parameter pada method.
 *
*/

import java.util.*;

public class LambdaList{
	public static void main (String args[]) {
		ArrayList<String> mahasiswaList = new ArrayList<>();

		mahasiswaList.add("Adi");
		mahasiswaList.add("Bambang");
		mahasiswaList.add("Cici");
		mahasiswaList.add("Didi");

		// lambda digunakan sebagai parameter
		mahasiswaList.forEach((nama) -> System.out.println(nama));
	}
}