package vn.plusplus.activity81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DocumenntManagement documenntManagement = new DocumenntManagement();
        while (true) {
            System.out.print("Lựa chọn: \n" +
                    "1: Thêm mới tài liệu\n" +
                    "2: Hiển thị thông tin về tài liệu\n" +
                    "3: Xoá tài liệu theo mã tài liệu\n" +
                    "4: Tìm kiếm tài liệu theo thể loại\n" +
                    "5: Thoát khỏi chương trình\n" +
                    "Nhập vào command bạn muốn thực hiện: ");
            int n = input.nextInt();
            input.nextLine();
            switch (n) {
                case 1:
                    documenntManagement.addDocument();
                    break;
                case 2:
                    documenntManagement.output();
                    break;
                case 3:
                    documenntManagement.removeDocument();
                    break;
                case 4:
                    documenntManagement.findDocument();
                    break;
                case 5:
                    documenntManagement.Exit();
                    break;
                default:
                    System.err.println("Nhap sai!!!");
                    break;
            }
        }
    }
}
