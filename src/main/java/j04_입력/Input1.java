package j04_입력;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        String phone = null;
        String address = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        name = scanner.nextLine();
        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("연락처: ");
        phone = scanner.nextLine();
        System.out.print("주소: ");
        address = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소: " + address);
    }
}
