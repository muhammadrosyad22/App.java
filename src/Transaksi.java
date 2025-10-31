/**
 * Class abstrak untuk menyimpan data transaksi.
 */
public abstract class Transaksi {

    /** Nama transaksi. */
    public String nama;

    /** Jumlah uang pada transaksi. */
    public double jumlah;

    /** Kategori transaksi. */
    public String kategori;

    /**
     * Membuat objek transaksi baru.
     *
     * @param nama nama transaksi
     * @param jumlah jumlah uang
     * @param kategori kategori transaksi
     */
    public Transaksi(String nama, double jumlah, String kategori) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.kategori = kategori;
    }

    /**
     * Menampilkan informasi transaksi.
     */
    public abstract void tampilkanInfo();
}
