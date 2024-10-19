import java.util.Scanner;

public class StudentGradebookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        String[] names = new String[n];
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter score of student " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        double highest = scores[0];
        double lowest = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
