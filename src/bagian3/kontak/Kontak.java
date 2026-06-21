package bagian3.kontak;

public class Kontak {
    private String nama;
    private String nomor;
    private String email; // Tambahan atribut email 

    // Constructor yang disesuaikan 
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    // Getter untuk email 
    public String getEmail() {
        return email;
    }

    // Menggunakan pemisah titik koma untuk 3 data 
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Menampilkan keterangan lengkap termasuk email 
    public String info() {
        return nama + " | " + nomor + " | " + email;
    }
}