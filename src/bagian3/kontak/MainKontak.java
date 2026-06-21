package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // 1. Membuat objek pengelola dan mengisinya (ditambah data email) [cite: 303, 324]
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));

        System.out.println("--- Tampilan Awal ---");
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        // 2. Menguji Latihan 1: Cari Kontak 
        System.out.println("--- Pengujian Cari Kontak ---");
        buku.cariKontak("Budi"); // Uji kontak yang ada [cite: 390]
        buku.cariKontak("Dedi"); // Uji kontak yang tidak ada
        System.out.println();

        // 3. Menguji Latihan 3: Hapus Kontak [cite: 325]
        System.out.println("--- Pengujian Hapus Kontak ---");
        buku.hapusKontak("Andi"); // Menghapus Andi dan otomatis simpan ke berkas [cite: 325]
        System.out.println();

        // 4. Membuktikan data diperbarui di objek baru dengan memuat dari berkas [cite: 298]
        System.out.println("--- Memuat Ulang Objek Baru dari Berkas ---");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua(); // Andi harusnya sudah tidak ada di sini
        System.out.println("Jumlah kontak saat ini: " + bukuLain.jumlahKontak());
    }
}