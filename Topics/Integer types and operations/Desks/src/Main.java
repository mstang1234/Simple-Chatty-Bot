import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] cls = new int[3];
        int desks = 0;
        for (int i = 0; i < 3; i++) {
            cls[i] = scanner.nextInt();
            desks += cls[i] / 2 + cls[i] % 2;
        }
        System.out.println(desks);
    }
}