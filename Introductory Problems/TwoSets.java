import java.util.ArrayList;
import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long sum = ((long) n * (n + 1)) / 2;
        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        long target = sum / 2;
        ArrayList<Integer> l = new ArrayList<>();
        int x = 1;
        while (target >= n + 1) {
            l.add(x);
            l.add(n - x + 1);
            x++;
            target -= (n + 1);
        }

        if (target != 0)
            l.add((int) target);

        StringBuilder sb = new StringBuilder("YES\n");
        sb.append(l.size());
        sb.append("\n");
        for (int num : l) {
            sb.append(num + " ");
        }

        sb.append("\n");
        sb.append(n - l.size());
        sb.append("\n");
        for (int i = x; i <= n - x + 1; i++) {
            if (i == target)
                continue;
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
