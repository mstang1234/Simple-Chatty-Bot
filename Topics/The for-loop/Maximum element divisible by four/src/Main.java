import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int maks = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] % 4 == 0 && nums[i] > maks) {
                maks = nums[i];
            }
        }
        System.out.println(maks);
    }
}