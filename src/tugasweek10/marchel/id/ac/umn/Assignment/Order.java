package tugasweek10.marchel.id.ac.umn.Assignment;

public class Order {
    private String id;
    private int jumlah;
    private Barang barang;
    public static double total;
    private double totalOrder;

    public Order() {}

    public Order(String id, Barang barang, int jumlah) {
        this.id = id;
        this.barang = barang;
        this.jumlah = jumlah;
        if (barang instanceof Voucher) {
            this.totalOrder = jumlah * ((Voucher) barang).getHargaJual();
        } else {
            this.totalOrder = jumlah * barang.getHarga();
        }
        Order.total = this.totalOrder;
    }

    public String getId() {
        return id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Barang getBarang() {
        return barang;
    }

    public double getTotal() {
        return totalOrder;
    }
}

