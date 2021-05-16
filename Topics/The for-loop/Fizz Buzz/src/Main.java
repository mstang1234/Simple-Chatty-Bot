import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String fizzbuzz;
        for (int i = a; i <= b; i++) {
            fizzbuzz = i % 15 == 0 ? "FizzBuzz" :
                    i % 5 == 0 ? "Buzz" :
                            i % 3 == 0 ? "Fizz" : String.valueOf(i);
//            System.out.printf(fizzbuzz + "%n", i);
            System.out.println(fizzbuzz);
        }
    }
}