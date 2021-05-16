import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean leap = num % 4 == 0 && num % 100 != 0 || num % 400 == 0;
        if (leap) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}