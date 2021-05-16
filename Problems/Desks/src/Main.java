import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstGroup = scanner.nextInt();
        int desks1Group = firstGroup / 2 + firstGroup % 2;
        int secondGroup = scanner.nextInt();
        int desks2Group = secondGroup / 2 + secondGroup % 2;
        int thirdGroup = scanner.nextInt();
        int desks3Group = thirdGroup / 2 + thirdGroup % 2;
        int numOfDesks = desks1Group + desks2Group + desks3Group;
        System.out.println(numOfDesks);
    }
}