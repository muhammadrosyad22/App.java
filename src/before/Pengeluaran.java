package before;

public class Pengeluaran {
    public String nama;
    public double jumlah;
    public String kategori;

    public Pengeluaran(String nama, double jumlah, String kategori) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.kategori = kategori;
    }

    public void tampil() {
        System.out.println(nama + " - " + kategori + " - Rp" + jumlah);
    }
}
