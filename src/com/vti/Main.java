package com.vti;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Buoi 1, Kieu du lieu trong Java");
        System.out.println("Primitive: ");

        // Khai báo biến x kiểu dữ liệu là byte, và nhận giá trị bằng 5
        byte x = 5;

        // Thực hiện in giá trị của biến x ra màn hình
        System.out.println("Bạn vừa khai báo biến byte x có giá trị = " + x);

        int y = 100;
        System.out.println("Bạn vừa khai báo biến int y có giá trị = " + y);

        // Khai báo số thập phân:
        float z = 5.5f;
        System.out.println("Bạn vừa khai báo biến float z có giá trị = " + z);

        double j = 100.55;
        System.out.println("Bạn vừa khai báo biến double j có giá trị = " + j);

        // Khai báo kiểu char
        char a = 'A';
        System.out.println("Bạn vừa khai báo biến char a có giá trị = " + a);

        // Khai báo kiểu dữ liệu boolean
        boolean f = true;
        System.out.println("Bạn vừa khai báo biến boolean f có giá trị = " + f);

        // Khai báo kiểu dữ liệu thời gian
        Date today = new Date();
        System.out.println("Bạn vừa khai báo biến Date today có giá trị = " + today);

        // Khai báo ra 1 danh sách số nguyên
        int[] listNumber = {10, 20, 30, 40};
        for(int i : listNumber){
            System.out.print(i);
            System.out.print(" | ");
        }
        // Xuống dòng bằng lệnh 46
        System.out.println();
        // Khai báo ra 1 danh sách tên
        String[] listName = {"Vinh", "Nghi", "Hải", "Trung", "Long"};
        for(String s : listName){
            System.out.print(s);
            System.out.print(" | ");
        }

    }
}
