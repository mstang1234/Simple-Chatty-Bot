import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int counter = 0;
        int way = 0;
        //System.out.println("Pole height:");
        int h = scanner.nextInt();
//        if (H <= 0 || H >= 100) {
//            //System.out.println("Wrong value, again:");
//            H = scanner.nextInt();
//        }
        //System.out.println("Way up, lesser than height:");
        int day = scanner.nextInt();
//        if (day >= H || day <= 0) {
//            //System.out.println("Wrong value, again:");
//            day = scanner.nextInt();
//        }
        //System.out.println("Way down, lesser than way up");
        int night = scanner.nextInt();
//        if (night >= day || night <= 0) {
//            //System.out.println("Wrong value, again:");
//            night = scanner.nextInt();
//        }
        way += day;
        counter += 1;
        while (way < h) {
            way -= night;
            way += day;
            counter += 1;
        }
        System.out.println(counter);
    }
}