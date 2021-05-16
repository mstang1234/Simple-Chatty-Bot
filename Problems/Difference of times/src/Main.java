import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hoursIn = scanner.nextInt();
        int minutesIn = scanner.nextInt();
        int secondsIn = scanner.nextInt();
        int hoursOut = scanner.nextInt();
        int minutesOut = scanner.nextInt();
        int secondsOut = scanner.nextInt();
        int timeIn = hoursIn * 3600 + minutesIn * 60 + secondsIn;
        int timeOut = hoursOut * 3600 + minutesOut * 60 + secondsOut;
        System.out.println(timeOut - timeIn);
    }
}