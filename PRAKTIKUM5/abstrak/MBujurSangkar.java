/**
 * Nama File	: MBujurSangkar.java		29/3/2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: kelas yang mengimplementasikan cara menghitung
		  luas bujur sangkar
 *
*/

import java.util.Scanner;

class MBujurSangkar{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		scan.close();
		
		BujurSangkar bs = new BujurSangkar();

		System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
	}
}