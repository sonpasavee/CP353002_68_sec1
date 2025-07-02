import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ใช้สำหรับรับข้อมูลจากผู้ใช้

        System.out.print("ป้อนตัวเลขตัวแรก: ");
        int num1 = scanner.nextInt();

        System.out.print("ป้อนตัวเลขตัวที่สอง: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        
        System.out.println("ผลรวมคือ: " + sum);
        System.out.println("ผลคูณ : " + calNumber(5, 10));
    }
    public static int calNumber(int a , int b) {
            int c;
            c = a*b;
            return c; 
        }
}
