import java.util.Scanner;

public class SoDx {
    public static boolean CheckSoDx(int n) {
        String chuoiSo = String.valueOf(n);
        int count  = chuoiSo.length();
        int sum =0;
        while (n > 0) {
            int songuoc = n%10;
            n/=10;
             sum += songuoc*Math.pow(10.0, --count);
        }
        if (n == sum) {
            return true;
        }return false;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so: ");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        boolean check = CheckSoDx(n);
        if (!check) {
            System.out.println("La so doi xung");
        } else {
            System.out.println("Khong phai so doi xung");
        }
    }
}
