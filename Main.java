package PemlanKayla;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        DataMahasiswa dataMahasiswa = new DataMahasiswa();

        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.print("Masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan nama : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan alamat: ");
            String alamat = scanner.nextLine();

            dataMahasiswa.addMahasiswa(nim, nama, alamat);

            System.out.print("Tambah lagi? (y/n): ");
            String tambah = scanner.nextLine();

            if (!tambah.equalsIgnoreCase("y")) {
                next = false;
            }
        }

        System.out.println("==================================");
        dataMahasiswa.displayMahasiswa();
    }
}

