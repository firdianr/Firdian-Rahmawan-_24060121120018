/**
 * File		: Asersi2.java		30/3/2023
 * Nama		: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program untuk demo asersi, yang akan menolak input
		  jari-jari lingkaran yang bernilai 0
 *
 **/

//class Lingkaran
class Lingkaran{
	private double jariJari;

	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0) : "jari jari tidak boleh nol";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling lingkaran = " + kelilingLingkaran);
	}
}

// Jawab Pertanyaan
/*
Jika program yang diminta adalah menolak 0 tapi masih dapat menerima input bilangan
negatif, maka ada kesalahan di syarat assertion. Untuk memperbaikinya dapat ditulis
'assert(jariJari>0 || jariJari<0)' atau 'assert(jariJari != 0)'.
*/