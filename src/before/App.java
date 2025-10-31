package before;

public class App {
    public static void main(String[] args) {
        KelolaUang k = new KelolaUang();
        k.tambah("Makan Siang", 25000, "Makanan");
        k.tambah("Ojek Online", 15000, "Transportasi");
        k.tambah("Kopi", 10000, "Minuman");
        k.tampilkanSemua();
    }
}
