package before;

import java.util.ArrayList;

public class KelolaUang {
    public ArrayList<Pengeluaran> daftar = new ArrayList<>();

    public void tambah(String nama, double jumlah, String kategori) {
        Pengeluaran p = new Pengeluaran(nama, jumlah, kategori);
        daftar.add(p);
    }

    public double total() {
        double t = 0;
        for (Pengeluaran p : daftar) {
            t += p.jumlah;
        }
        return t;
    }

    public void tampilkanSemua() {
        System.out.println("Daftar Pengeluaran:");
        for (Pengeluaran p : daftar) {
            p.tampil();
        }
        System.out.println("Total Pengeluaran: Rp" + total());
    }
}
