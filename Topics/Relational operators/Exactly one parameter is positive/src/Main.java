import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean pos1 = a > 0 && b <= 0 && c <= 0;
        boolean pos2 = b > 0 && a <= 0 && c <= 0;
        boolean pos3 = c > 0 && b <= 0 && a <= 0;
        System.out.println(pos1 || pos2 || pos3);
    }
}