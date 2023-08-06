public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void print() {
        super.print();
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println();
    }
}
