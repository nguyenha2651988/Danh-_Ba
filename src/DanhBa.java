import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DanhBa {

    public static void main(String[] args) {
        DanhBa danhBa = new DanhBa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("App Danh Ba");
        System.out.println("===");
        System.out.println("1: xem danh ba");
        System.out.println("2: lưu số");
        System.out.println("3: sửa ");
        System.out.println("4: xóa");
        System.out.println("0: thoát");
        int number = scanner.nextInt();
        while (number < 0 || number > 4) {
            System.out.println("xem lại hướng dẫn sử dụng Và nhập lại");
            System.out.println("1: xem danh ba");
            System.out.println("2: lưu số");
            System.out.println("3: sửa ");
            System.out.println("4: xóa");
            System.out.println("0: thoát");
            number = scanner.nextInt();
        }
        while (number != 0) {
            switch (number) {
                case 1:
                    danhBa.xemDanhBa();
                    number = scanner.nextInt();
                    break;
                case 2:
                    danhBa.them();
                    number = scanner.nextInt();
                    break;
                case 3:
                    danhBa.sua();
                    number = scanner.nextInt();
                    break;
                case 4:

                    danhBa.xoa();
                    number = scanner.nextInt();
                    break;
            }
        }
        if (number == 0) {
            System.out.println("đã thoát chương trình");
        }


    }


    Set<NguoiDung> taoMoi = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void them() {
        System.out.println("nhập  tên");
        String ten = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("nhập SDT");
        String sdt = scanner.nextLine();
        NguoiDung nguoiDung = new NguoiDung(ten, diaChi, sdt);
        if (taoMoi.add(nguoiDung)) {
            System.out.println("thêm mới thành công");
        } else {
            System.out.println("thêm mới thất bại");
        }
    }

    public void xemDanhBa() {
        for (NguoiDung nguoiDung : taoMoi) {
            System.out.println(nguoiDung);
        }
    }

    public void xoa() {
        System.out.println("nhập số muốn xóa");
        String sdt = scanner.nextLine();
        for (NguoiDung nguoiDung : taoMoi) {
            if (sdt.equals(nguoiDung.getSdt())) {
                taoMoi.remove(nguoiDung);
                System.out.println("Xóa thành công!");
                System.out.println(taoMoi);
                break;
            }
        }
    }

    public void sua() {
        System.out.println("nhập số muốn sửa");
        String sdt = scanner.nextLine();
        for (NguoiDung nguoiDung : taoMoi) {
            if (sdt.equals(nguoiDung.getSdt())) {
                System.out.println("sửa lại tên");
                String suaTen = scanner.nextLine();
                nguoiDung.setTen(suaTen);
                System.out.println("sửa lại địa chỉ");
                String suaDiaChi = scanner.nextLine();
                nguoiDung.setDiaChi(suaDiaChi);
                System.out.println("sửa lại SDT");
                String suaSdt = scanner.nextLine();
                nguoiDung.setSdt(suaSdt);
                System.out.println("Sửa thành công!");
                System.out.println(taoMoi);
                break;
            }
        }
    }
}
