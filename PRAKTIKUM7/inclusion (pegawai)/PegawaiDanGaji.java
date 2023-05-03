/*
 * Nama File	: Pegawai.java		3 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Program utama untuk menampilkan Pegawai, dan Gaji
 * 
*/

public class PegawaiDanGaji{
	public static void main (String[] args){
		Pegawai pegawai = new Pegawai();
		pegawai.setNama("Dian");
		Pegawai pegawai1 = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai1);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}