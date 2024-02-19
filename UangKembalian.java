import java.util.Scanner;

public class UangKembalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();
        System.out.print("Masukkan jumlah uang yang diberikan: ");
        double jumlahUang = input.nextDouble();
        double kembalian = jumlahUang - hargaBarang;

        System.out.println("Uang kembalian: " + kembalian);

        input.close();
    }
}