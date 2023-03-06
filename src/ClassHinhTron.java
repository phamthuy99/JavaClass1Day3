import java.util.Scanner;

public class ClassHinhTron {
    public static void main(String[] args) {
        // nhập số phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n : ");
        int n = scanner.nextInt();

        HinhTron [] arr = new HinhTron[n];
        double pi = 3.14;
        // nhập mảng
        for (int i = 0; i < n; i++){
            System.out.println("Nhập vào phần tử thứ "+i);
            System.out.print("Nhập vào bán kính : ");
            double r = scanner.nextDouble();
            arr[i] = new HinhTron(r,pi);
        }
        // xuất mảng
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i].toString());
        }
        // chu vi lớn nhất
        double cvMax = arr[0].tinhChuVi();
        int vtMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (cvMax < arr[i].tinhChuVi()) {
                cvMax = arr[i].tinhChuVi();
                vtMax = i;
            }
        }
        System.out.println("Hinh tròn có chu vi lớn nhất là ");
        System.out.println(arr[vtMax].toString());
        System.out.println("Chu vi lớn nhất là " + cvMax);

        // diện tích bé nhất
        double cvMin = arr[0].tinhDienTich();
        int vtMin = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i].tinhDienTich() < cvMin){
                cvMin = arr[i].tinhDienTich();
                vtMin = i;
            }
        }
        System.out.println("Hình tròn có diện tích min: ");
        System.out.println(arr[vtMin].toString());
        System.out.println("Diện tích nhỏ nhất là: " + cvMin);


        // tính trung bình cộng chu vi
        double sum = arr[0].tinhChuVi();
        double trungbinh = 0;
        int count = 0;
        for (int i = 1; i < n; i++){
            sum += arr[i].tinhChuVi();
            trungbinh = sum/n;
            if (arr[i].tinhChuVi() > trungbinh){
                count++;
            }
        }
        System.out.println("Trung bình cộng của tổng các chu vi là : " + trungbinh);
        // có bao nhiêu hình có chu vi lớn hơn tbc chu vi
        System.out.println("Có " +count+ " có chu vi lớn hơn TBC");
        // sắp xếp theo bán kính tăng dần
        for(int i = 0; i < n; i++){
            System.out.println("ban kinh tang dan la: " + arr[i].toString());
        }

        scanner.close();
    }

}
