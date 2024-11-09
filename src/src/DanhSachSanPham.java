package src;

import java.util.ArrayList;

public class DanhSachSanPham {
    private static ArrayList<SanPham> danhSach = new ArrayList<>();;


    public static void themSanPham(SanPham sp) {
        danhSach.add(sp);
        System.out.println("Thêm sản phẩm thành công.");
    }

    public static void hienThiDanhSachSp() {
        if (danhSach.isEmpty()) {
            System.out.println("Không có sản phẩm nào.");
        } else {
            for (SanPham sanPham : danhSach) {
                System.out.println(sanPham);
            }
        }
    }

    public static void capNhatSP(String id, String tenSanPham, String hangSanXuat, double giaTien, int soLuong) {
        SanPham sanPhamUpda = null;
        for (SanPham sanPham : danhSach) {
            if (sanPham.getId().equals(id)) {
              sanPhamUpda = sanPham;
              break;
            }
        }
        if(sanPhamUpda == null) {
            System.out.println("Không tìm thấy sản phẩm để cập nhật.");
            return;
        }
            sanPhamUpda.setTenSanPham(tenSanPham);
            sanPhamUpda.setHangSanXuat(hangSanXuat);
            sanPhamUpda.setGiaTien(giaTien);
            sanPhamUpda.setSoLuong(soLuong);
            System.out.println("Cập nhật sản phẩm thành công.");
    }

    public static void xoaSanPham(String id) {
        for (SanPham sanPham : danhSach) {
            if (sanPham.getId().equals(id)) {
                danhSach.remove(sanPham);
                System.out.println("Xóa sản phẩm thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với id: " + id);
    }

    public static SanPham timSanPhamTheoId(String id) {
        for (SanPham sanPham : danhSach) {
            if (sanPham.getId().equals(id)) {
                return sanPham;
            }
        }
        return null;
    }
}