import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng học sinh : ");
        int n = Integer.parseInt(scanner.nextLine());

        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm học sinh thứ " + (i + 1) + " : ");
            scores[i] = Double.parseDouble(scanner.nextLine());
        }
        double max = findMax(scores);
        double average = calculateAverage(scores);
        int failed = countFailedStudents(scores);

        System.out.println("Điểm cao nhất: " + max);
        System.out.printf("Điểm trung bình: %.2f%n", average);
        System.out.println("Số học sinh dưới trung bình(< 5.0): " + failed);

        scanner.close();
    }

        public static double findMax(double[] arr) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public static double calculateAverage(double[] arr) {
            double sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum / arr.length;
        }

        public static int countFailedStudents(double[] arr) {
            int count = 0;
            for (double score : arr) {
                if (score < 5) {
                    count++;
                }
            }
            return count;
        }
}