import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Độ dài cạnh a : ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Độ dài cạnh b : ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Độ dài cạnh c : ");
        int c = Integer.parseInt(scanner.nextLine());

        if(a+b<c || a+c<b || b+c<a ) {
            System.out.print("khong hop le.");
        }else {
            double Perimeter = a + b + c;
            double p = (a + b + c) / 2.0;
            double Area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Day la tam giac thuong %n");
            System.out.printf("Chu vi tam giac la : " + Perimeter + "%n");
            System.out.printf("Dien tich tam giac la : " + Area + "%n");
        }
        scanner.close();
    }
}