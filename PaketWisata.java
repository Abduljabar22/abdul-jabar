abstract class PaketWisata implements Paket {
    protected String nama;
    protected double harga;

    public PaketWisata(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public double hitungHarga() {
        return harga;
    }
}

