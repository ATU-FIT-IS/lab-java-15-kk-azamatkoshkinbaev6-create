import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Массив өлшемін енгізу
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        // Массив элементтерін енгізу
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        // Орташа мәнін есептеу
        double average = (double) sum / n;

        // Нәтижені шығару
        System.out.println(average);
        scanner.close();
    }
}