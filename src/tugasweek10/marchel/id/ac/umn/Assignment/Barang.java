package tugasweek10.marchel.id.ac.umn.Assignment;

public class Barang {
    private String id;
    private double harga;
    private String nama;
    private int stok;

    public Barang(String id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public void minusStok(int jumlah) {
        this.stok -= jumlah;
        if (this.stok < 0) this.stok = 0;
    }
}
