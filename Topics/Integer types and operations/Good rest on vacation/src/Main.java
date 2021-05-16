import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int fly = scanner.nextInt();
        int night = scanner.nextInt();
        int costTotal = duration * food + 2 * fly + (duration - 1) * night;
        System.out.println(costTotal);
    }
}
