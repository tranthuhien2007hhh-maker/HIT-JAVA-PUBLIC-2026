import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập : Mã_số - Họ_tên - Năm_sinh - Phòng_ban");
        String ifmt = scanner.nextLine().trim();

        String[] parts = ifmt.split("-");
        String codeNumber = parts[0].trim().toUpperCase();
        String name = parts[1].trim();
        String born = parts[2].trim();
        String department = parts[3].trim();

        name = name.toLowerCase();
        name = name.replaceAll("\\s+", " ");

        String[] words = name.split(" ");
        String fullName = "";

        for (String word : words) {
            fullName += Character.toUpperCase(word.charAt(0))
                    + word.substring(1) + " ";
        }

        fullName = fullName.trim();

        int age = 2026 - Integer.parseInt(born);

        String pb = department.toLowerCase();

        if (pb.contains("kỹ thuật") || pb.contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }

        System.out.println("Mã nhân viên: " + codeNumber
                + "\nHọ và tên: " + fullName
                + "\nTuổi: " + age
                + "\nBộ phận: " + department);
        scanner.close();
    }
}