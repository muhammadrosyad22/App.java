import before.uang;
import java.util.ArrayList;

/**
 * Class untuk menyimpan data pengeluaran.
 */
class Pengeluaran extends Transaksi {

    /**
     * Membuat objek pengeluaran baru.
     *
     * @param uang data nama, jumlah, dan kategori
     */
    public Pengeluaran(uang uang) {
        super(uang.nama(), uang.jumlah(), uang.kategori());
    }

    /**
     * Menampilkan informasi pengeluaran ke layar.
     */
    @Override
    public void tampilkanInfo() {
        System.out.println(nama + " - " + kategori + " - Rp" + jumlah);
    }
}

/**
 * Class untuk mengelola daftar pengeluaran.
 */
class PengelolaKeuangan implements OperasiPengeluaran {

    /** Menyimpan daftar pengeluaran. */
    public ArrayList<Pengeluaran> daftar = new ArrayList<>();

    /**
     * Menambah data pengeluaran.
     *
     * @param nama nama pengeluaran
     * @param jumlah jumlah uang
     * @param kategori kategori pengeluaran
     */
    @Override
    public void tambah(String nama, double jumlah, String kategori) {
        Pengeluaran p = new Pengeluaran(new uang(nama, jumlah, kategori));
        daftar.add(p);
    }


    /**
     * Menghitung total pengeluaran.
     *
     * @return total pengeluaran
     */
    @Override
    public double total() {
        double t = 0;
        for (Pengeluaran p : daftar) {
            t += p.jumlah;
        }
        return t;
    }
public void tampilkanBerdasarkanKategori(String kategori) {
        System.out.println("\nPengeluaran kategori: " + kategori);
        for (Pengeluaran p : daftar) {
            if (p.kategori.equalsIgnoreCase(kategori)) {
                p.tampilkanInfo();
            }
        }
    }
    /**
     * Menampilkan semua pengeluaran dan totalnya.
     */
    @Override
    public void tampilkanSemua() {
        System.out.println("Daftar Pengeluaran:");
        for (Pengeluaran p : daftar) {
            p.tampilkanInfo();
        }
        Tampilkanringkasan();
    }
    /**
     * Menampilkan total pengeluaran.
     */
    @Override
    public void Tampilkanringkasan() {
        System.out.println("Total Pengeluaran: Rp" + total());
    }
}

/**
 * Class kosong untuk pengembangan selanjutnya.
 */
public class App {
}
