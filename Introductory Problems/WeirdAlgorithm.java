import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        while (n != 1) {
            sb.append(n);
            sb.append(" ");
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
        }
        sb.append(1);
        System.out.println(sb);
    }
}