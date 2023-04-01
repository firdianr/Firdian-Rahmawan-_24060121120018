/**
 * File		: Asersi1.java		30/3/2023
 * Nama		: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program untuk menjalankan Asersi
 *
 **/

public class Asersi1{
	public static void main (String[] args){
		int x= 0;
		if (x>0){
			System.out.println(x + " adalah bilangan positif");
		}else{
			assert(x<0) : "ada kesalahan kode";
			System.out.println(x + " adalah bilangan negatif");
		}
	}
}