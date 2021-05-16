
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();
        System.out.println(word.startsWith("j"));
    }
}