package menu;

import src.DanhSachSanPham;
import src.SanPham;

import java.util.Scanner;

public class MenuKhachHang {
    public static void menuKhachHang() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Hiển Thị Sản Phẩm.");
            System.out.println("2. Tìm kiếm sản phẩm theo ID.");
            System.out.println("3. Giỏ Hàng.");
            System.out.println("0. Đăng xuất.");
            System.out.println("Nhập lựa chọn của bạn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    DanhSachSanPham.hienThiDanhSachSp();
                    System.out.println("---------------------------------------");
                    break;
                case 2:
                    System.out.print("Nhập mã sản phẩm để tìm: ");
                    String idCanTim = scanner.nextLine();
                    SanPham spCanTim = DanhSachSanPham.timSanPhamTheoId(idCanTim);
                    if (spCanTim != null) {
                        System.out.println("Sản phẩm tìm thấy: " + spCanTim);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với mã ID: " + idCanTim);
                    }
                    break;

                case 3:
                    System.out.println("Chức năng đang được phát triển.");
                    break;
                case 0:
                    Login.menuLogin();
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        } while (choice != 0);
    }
}
