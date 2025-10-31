/**
 * Class utama untuk menjalankan program pengelola keuangan.
 */
public class MainApp {

    /**
     * Method utama untuk mengeksekusi program.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        PengelolaKeuangan k = new PengelolaKeuangan();
        k.tambah("pecel", 25000, "Makanan");
        k.tambah("Ojek Online", 15000, "Transportasi");
        k.tambah("Kopi", 10000, "Minuman");
        k.tambah("Sate Ayam", 20000, "Makanan");
        k.tampilkanSemua();
        //k.tampilkanBerdasarkanKategori("Makanan");
    }
}
