/*
 * File		: LambdaMap.java	31 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Implementasi Lambda pada Map, digunakan sebagai parameter pada method.
 *
*/

import java.util.*;

public class LambdaMap{
	public static void main (String args[]) {
		Map<Integer, String> mahasiswaMap;
		mahasiswaMap = new HashMap<>();

		mahasiswaMap.put(21130035, "Adi");
		mahasiswaMap.put(21120012, "Bambang");
		mahasiswaMap.put(21140123, "Cici");
		mahasiswaMap.put(21130076, "Didi");

		// lambda digunakan sebagai parameter
		mahasiswaMap.forEach((nim,nama) -> System.out.println(nim + " : " + nama));
	}
}