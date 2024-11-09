package menu;

import src.DanhSachSanPham;
import src.SanPham;

import java.util.Scanner;

public class ChucNang {
    public static void menuChucNang() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----Quản lý sản phẩm-----");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Hiển thị sản phẩm.");
            System.out.println("3. Cập nhật sản phẩm.");
            System.out.println("4. Tìm sản phẩm theo ID.");
            System.out.println("5. Xóa sản phẩm.");
            System.out.println("0. Đăng xuất.");
            System.out.println("Nhập lựa chọn của bạn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sản phẩm:");

                    System.out.println("Nhập ID sản phẩm:");
                    String id = scanner.nextLine();

                    System.out.println("Nhập tên sản phẩm:");
                    String tenSanPham = scanner.nextLine();

                    System.out.println("Nhập hãng sản xuất:");
                    String hangSanXuat = scanner.nextLine();

                    System.out.println("Nhập giá tiền:");
                    double giaTien = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Nhập số lượng:");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();

                    SanPham sp = new SanPham(id, tenSanPham, hangSanXuat, giaTien, soLuong);
                    DanhSachSanPham.themSanPham(sp);
                    break;
                case 2:
                    DanhSachSanPham.hienThiDanhSachSp();
                    System.out.println("---------------------------------------");
                    break;
                case 3:
                    System.out.println("Nhập ID sản phẩm để cập nhật: ");
                    String ID = scanner.nextLine();

                    System.out.println("Nhập tên mới: ");
                    String NameMoi = scanner.nextLine();

                    System.out.println("Nhập tên hãng sản xuất mới: ");
                    String hangSanXuatMoi = scanner.nextLine();

                    System.out.println("Nhập giá mới: ");
                    double giaTienMoi = Double.parseDouble(scanner.nextLine());

                    System.out.println("Nhập số lượng mới: ");
                    int soLuongMoi = Integer.parseInt(scanner.nextLine());

                    DanhSachSanPham.capNhatSP(ID, NameMoi, hangSanXuatMoi, giaTienMoi, soLuongMoi);
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm để tìm: ");
                    String idCanTim = scanner.nextLine();
                    SanPham spCanTim = DanhSachSanPham.timSanPhamTheoId(idCanTim);
                    if (spCanTim != null) {
                        System.out.println("Sản phẩm tìm thấy: " + spCanTim);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với mã: " + idCanTim);
                    }
                    break;

                case 5:
                    System.out.print("Nhập ID sản phẩm để xóa: ");
                    String idCanXoa = scanner.nextLine();
                    DanhSachSanPham.xoaSanPham(idCanXoa);
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
