/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phep_toan;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Phep_toan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số nguyên thứ nhât: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        // Thực hiện các phép toán
        int sum = num1 + num2;           // Phép cộng
        int difference = num1 - num2;    // Phép trừ
        int product = num1 * num2;       // Phép nhân
        int quotient = num1 / num2;      // Phép chia
        int remainder = num1 % num2;     // Phép chia lấy dư

      
        System.out.println("Tổng: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Hiệu: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Tích: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Thương: " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Phần dư: " + num1 + " % " + num2 + " = " + remainder);
    }
}
