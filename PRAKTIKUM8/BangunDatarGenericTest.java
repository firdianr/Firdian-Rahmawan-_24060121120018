/*
 * File		: BangunDatarGenericTest.java	17 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: main class untuk class bangun datar
 *
*/

public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		
		BangunDatarGeneric<Lingkaran> bdg;
		bdg = new BangunDatarGeneric<Lingkaran>();

		bdg.set(l);

		System.out.println("Jejari = 2");
		System.out.println("Keliling Lingkaran : " + bdg.hitungKeliling());
		System.out.println("Tipe Generic : " + bdg.get().getClass().getName());

		Segitiga s = new Segitiga(3, 4);
		
		BangunDatarGeneric<Segitiga> bdg1;
		bdg1 = new BangunDatarGeneric<Segitiga>();

		bdg1.set(s);
		
		System.out.println("\nAlas = 3, Tinggi = 4");
		System.out.println("Keliling Segitiga : " + bdg1.hitungKeliling());
		System.out.println("Tipe Generic : " + bdg1.get().getClass().getName());
	}	
}