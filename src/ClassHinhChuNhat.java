import java.util.Scanner;

public class ClassHinhChuNhat {
    public static void main(String[] args) {
        // tạo hình chữ nhật
        /*HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.chieuDai = 3;
        hcn1.chieuRong = 4;

        System.out.printf("Chu vi = %.2f, diện tích = %.2f \n",
                hcn1.tinhChuVi(), hcn1.tinhDienTich());

        HinhChuNhat hcn2 = new HinhChuNhat(5,6);
        System.out.printf("Chu vi = %.2f, diện tích = %.2f \n",
                hcn2.tinhChuVi(), hcn2.tinhDienTich());*/

        // tạo HCN 3 -  với các dữ liệu nhập từ bàn phím -> in ra

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();


        // khai báo mảng
        HinhChuNhat[] arr = new HinhChuNhat[n];

        // nhập dữ liệu cho mảng
        for (int i = 0; i < n; i++) {
            // nhập các giá trị của mảng
            System.out.print("Hình chữ nhật thứ " + i);
            System.out.println("Nhập chiều dài : ");
            double chieuDai = scanner.nextDouble();
            System.out.println("Nhập chiều rộng : ");
            double chieuRong = scanner.nextDouble();
            // tạo đối tượng hình chữ nhật ở vị trí index i
            arr[i] = new HinhChuNhat(chieuDai,chieuRong);
        }
        // xuất mảng
        System.out.print("Các phần tử vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

        // In ra hinh chu nhat co dien tich lon nhat?

        double dtMax = arr[0].tinhDienTich();
        int vtMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (dtMax < arr[i].tinhDienTich()) {
                dtMax = arr[i].tinhDienTich();
                vtMax = i;
            }
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat la");
        System.out.println(arr[vtMax].toString());
        System.out.println("Dien tich max la " + dtMax);

        scanner.close();


    }
}
