import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 10;
        System.out.println(a + b + c);
    }
}