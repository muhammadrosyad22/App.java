/**
 * Interface untuk operasi dasar pengelolaan pengeluaran.
 */
public interface OperasiPengeluaran {

    /**
     * Menambah data pengeluaran.
     *
     * @param nama nama pengeluaran
     * @param jumlah jumlah uang
     * @param kategori kategori pengeluaran
     */
    void tambah(String nama, double jumlah, String kategori);

    /**
     * Menghitung total pengeluaran.
     *
     * @return total pengeluaran
     */
    double total();

    /**
     * Menampilkan semua pengeluaran.
     */
    void tampilkanSemua();

    /**
     * Menampilkan ringkasan total pengeluaran.
     */
    void Tampilkanringkasan();
}
