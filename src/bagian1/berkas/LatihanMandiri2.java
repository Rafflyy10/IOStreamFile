package bagian1.berkas;

import java.io.File;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        File folder = new File("arsip");

        boolean berhasil = folder.mkdir();

        if (berhasil) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat (mungkin sudah ada).");
        }
    }
}