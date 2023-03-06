public class HinhTron {
    double r;
    double pi = 3.14;

    public HinhTron() {
    }

    public HinhTron(double r, double pi) {
        this.r = r;
        this.pi = pi;
    }

    public double tinhChuVi(){
        return 2*pi*r;
    }

    public double tinhDienTich(){
        return pi*r*r;
    }

    public double tinhTBCChuViHinhTron(){
        return (r*2)*pi;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                ", pi=" + pi +
                '}';
    }

}
