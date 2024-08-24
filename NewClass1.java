
import java.util.Scanner;


public class NewClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        
        System.out.println("Nhập số nguyên thứ hai: ");
         int b = scanner.nextInt();
         
         int sum = a + b;
         int diference = a - b;
         int qroduct = a * b;
         int quotient = a / b;
         int remainder = a % b ;
         
         System.out.println("Tổng: " + a + " + " + b + " = " + sum);
         System.out.println("Hiệu: " + a + " - " + b + " = " + diference);
         System.out.println("Tích: " + a + " * " + b + " = " + qroduct);
         System.out.println("Thương: " + a + " / " + b + " = " + quotient);
         System.out.println("Lấy phần dư: " + a + " % " + b + " = " + remainder);
    }
    
}
