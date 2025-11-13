package tugasweek10.marchel.id.ac.umn.Downcasting;

public class main {
    public static void main(String[] args) {
        CEO c = new CEO();
        Pekerja p = new CEO();
        c = (CEO) p;
        c.tanyaPendapatan();
    }
}
