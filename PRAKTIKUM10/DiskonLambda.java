/*
 * File		: DiskonLambda.java	31 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Ekspresi Lambda dasar, digunakan untuk menghitung diskon
 *
*/

interface IDiskon{
	public double hitungDiskon(int harga);
}

public class DiskonLambda {
	public static void main (String[] args){
		// tanpa lambda
		IDiskon diskonMerdeka = new IDiskon(){
			public double hitungDiskon(int harga){
				return harga - (harga * 0.3);
			}
		};

		// dengan lambda
		IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
	
		// dengan lambda dengan blok statement
		IDiskon diskonBiasa = harga -> {return harga - (harga * 0.1);};

		System.out.println("Deskon Merdeka : " + diskonMerdeka.hitungDiskon(45000));
		System.out.println("Deskon Lebaran : " + diskonLebaran.hitungDiskon(45000));
		System.out.println("Deskon Biasa : " + diskonBiasa.hitungDiskon(45000));
	}
}