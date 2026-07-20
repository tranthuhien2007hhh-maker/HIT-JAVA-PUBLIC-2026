import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap x1 : ");
        int x1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap y1 : ");
        int y1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap x2 : ");
        int x2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap y2 : ");
        int y2 = Integer.parseInt(scanner.nextLine());

        double Distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Khoang cach giua 2 diem la : %.2f", Distance);

        scanner.close();
    }
}