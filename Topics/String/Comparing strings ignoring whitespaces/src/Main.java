import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        System.out.println(first.replaceAll(" ", "").trim().equals(second.replaceAll(" ", "").trim()));
    }
}