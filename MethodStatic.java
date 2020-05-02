package nomor4;

/*
Nama      : Firdayani_13020180089
Kelas     : B2
hari/tgl  : Jumat, 1 Mei 2020
 */
public class MethodStatic {
    public static String nama = "FIRDAYANI JUFRI";
    
    public static void cetakNama(){
	System.out.println("Nama saya "+nama);
    }
    public static void cetakUmur(int umur){
        System.out.println("Saya berumur "+umur+" tahun");
    }
    public static void main(String[] args){
        cetakNama();
        cetakUmur(20);         
    }
}
