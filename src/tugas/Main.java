package tugas;

// Nama: MUHAMMAD RAFFLY ARRASYID
// NPM: 2410010443

public class Main {
    public static void main(String[] args) {
        // 1. Menyimpan dan menampilkan daftar nama kategori dalam array String ukuran tetap
        String[] kategori = {"Elektronik", "Pakaian", "Makanan"};
        System.out.println("== Kategori Barang Toko ==");
        for (String kat : kategori) {
            System.out.println("- " + kat);
        }
        System.out.println();

        // 2. Membuat objek Gudang pertama dan mengisinya dengan minimal 5 objek Barang
        Gudang gudangUtama = new Gudang("barang.txt");
        gudangUtama.tambahBarang(new Barang("Laptop Asus", 8500000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 150000, 20));
        gudangUtama.tambahBarang(new Barang("Keyboard Mekanik", 450000, 12));
        gudangUtama.tambahBarang(new Barang("Monitor LED", 1800000, 7));
        gudangUtama.tambahBarang(new Barang("Headset Gaming", 350000, 15));

        // Menampilkan data awal gudang pertama dan menyimpannya ke berkas
        System.out.println("--- Proses Gudang Utama ---");
        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();

        // 3. Membuat objek Gudang baru untuk membuktikan penyimpanan berkas berfungsi
        System.out.println("--- Proses Gudang Baru (Memuat dari Berkas) ---");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas(); // Memuat data dari barang.txt
        gudangBaru.tampilkanSemua(); // Menampilkan isi data hasil muat ulang
        
        // Menampilkan hasil kalkulasi total nilai persediaan
        System.out.println("Total Nilai Persediaan Gudang: Rp" + gudangBaru.totalNilai());
    }
}