/*
 * File : AngkaSial.java		31/3/2023
 * Nama	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program penggunaan exception buatan sendiri
		  Pengenalan klausa 'throw' dan 'throws'
 *
 */

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if (angka ==13){
			throw new AngkaSialException();
		}
		System.out.println(angka + " bukan angka sial");
	}

	public static void main (String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//mtehod getMessage() sudah ada di kelas 'Exception'
			System.out.println(ase.getMessage());
			System.out.println("Hati-hati Memasukkan Angka !!!");
		}
	}
}

// Jawab Pertanyaan
/*
1. Baris 12 pada AngkaSial.java tidak dieksekusi jika terjadi eksepsi,
   karena pada saat memenuhi kondisi 'if' di cobaAngka program akan langsung 'dilempar'
   ke program AngkaSialException kemudian menjalankannya, dan tidak melanjutkan proses
   di cobaAngka.

2. Baris 21 pada AngkaSial.java akan dieksekusi jika terjadi eksepsi,
   jika tidak terjadi eksepsi maka tidak akan dieksekusi.
*/