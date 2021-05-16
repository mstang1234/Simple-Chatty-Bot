import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String something = scan.nextLine();
//        String newString = "";
//        for (int i = 0; i < something.length(); i++) {
//            if (something.charAt(i) == 'a') {
//                newString += 'b';
//            } else {
//                newString += something.charAt(i);
//            }
//        }
//        System.out.println(newString);
        System.out.println(something.replace('a', 'b'));
    }
}
