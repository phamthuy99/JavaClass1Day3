public class bai_117 {
    // Viet ham tinh a ^ b (b la so nguyen)
    // Ten ham + tham so: luyThua(double a, int b)
    // gia tri tra ve double

    // 3 ^ 2 = 3 * 3
    // 3 ^ 3 = 3 * 3 * 3
    // 3 ^ -2 ?  = 1/ 3^2

    public static double luyThua(double a, int b) {
        // Tri tuyet doi cua b
        if (b == 0) return 1;
        int _b = Math.abs(b);
        double t = 1;
        for (int i = 0; i < _b; i++) {
            t = t * a;
        }
        if (b > 0) {
            return t;
        }
        return 1 / t;
    }

    public static void main(String[] args) {
        /*
        // Test thu xem ham chay dung hay sai?
        // -1, 0, 2
        System.out.println(luyThua(5, -1)); //0.2
        System.out.println(luyThua(1.2342, 0)); // 1
        System.out.println(luyThua(2, 2)); // 4
         */
        double x = 1.5;
        int n = 3;

        double tmp = 0;
        for (int i = 1; i <= n; i++) {
            tmp = tmp + luyThua(x, i);
        }
        System.out.println("Sn = " + tmp);

    }
}
