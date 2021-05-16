import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if (weekend) {
            System.out.println(num >= 15 && num <= 25);
        } else {
            System.out.println(num >= 10 && num <= 20);
        }
    }
}