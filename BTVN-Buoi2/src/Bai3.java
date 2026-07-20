import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu : ");
        String Password = scanner.nextLine();

        String cleanedPassword = Password.trim();
        int length = cleanedPassword.length();

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < length; i++) {
            char c = cleanedPassword.charAt(i);
            if (c >= '0' && c <= '9') {
                hasDigit = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
        }
        if(length < 8 && hasDigit && hasUpper ){
            System.out.println("Mật khẩu không hợp lệ!!!");
        }
        if (length < 8) {
            System.out.println(" - Mật khẩu không đủ 8 ký tự");
        }
        if (!hasDigit) {
            System.out.println(" - Mật khẩu phải chứa ít nhất 1 số");
        }
        if (!hasUpper) {
            System.out.println(" - Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa");
        }
    }
}