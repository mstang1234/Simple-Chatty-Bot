//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];
        for (int i = 0; i < 3; i++) {
            words[i] = scanner.next();
        }
        for (int i = 2; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}