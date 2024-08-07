import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("First parameter");
            int p01 = scanner.nextInt();
            System.out.println("Second parameter");
            int p02 = scanner.nextInt();
            count(p01, p02);
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
    public static void count(int p01, int p02) {
        if (p01 > p02) {
            throw new RuntimeException("Error");
        }
        for (int i = 1; i <= (p02 - p01); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
