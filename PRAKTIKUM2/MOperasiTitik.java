/**
 * File		: MOperasiTitik.java 		01/03/23
 * Penulis 	: Firdian Rahmawan (24060121120018)
 * Deskripsi 	: 
 * kelas yang berisi main dari Operasi Titik
 * 
 * **/

class MOperasiTitik {
  public static void main(String[] args){
    Titik t1 = new Titik(4.0, 2.0);
    OperasiTitik op = new OperasiTitik();

    System.out.println("t1("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");

    op.refleksiX(t1);
    System.out.println("\nRefleksi Terhadap Sumbu X");
    System.out.println("t1("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");

    op.refleksiY(t1);
    System.out.println("\nRefleksi Terhadap Sumbu Y");
    System.out.println("t1("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");  
  }
}
