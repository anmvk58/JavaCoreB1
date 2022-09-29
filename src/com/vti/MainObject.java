package com.vti;

public class MainObject {
    public static void main(String[] args) {
        //Khởi tạo đối tượng Student:
        Student student1 = new Student();

        // Gán các giá trị thuộc tính cho đối tượng vừa khởi tạo
        student1.hoTen = "Nguyễn Văn A";
        student1.tuoi = 18;
        student1.queQuan = "Hà Nội";
        student1.gioiTinh = GioiTinh.MALE;
        student1.canCuocCongDan = "0123456789";

        // In ra thông tin của student 1:
        System.out.println("Họ tên: " + student1.hoTen);
        System.out.println("Tuổi: " + student1.tuoi);
        System.out.println("Quê quán: " + student1.queQuan);
        System.out.println("Giới tính: " + student1.gioiTinh);
        System.out.println("CCCD: " + student1.canCuocCongDan);
    }
}
