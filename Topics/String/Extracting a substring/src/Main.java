import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(word.substring(a, b + 1));
    }
}