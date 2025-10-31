package before;

/**
 * Record untuk menyimpan data pengeluaran.
 *
 * @param nama nama pengeluaran
 * @param jumlah jumlah uang
 * @param kategori kategori pengeluaran
 */
public record uang(String nama, double jumlah, String kategori) {
}
