import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        while (n != 0) {
            count++;
            n = in.nextInt();
        }
        System.out.println(count);
    }
}
