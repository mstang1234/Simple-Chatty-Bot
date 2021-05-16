import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum1 = a + b;
        int sum2 = a + c;
        int sum3 = b + c;
        boolean sum = sum1 == 20 || sum2 == 20 || sum3 == 20;
        System.out.println(sum);
    }
}