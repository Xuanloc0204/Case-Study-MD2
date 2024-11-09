package menu;

import src.Account;
import java.util.Scanner;

public class Login {
    public static void menuLogin() {
        Scanner scanner = new Scanner(System.in);


        int choice;
        do {
            System.out.println("-----Menu đăng nhập-----");
            System.out.println("1. Đăng nhập.");
            System.out.println("2. Đăng ký.");
            System.out.println("0. Thoát.");
            System.out.println("Nhập lựa chọn của bạn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập tài khoản: ");
                    String username = scanner.nextLine();
                    System.out.println("Nhập mật khẩu: ");
                    String password = scanner.nextLine();

                    Account.login(username, password);
                    break;

                case 2:
                    System.out.println("Chức năng đang được phát triển.");
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }

        } while (choice != 0);
    }
}
