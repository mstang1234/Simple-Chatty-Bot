import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] numbs = new int[6];
        for (int i = 0; i < 6; i++) {
            numbs[i] = scanner.nextInt();
        }
        int a = numbs[0] * 3600 + numbs[1] * 60 + numbs[2];
        int b = numbs[3] * 3600 + numbs[4] * 60 + numbs[5];
        System.out.println(b - a);
    }
}