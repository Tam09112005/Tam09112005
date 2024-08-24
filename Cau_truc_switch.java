
package com.mycompany.cau_truc_switch;

import java.util.Scanner;


public class Cau_truc_switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        
        System.out.println("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();
        
        int sum = a+b;
        int diference = a-b;
        int quotient = a/b;
        int remaindr = a%b;
        
        System.out.println("Tổng: " + a +" + " + b + " = " + sum);
        System.out.println("Hiệu: " + a + " - " + b + " = " + diference);
        String produtct = null;
        System.out.println("Tích: " + a + " * " + b + " = " + produtct);
        System.out.println("Thương: " + a + " / " + b +" = " + quotient );
        System.out.println("Phần dư:" + a + " % " + b +" = " +remaindr );
        System.out.println("Hello World!");
    }
}
