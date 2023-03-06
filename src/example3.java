import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        // tạo đối tượng
        /*Dog d1 = new Dog();
        d1.id = 1;
        d1.name = "Pitbull";
        d1.color = "Black";
        d1.age = 2;

        // hành vi
        d1.eat();
        d1.run();*/
        // tạo đối tượng d2 - dữ liệu nhập từ bàn phím
        // dùng các phương thức : run(), eat(), sleep()
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào id: ");
        String id = scanner.nextLine();
        System.out.print("Nhập vào name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập vào color: ");
        String color = scanner.nextLine();
        System.out.print("Nhập vào tuổi: ");
        String age = scanner.nextLine();
        scanner.close();
        Dog d2 = new Dog();
        d2.id = Integer.parseInt(id);
        d2.name = name;
        d2.color = color;
        d2.age = Integer.parseInt(age);
        System.out.println("Dữ liệu vừa nhập là : ");
        System.out.println(id);
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
        d2.eat();
        d2.run();
        d2.sleep();
    }

}
