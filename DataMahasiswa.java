package PemlanKayla;

import java.util.ArrayList;

public class DataMahasiswa {
    private ArrayList<Mahasiswa> mahasiswas;

    public DataMahasiswa() {
        mahasiswas = new ArrayList<>();
    }

    public void addMahasiswa(String nim, String nama, String alamat) {
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
        mahasiswas.add(mahasiswa);
    }

    public void displayMahasiswa() {
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println(mahasiswa.toString());
        }
    }
}
