import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.println("Silakan pilih jenis paket:");
            System.out.println("1. Paket Liburan");
            System.out.println("2. Paket Honeymoon");
            System.out.println("3. Keluar");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputPaketLiburan(scanner);
                    break;
                case 2:
                    inputPaketHoneymoon(scanner);
                    break;
                case 3:
                    lanjutkan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }

    private static void inputPaketLiburan(Scanner scanner) {
        System.out.print("Masukkan nama paket liburan:");
        String namaLiburan = scanner.next();
        System.out.print("Masukkan harga per hari: Rp. ");
        double hargaPerHari = scanner.nextDouble();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();
        PaketWisata paketLiburan = new PaketLiburan(namaLiburan, hargaPerHari, jumlahHari);
        System.out.println("Total harga paket liburan: Rp. " + paketLiburan.hitungHarga());
    }

    private static void inputPaketHoneymoon(Scanner scanner) {
        System.out.print("Masukkan nama paket honeymoon:");
        String namaHoneymoon = scanner.next();
        System.out.print("Masukkan harga: Rp. ");
        double hargaHoneymoon = scanner.nextDouble();
        System.out.print("Apakah ingin ditambahkan bunga mawar? (true/false):");
        boolean bungaMawar = scanner.nextBoolean();
        PaketWisata paketHoneymoon = new PaketHoneymoon(namaHoneymoon, hargaHoneymoon, bungaMawar);
        System.out.println("Total harga paket honeymoon: Rp. " + paketHoneymoon.hitungHarga());
    }
}