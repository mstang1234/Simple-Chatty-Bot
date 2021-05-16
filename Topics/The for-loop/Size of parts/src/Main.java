import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pf = 0;
        int lg = 0;
        int sm = 0;
        for (int i = 0; i < n; i++) {
            int part = scanner.nextInt();
            part = part == 0 ? pf++ : part == 1 ? lg++ : sm++;
        }
        System.out.printf("%d %d %d", pf, lg, sm);
    }
}