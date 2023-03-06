import java.util.Scanner;

public class bai_116 {

    public static int tinhTong(int n){
        if (n < 1){
            return - 1;
        }
        int sum = 0;
        for (int i = 1; i <= n ; i++ ){
            sum += i;
        }
        return sum;
    }

    public static int tinhTongBinhPhuong(int n){
        if (n < 1){
            return -1;
        }
        int sum = 0;
        for (int i = 1; i <= n ; i++ ){
            sum += i*i;
        }
        return sum;
    }

    public static void ktSoNguyenTo(int n){
        int count = 0;
        for (int i = 2; i<= Math.sqrt(n); i++){
            if (n % i == 0){
                count++;
            }
        }
        if (count == 0){
            System.out.println(n + " là số nguyên tố" );
        }else {
            System.out.println(n + " kp là số nguyên tố" );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập n = ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("S(n) = " + tinhTong(n));
        System.out.println("S(n)^2 = " +  tinhTongBinhPhuong(n));

        ktSoNguyenTo(n);
    }

}
