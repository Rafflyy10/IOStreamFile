package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {

    public static void main(String[] args) {

        File berkas = new File("sementara.txt");

        try {

            berkas.createNewFile();

            System.out.println(
                    "Sebelum hapus : "
                    + berkas.exists());

            berkas.delete();

            System.out.println(
                    "Sesudah hapus : "
                    + berkas.exists());

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }
}