import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int maks = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = min; i <= maks; i++) {
            if (i % 3 == 0) {
                sum += i;
                count += 1;
            }
        }
        double avg = (double) sum / (double) count;
        System.out.println(avg);
    }
}