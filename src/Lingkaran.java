public class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getLuas() {
        return Math.round(Math.PI * jariJari * jariJari);
    }

    @Override
    public double getKeliling() {
        return Math.round(2 * Math.PI * jariJari);
    }

    public void print() {
        super.print();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println();
    }
}
