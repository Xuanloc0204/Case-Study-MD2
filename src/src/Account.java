package src;

import menu.ChucNang;
import menu.MenuKhachHang;


public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void login(String username, String password) {
        if (username.equals("admin") && password.equals("***")) {
            System.out.println("Đăng nhập thành công!");
            ChucNang.menuChucNang();
            System.out.println("---------------------------------------");

        } else if (username.equals("user1") && password.equals("***")) {
            System.out.println("Đăng nhập thành công!");
            MenuKhachHang.menuKhachHang();
            System.out.println("---------------------------------------");

        } else {
            System.out.println("Tài khoản hoặc mật khẩu không hợp lệ.");
        }
    }
}
