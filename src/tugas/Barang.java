package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor lengkap
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk nama, harga, dan stok
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Method untuk menyimpan data ke baris berkas dengan pemisah semikolon (;)
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Method untuk menampilkan keterangan detail barang
    public String info() {
        return nama + " | Harga: Rp" + harga + " | Stok: " + stok;
    }
}