/**
 * Nama File	: MLingkaran.java		29/3/2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: implementasi cara menghitung luas lingkaran
 *
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	
		System.out.println("Masukkan Jejari Lingkaran : ");
		double jejari = scan.nextDouble();
		scan.close();
		
		Lingkaran l = new Lingkaran(jejari);

		System.out.println("Luas Lingkaran dengan jejari " + jejari + " satuan adalah : " + l.hitungLuas());
	}
}