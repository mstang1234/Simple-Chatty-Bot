import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] grade = new int[n];
        for (int i = 0; i < n; i++) {
            grade[i] = scanner.nextInt();
        }
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (grade[i] == 2) {
                d++;
            } else {
                if (grade[i] == 3) {
                    c++;
                } else {
                    if (grade[i] == 4) {
                        b++;
                    } else {
                        a++;
                    }
                }
            }
        }
        System.out.printf("%d %d %d %d", d, c, b, a);
    }
}