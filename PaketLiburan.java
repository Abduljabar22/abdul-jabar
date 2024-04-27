// Kelas turunan pertama dari PaketWisata
class PaketLiburan extends PaketWisata {
    private int jumlahHari;

    public PaketLiburan(String nama, double harga, int jumlahHari) {
        super(nama, harga);
        this.jumlahHari = jumlahHari;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlahHari;
    }
}

