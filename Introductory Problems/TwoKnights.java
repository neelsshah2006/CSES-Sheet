import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            long sq = (long) i * i;
            long a = ((sq * (sq - 1)) / 2) - (4L * (i - 1) * (i - 2));
            sb.append(a);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
