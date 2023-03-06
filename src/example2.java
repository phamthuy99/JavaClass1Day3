import java.util.Random;

public class example2 {
    //1. Hàm không có giá trị trả về và không có tham số.
    public static void sayHello(){
        System.out.println("Helllo");
    }
    //2.Hàm không có giá trị trả về và có tham số
    public  static void sayHello(String language){
        System.out.println("hello, welcome to" + language);
    }
    //3. Hàm có giá trị trả về và không có tham số (OOP  - dùng nhiều hơn)
    public static int getRandomNumber(){
        return new Random().nextInt(1000);
    }
    //4. Hàm có giá trị trả về và có tham số
    // viết hàm tính tổng 2 số thực
    public static double sumAB(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        sayHello();
        sayHello(" oho");
        // những hàm có giá trị trả về nhưng k có tham số truyền vào
        int num1 = getRandomNumber();
        int num2 = getRandomNumber();
        int t = num1 + num2;
        System.out.println("t = "+ t);

        // tính tổng 3 số: x,y,z
        double x = 1.5, y = 2.5, z = 10.5;
        double k = sumAB(sumAB(x,y), z);
        System.out.println("tổng 3 tham số : "+ k);

    }
}
