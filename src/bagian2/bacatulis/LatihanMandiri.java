package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        // 1. Menulis 5 nama hari ke hari.txt, lalu membaca dan menampilkan ke layar
        System.out.println("--- Nomor 1: Menulis & Membaca 5 Hari ---");
        String[] hariAwal = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hariAwal) {
                penulis.println(h);
            }
            System.out.println("Berhasil menulis 5 nama hari ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            System.out.println("Isi berkas hari.txt saat ini:");
            while ((baris = pembaca.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        
        System.out.println();

        // 2. Menambahkan (append) 2 nama hari lagi tanpa menghapus isi sebelumnya
        System.out.println("--- Nomor 2: Menambah (Append) 2 Hari ---");
        String[] hariTambahan = {"Sabtu", "Minggu"};
        
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            for (String h : hariTambahan) {
                penulis.println(h);
            }
            System.out.println("Berhasil menambahkan Sabtu dan Minggu ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            System.out.println("Isi berkas hari.txt setelah diperbarui:");
            while ((baris = pembaca.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        System.out.println();

        // 3. Membaca berkas hari.txt lalu menghitung berapa banyak baris di dalamnya
        System.out.println("--- Nomor 3: Menghitung Jumlah Baris ---");
        int jumlahBaris = 0;
        
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Total jumlah baris di dalam hari.txt: " + jumlahBaris + " baris");
        } catch (IOException e) {
            System.out.println("Gagal menghitung baris: " + e.getMessage());
        }
    }
}