import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 1) {
            System.out.println("no army");
        } else if (num < 20) {
            System.out.println("pack");
        } else if (num < 250) {
            System.out.println("throng");
        } else if (num < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}