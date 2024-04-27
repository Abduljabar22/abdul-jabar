// Kelas turunan kedua dari PaketWisata
class PaketHoneymoon extends PaketWisata {
    private boolean bungaMawar;

    public PaketHoneymoon(String nama, double harga, boolean bungaMawar) {
        super(nama, harga);
        this.bungaMawar = bungaMawar;
    }

    @Override
    public double hitungHarga() {
        if (bungaMawar) {
            return harga * 1.1; // Harga paket honeymoon dengan bunga mawar
        } else {
            return harga; // Harga paket honeymoon tanpa bunga mawar
        }
    }
}
